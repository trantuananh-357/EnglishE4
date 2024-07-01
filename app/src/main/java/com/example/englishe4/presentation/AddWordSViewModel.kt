package com.example.englishe4.presentation

import android.content.Context
import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.englishe4.R
import com.example.englishe4.common.Trie
import com.example.englishe4.common.TrieNode
import com.example.englishe4.model.DictionaryData
import com.example.englishe4.model.DictionaryEntry
import com.example.englishe4.model.ResponseData
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.io.BufferedReader
import java.io.InputStreamReader
import javax.inject.Inject
import kotlin.math.log


@HiltViewModel
class AddWordSViewModel @Inject constructor(
    private val context: Context
) : ViewModel() {
    private val _searchText = MutableStateFlow("")
    val searchText = _searchText.asStateFlow()

    private val _searchWord = MutableStateFlow("")
    val searchWord = _searchWord.asStateFlow()

    private val _listData = MutableStateFlow<List<DictionaryEntry>>(emptyList())
    val listData: StateFlow<List<DictionaryEntry>> = _listData.asStateFlow()

    private val _dataFind = MutableStateFlow<DictionaryEntry?>(null)
    val dataFind: StateFlow<DictionaryEntry?> = _dataFind
    val trie = Trie()


    var gson: Gson? = null

    // private val _topicCards = MutableStateFlow(readRawTextFile(context))

    init {
        gson = Gson()
        readRawTextFile(context).forEach {
            it.content?.let { it1 -> trie.insert(it1) }
        }
    }

    val topicCards = searchText
        .debounce(300)  // Debounce to reduce search frequency
        .flatMapLatest { query ->
            flow {
                emit(trie.search(query)
                    .take(10)
                    .map {
                    WordCard(content = it)
                })
            }.flowOn(Dispatchers.Default)
        }
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            emptyList()  // Initial value for _topicCards
        )

    private fun readRawTextFile(context: Context): List<WordCard> {
        val inputStream = context.resources.openRawResource(R.raw.wordlist)
        val reader = BufferedReader(InputStreamReader(inputStream))
        val content = mutableListOf<WordCard>()
        var line: String?
        while (reader.readLine().also { line = it } != null) {
            content.add(WordCard(content = line))
        }
        reader.close()
        return content
    }

    fun onTextChange(newValue: String) {
        _searchText.value = newValue
    }

    fun onWordChange(newValue: String) {
        _searchWord.value = newValue
    }

    fun submit(word: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val jsonString = ResponseData(word)
            Log.d("vm", "jsonString: $jsonString")
            gson?.fromJson(jsonString, DictionaryEntry::class.java)?.let { entry ->
                _listData.update { currentList ->
                    currentList + entry
                }
            }
            Log.d("vm", "submit: ${listData.value}")

        }
    }

    fun findDataByItem(word: String) {
        val filteredList = _listData.value.find { item ->
            item.response == word
        }
        _dataFind.value = filteredList
        Log.d("dataVM", "findDataByItem: $word")
        Log.d("dataVM", "findDataByItem: ${listData.value} ")
        Log.d("dataVM", "findDataByItem: ${dataFind.value} ")
    }
}


data class WordCard(
    val content: String?
) {
    fun doesMatchSearchQuery(query: String): Boolean {
        val matchingCombinations = listOf(
            "$content",
        )

        return matchingCombinations.any {
            it.contains(query, ignoreCase = true)
        }
    }
}
