package com.example.englishe4.model

import com.google.gson.annotations.SerializedName

data class DictionaryEntry(
    @SerializedName("entry") val entry: String?,
    @SerializedName("response") var response: String?,
    @SerializedName("status") val status: String?,
    @SerializedName("data") val data: DictionaryData?
)

data class DictionaryData(
    @SerializedName("phonetic") val phonetic: String?,
    @SerializedName("definitions") val definitions: List<Definition>?,
    @SerializedName("antonyms") val antonyms: List<Antonym>?
)

data class Definition(
    @SerializedName("partOfSpeech") val partOfSpeech: String?,
    @SerializedName("definition_en") val definitionEN: String?,
    @SerializedName("definition_vi") val definitionVI: String?,
    @SerializedName("examples") val examples: List<Example>?
)

data class Example(
    @SerializedName("example_en") val exampleEN: String?,
    @SerializedName("example_vi") val exampleVI: String?
)

data class Antonym(
    @SerializedName("word") val word: String?,
    @SerializedName("phonetic") val phonetic: String?,
    @SerializedName("definitions") val definitions: List<Definition>?,
    @SerializedName("examples") val examples: List<Example>?
)