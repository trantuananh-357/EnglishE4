package com.example.englishe4.model

// In Android Studio, add the following dependency to your build.gradle.kts file:
// implementation("com.google.ai.client.generativeai:generativeai:0.7.0")
//
// See the Getting Started guide for more information:
// https://ai.google.dev/gemini-api/docs/get-started/android

// Add the following code to your Kotlin source code
import com.google.ai.client.generativeai.BuildConfig
import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.content
import com.google.ai.client.generativeai.type.generationConfig

val model = GenerativeModel(
    "gemini-1.0-pro",
    // Retrieve API key as an environmental variable defined in a Build Configuration
    // see https://github.com/google/secrets-gradle-plugin for further instructions
    "AIzaSyB_59fjCUN_vGW8FnPf5CZdl267_yfiOBs",
    generationConfig = generationConfig {
        temperature = 0.9f
        topK = 0
        topP = 1f
        maxOutputTokens = 2048
        responseMimeType = "text/plain"
    },
    // safetySettings = Adjust safety settings
    // See https://ai.google.dev/gemini-api/docs/safety-settings
)

suspend fun ResponseData(word : String): String {
    return model.generateContent(
        content() {
            text("input: ")
            text(
                "output: {\n  \"entry\": \"pla\",\n  \"response\": \"play\",\n  \"status\": \"success\",\n  \"data\": {\n    \"phonetic\": \"/pleɪ/\",\n    \"definitions\": [\n      {\n        \"partOfSpeech\": \"verb\",\n        \"definition_en\": \"Engage in activity for enjoyment and recreation.\",\n        \"definition_vi\": \"Tham gia vào hoạt động vui chơi và giải trí.\",\n        \"examples\": [\n          {\n            \"example_en\": \"She loves to play with her toys.\",\n            \"example_vi\": \"Cô ấy rất thích chơi với đồ chơi của mình.\"\n          },\n          {\n            \"example_en\": \"They are playing football in the park.\",\n            \"example_vi\": \"Họ đang chơi bóng đá ở công viên.\"\n          }\n        ]\n      }\n    ],\n    \"antonyms\": [\n      {\n        \"word\": \"work\",\n        \"phonetic\": \"/wɜːrk/\",\n        \"definitions\": [\n          {\n            \"partOfSpeech\": \"verb\",\n            \"definition_en\": \"Engage in activity involving mental or physical effort done in order to achieve a purpose or result.\",\n            \"definition_vi\": \"Tham gia vào hoạt động đòi hỏi nỗ lực về tinh thần hoặc vật chất nhằm đạt được mục đích hoặc kết quả.\",\n            \"examples\": [\n              {\n                \"example_en\": \"She works in an office.\",\n                \"example_vi\": \"Cô ấy làm việc trong văn phòng.\"\n              },\n              {\n                \"example_en\": \"He doesn't play much; he prefers to work.\",\n                \"example_vi\": \"Anh ấy không chơi nhiều; anh ấy thích làm việc hơn.\"\n              }\n            ]\n          }\n        ]\n      },\n      {\n        \"word\": \"study\",\n        \"phonetic\": \"/ˈstʌdi/\",\n        \"definitions\": [\n          {\n            \"partOfSpeech\": \"verb\",\n            \"definition_en\": \"Apply oneself to learning particular subject or branch of learning, especially with formal preparation for an examination.\",\n            \"definition_vi\": \"Tập trung học hành một môn học cụ thể hoặc một lĩnh vực học, đặc biệt là chuẩn bị hình thức cho kỳ thi.\",\n            \"examples\": [\n              {\n                \"example_en\": \"She studies hard for her exams.\",\n                \"example_vi\": \"Cô ấy học hành chăm chỉ cho kỳ thi của mình.\"\n              },\n              {\n                \"example_en\": \"They don't play games during exam week; they only study.\",\n                \"example_vi\": \"Họ không chơi game trong tuần thi; họ chỉ học hành.\"\n              }\n            ]\n          }\n        ]\n      },\n      {\n        \"word\": \"behave\",\n        \"phonetic\": \"/bɪˈheɪv/\",\n        \"definitions\": [\n          {\n            \"partOfSpeech\": \"verb\",\n            \"definition_en\": \"Act or conduct oneself in a specified way, especially towards others.\",\n            \"definition_vi\": \"Hành xử theo cách được chỉ định, đặc biệt là đối với người khác.\",\n            \"examples\": [\n              {\n                \"example_en\": \"Children should learn to behave in public places.\",\n                \"example_vi\": \"Trẻ em nên học cách cư xử trong các nơi công cộng.\"\n              },\n              {\n                \"example_en\": \"If they don't play nicely, they will have to learn how to behave.\",\n                \"example_vi\": \"Nếu họ không chơi đẹp, họ sẽ phải học cách cư xử.\"\n              }\n            ]\n          }\n        ]\n      }\n    ]\n  }\n}"
            )
            text("input: ")
            text(
                "output: {\n  \"entry\": \"pla\",\n  \"response\": \"play\",\n  \"status\": \"success\",\n  \"data\": {\n    \"phonetic\": \"/pleɪ/\",\n    \"definitions\": [\n      {\n        \"partOfSpeech\": \"verb\",\n        \"definition_en\": \"Engage in activity for enjoyment and recreation.\",\n        \"definition_vi\": \"Tham gia vào hoạt động vui chơi và giải trí.\",\n        \"examples\": [\n          {\n            \"example_en\": \"She loves to play with her toys.\",\n            \"example_vi\": \"Cô ấy rất thích chơi với đồ chơi của mình.\"\n          },\n          {\n            \"example_en\": \"They are playing football in the park.\",\n            \"example_vi\": \"Họ đang chơi bóng đá ở công viên.\"\n          }\n        ]\n      }\n    ],\n    \"antonyms\": [\n      {\n        \"word\": \"work\",\n        \"phonetic\": \"/wɜːrk/\",\n        \"definitions\": [\n          {\n            \"partOfSpeech\": \"verb\",\n            \"definition_en\": \"Engage in activity involving mental or physical effort done in order to achieve a purpose or result.\",\n            \"definition_vi\": \"Tham gia vào hoạt động đòi hỏi nỗ lực về tinh thần hoặc vật chất nhằm đạt được mục đích hoặc kết quả.\",\n            \"examples\": [\n              {\n                \"example_en\": \"She works in an office.\",\n                \"example_vi\": \"Cô ấy làm việc trong văn phòng.\"\n              },\n              {\n                \"example_en\": \"He doesn't play much; he prefers to work.\",\n                \"example_vi\": \"Anh ấy không chơi nhiều; anh ấy thích làm việc hơn.\"\n              }\n            ]\n          }\n        ]\n      },\n      {\n        \"word\": \"study\",\n        \"phonetic\": \"/ˈstʌdi/\",\n        \"definitions\": [\n          {\n            \"partOfSpeech\": \"verb\",\n            \"definition_en\": \"Apply oneself to learning particular subject or branch of learning, especially with formal preparation for an examination.\",\n            \"definition_vi\": \"Tập trung học hành một môn học cụ thể hoặc một lĩnh vực học, đặc biệt là chuẩn bị hình thức cho kỳ thi.\",\n            \"examples\": [\n              {\n                \"example_en\": \"She studies hard for her exams.\",\n                \"example_vi\": \"Cô ấy học hành chăm chỉ cho kỳ thi của mình.\"\n              },\n              {\n                \"example_en\": \"They don't play games during exam week; they only study.\",\n                \"example_vi\": \"Họ không chơi game trong tuần thi; họ chỉ học hành.\"\n              }\n            ]\n          }\n        ]\n      },\n      {\n        \"word\": \"behave\",\n        \"phonetic\": \"/bɪˈheɪv/\",\n        \"definitions\": [\n          {\n            \"partOfSpeech\": \"verb\",\n            \"definition_en\": \"Act or conduct oneself in a specified way, especially towards others.\",\n            \"definition_vi\": \"Hành xử theo cách được chỉ định, đặc biệt là đối với người khác.\",\n            \"examples\": [\n              {\n                \"example_en\": \"Children should learn to behave in public places.\",\n                \"example_vi\": \"Trẻ em nên học cách cư xử trong các nơi công cộng.\"\n              },\n              {\n                \"example_en\": \"If they don't play nicely, they will have to learn how to behave.\",\n                \"example_vi\": \"Nếu họ không chơi đẹp, họ sẽ phải học cách cư xử.\"\n              }\n            ]\n          }\n        ]\n      }\n    ]\n  }\n}"
            )
            text("input: funny")
            text(
                "output: {\n  \"entry\": \"funy\",\n  \"response\": \"funny\",\n  \"status\": \"success\",\n  \"data\": {\n    \"phonetic\": \"/ˈfʌni/\",\n    \"definitions\": [\n      {\n        \"partOfSpeech\": \"adjective\",\n        \"definition_en\": \"Causing laughter or amusement; humorous.\",\n        \"definition_vi\": \"Gây cười hoặc vui nhộn; hài hước.\",\n        \"examples\": [\n          {\n            \"example_en\": \"She told a funny joke that made everyone laugh.\",\n            \"example_vi\": \"Cô ấy kể một câu chuyện cười khiến mọi người đều cười.\"\n          },\n          {\n            \"example_en\": \"The movie was so funny that I couldn't stop laughing.\",\n            \"example_vi\": \"Bộ phim quá hài hước đến nỗi tôi không thể ngừng cười.\"\n          }\n        ]\n      }\n    ],\n    \"antonyms\": [\n      {\n        \"word\": \"serious\",\n        \"phonetic\": \"/ˈsɪəriəs/\",\n        \"definitions\": [\n          {\n            \"partOfSpeech\": \"adjective\",\n            \"definition_en\": \"Showing deep thought, sincere in intention, purpose, or effort.\",\n            \"definition_vi\": \"Thể hiện sự suy nghĩ sâu sắc, chân thành trong ý định, mục đích hoặc nỗ lực.\",\n            \"examples\": [\n              {\n                \"example_en\": \"The situation is serious and requires immediate attention.\",\n                \"example_vi\": \"Tình hình rất nghiêm trọng và cần được chú ý ngay lập tức.\"\n              },\n              {\n                \"example_en\": \"She has a serious attitude towards her work.\",\n                \"example_vi\": \"Cô ấy có thái độ nghiêm túc đối với công việc của mình.\"\n              }\n            ]\n          }\n        ]\n      },\n      {\n        \"word\": \"sad\",\n        \"phonetic\": \"/sæd/\",\n        \"definitions\": [\n          {\n            \"partOfSpeech\": \"adjective\",\n            \"definition_en\": \"Feeling or showing sorrow; unhappy.\",\n            \"definition_vi\": \"Cảm thấy hoặc thể hiện nỗi buồn; không vui.\",\n            \"examples\": [\n              {\n                \"example_en\": \"He looked sad when he heard the news.\",\n                \"example_vi\": \"Anh ấy trông buồn khi nghe tin tức.\"\n              },\n              {\n                \"example_en\": \"It's a sad movie with a heartbreaking ending.\",\n                \"example_vi\": \"Đó là một bộ phim buồn với một cái kết đau lòng.\"\n              }\n            ]\n          }\n        ]\n      },\n      {\n        \"word\": \"boring\",\n        \"phonetic\": \"/ˈbɔːrɪŋ/\",\n        \"definitions\": [\n          {\n            \"partOfSpeech\": \"adjective\",\n            \"definition_en\": \"Not interesting; tedious.\",\n            \"definition_vi\": \"Không hấp dẫn; nhàm chán.\",\n            \"examples\": [\n              {\n                \"example_en\": \"The lecture was so boring that many people fell asleep.\",\n                \"example_vi\": \"Bài giảng quá nhàm chán khiến nhiều người ngủ gật.\"\n              },\n              {\n                \"example_en\": \"He finds his job very boring.\",\n                \"example_vi\": \"Anh ấy thấy công việc của mình rất nhàm chán.\"\n              }\n            ]\n          }\n        ]\n      }\n    ]\n  }\n}"
            )
            text("input: orange")
            text("output: {\n  \"entry\": \"orange\",\n  \"response\": \"orange\",\n  \"status\": \"success\",\n  \"data\": {\n    \"phonetic\": \"/ˈɒrɪndʒ/\",\n    \"definitions\": [\n      {\n        \"partOfSpeech\": \"noun\",\n        \"definition_en\": \"A round juicy citrus fruit with a tough bright reddish-yellow rind.\",\n        \"definition_vi\": \"Một loại trái cây có vỏ ngoài màu cam sáng, tròn và nhiều nước.\",\n        \"examples\": [\n          {\n            \"example_en\": \"She peeled an orange and shared it with her friends.\",\n            \"example_vi\": \"Cô ấy gọt một quả cam và chia sẻ nó với bạn bè.\"\n          },\n          {\n            \"example_en\": \"He bought a basket of oranges from the market.\",\n            \"example_vi\": \"Anh ấy mua một giỏ cam từ chợ.\"\n          }\n        ]\n      }\n    ],\n    \"antonyms\": []\n  }\n}")
            text("input: phone")
            text(
                "output: {\n  \"entry\": \"phone\",\n  \"response\": \"phone\",\n  \"status\": \"success\",\n  \"data\": {\n    \"phonetic\": \"/foʊn/\",\n    \"definitions\": [\n      {\n        \"partOfSpeech\": \"noun\",\n        \"definition_en\": \"A device that converts sound, typically of voice or music, into electrical signals for transmission by wire or radio.\",\n        \"definition_vi\": \"Một thiết bị chuyển đổi âm thanh, thường là giọng nói hoặc nhạc, thành tín hiệu điện để truyền qua dây hoặc sóng vô tuyến.\",\n        \"examples\": [\n          {\n            \"example_en\": \"He forgot his phone at home.\",\n            \"example_vi\": \"Anh ấy quên điện thoại ở nhà.\"\n          },\n          {\n            \"example_en\": \"She answered the phone and talked to her friend.\",\n            \"example_vi\": \"Cô ấy nhấc điện thoại và nói chuyện với bạn.\"\n          }\n        ]\n      },\n      {\n        \"partOfSpeech\": \"verb\",\n        \"definition_en\": \"To make a telephone call to someone.\",\n        \"definition_vi\": \"Gọi điện thoại cho ai đó.\",\n        \"examples\": [\n          {\n            \"example_en\": \"He will phone his parents tonight.\",\n            \"example_vi\": \"Anh ấy sẽ gọi điện cho bố mẹ vào tối nay.\"\n          },\n          {\n            \"example_en\": \"Please phone me when you arrive.\",\n            \"example_vi\": \"Vui lòng gọi cho tôi khi bạn đến.\"\n          }\n        ]\n      }\n    ],\n    \"antonyms\": []\n  }\n}"
            )
            text("input: phon")
            text(
                "output: {\n  \"entry\": \"phon\",\n  \"response\": \"phone\",\n  \"status\": \"success\",\n  \"data\": {\n    \"phonetic\": \"/foʊn/\",\n    \"definitions\": [\n      {\n        \"partOfSpeech\": \"noun\",\n        \"definition_en\": \"A device that converts sound, typically of voice or music, into electrical signals for transmission by wire or radio.\",\n        \"definition_vi\": \"Một thiết bị chuyển đổi âm thanh, thường là giọng nói hoặc nhạc, thành tín hiệu điện để truyền qua dây hoặc sóng vô tuyến.\",\n        \"examples\": [\n          {\n            \"example_en\": \"He forgot his phone at home.\",\n            \"example_vi\": \"Anh ấy quên điện thoại ở nhà.\"\n          },\n          {\n            \"example_en\": \"She answered the phone and talked to her friend.\",\n            \"example_vi\": \"Cô ấy nhấc điện thoại và nói chuyện với bạn.\"\n          }\n        ]\n      },\n      {\n        \"partOfSpeech\": \"verb\",\n        \"definition_en\": \"To make a telephone call to someone.\",\n        \"definition_vi\": \"Gọi điện thoại cho ai đó.\",\n        \"examples\": [\n          {\n            \"example_en\": \"He will phone his parents tonight.\",\n            \"example_vi\": \"Anh ấy sẽ gọi điện cho bố mẹ vào tối nay.\"\n          },\n          {\n            \"example_en\": \"Please phone me when you arrive.\",\n            \"example_vi\": \"Vui lòng gọi cho tôi khi bạn đến.\"\n          }\n        ]\n      }\n    ],\n    \"antonyms\": []\n  }\n}"
            )
            text("input: high")
            text(
                "output: {\n  \"entry\": \"high\",\n  \"response\": \"high\",\n  \"status\": \"success\",\n  \"data\": {\n    \"phonetic\": \"/haɪ/\",\n    \"definitions\": [\n      {\n        \"partOfSpeech\": \"adjective\",\n        \"definition_en\": \"Of great vertical extent; lofty; tall.\",\n        \"definition_vi\": \"Cao, có độ cao lớn.\",\n        \"examples\": [\n          {\n            \"example_en\": \"The mountains are very high.\",\n            \"example_vi\": \"Những ngọn núi rất cao.\"\n          },\n          {\n            \"example_en\": \"He climbed to the top of the high tree.\",\n            \"example_vi\": \"Anh ấy leo lên đỉnh cây cao.\"\n          }\n        ]\n      },\n      {\n        \"partOfSpeech\": \"adjective\",\n        \"definition_en\": \"Extending far upward; having a specified height when measured from base to top.\",\n        \"definition_vi\": \"Mở rộng lên cao; có chiều cao cụ thể khi được đo từ đáy đến đỉnh.\",\n        \"examples\": [\n          {\n            \"example_en\": \"The ceiling is 3 meters high.\",\n            \"example_vi\": \"Trần nhà cao 3 mét.\"\n          },\n          {\n            \"example_en\": \"She reached for the high shelf to get the book.\",\n            \"example_vi\": \"Cô ấy vươn tới giá sách cao để lấy sách.\"\n          }\n        ]\n      },\n      {\n        \"partOfSpeech\": \"adjective\",\n        \"definition_en\": \"Situated far above the ground, sea level, or another point of reference.\",\n        \"definition_vi\": \"Được đặt cao hơn đất, mực nước biển hoặc một điểm tham chiếu khác.\",\n        \"examples\": [\n          {\n            \"example_en\": \"The airplane flew at a high altitude.\",\n            \"example_vi\": \"Máy bay bay ở độ cao cao.\"\n          },\n          {\n            \"example_en\": \"The city is located at a high elevation.\",\n            \"example_vi\": \"Thành phố nằm ở độ cao lớn.\"\n          }\n        ]\n      },\n      {\n        \"partOfSpeech\": \"adverb\",\n        \"definition_en\": \"At or to a considerable or specified height.\",\n        \"definition_vi\": \"Ở hoặc tới một chiều cao đáng kể hoặc cụ thể.\",\n        \"examples\": [\n          {\n            \"example_en\": \"They jumped high to catch the ball.\",\n            \"example_vi\": \"Họ nhảy cao để bắt trái bóng.\"\n          },\n          {\n            \"example_en\": \"Prices have risen high recently.\",\n            \"example_vi\": \"Giá cả đã tăng cao gần đây.\"\n          }\n        ]\n      }\n    ],\n    \"antonyms\": [\n      {\n        \"word\": \"low\",\n        \"phonetic\": \"/loʊ/\",\n        \"definitions\": [\n          {\n            \"partOfSpeech\": \"adjective\",\n            \"definition_en\": \"Of less than average height from top to bottom or to the top from the ground.\",\n            \"definition_vi\": \"Có chiều cao thấp hơn trung bình từ trên xuống hoặc đến đỉnh từ mặt đất.\",\n            \"examples\": [\n              {\n                \"example_en\": \"The table is low enough for children to reach easily.\",\n                \"example_vi\": \"Bàn thấp đủ để trẻ em dễ dàng tiếp cận.\"\n              },\n              {\n                \"example_en\": \"She prefers low heels to high heels.\",\n                \"example_vi\": \"Cô ấy thích giày cao gót thấp hơn giày cao gót.\"\n              }\n            ]\n          }\n        ]\n      },\n      {\n        \"word\": \"short\",\n        \"phonetic\": \"/ʃɔːrt/\",\n        \"definitions\": [\n          {\n            \"partOfSpeech\": \"adjective\",\n            \"definition_en\": \"Measuring a small distance from end to end.\",\n            \"definition_vi\": \"Đo khoảng cách nhỏ từ đầu đến cuối.\",\n            \"examples\": [\n              {\n                \"example_en\": \"She is too short to reach the top shelf.\",\n                \"example_vi\": \"Cô ấy quá ngắn để đến giá trên cùng.\"\n              },\n              {\n                \"example_en\": \"The skirt is too short for the occasion.\",\n                \"example_vi\": \"Chiếc váy quá ngắn cho dịp này.\"\n              }\n            ]\n          }\n        ]\n      },\n      {\n        \"word\": \"deep\",\n        \"phonetic\": \"/diːp/\",\n        \"definitions\": [\n          {\n            \"partOfSpeech\": \"adjective\",\n            \"definition_en\": \"Extending far downward from the top or surface.\",\n            \"definition_vi\": \"Mở rộng xuống xa từ đỉnh hoặc mặt phẳng.\",\n            \"examples\": [\n              {\n                \"example_en\": \"The lake is very deep.\",\n                \"example_vi\": \"Hồ rất sâu.\"\n              },\n              {\n                \"example_en\": \"He dug a deep hole in the garden.\",\n                \"example_vi\": \"Anh ấy đào một cái hố sâu trong vườn.\"\n              }\n            ]\n          }\n        ]\n      }\n    ]\n  }\n}"
            )
            text("input: hig")
            text(
                "output: {\n  \"entry\": \"high\",\n  \"response\": \"high\",\n  \"status\": \"success\",\n  \"data\": {\n    \"phonetic\": \"/haɪ/\",\n    \"definitions\": [\n      {\n        \"partOfSpeech\": \"adjective\",\n        \"definition_en\": \"Of great vertical extent; lofty; tall.\",\n        \"definition_vi\": \"Cao, có độ cao lớn.\",\n        \"examples\": [\n          {\n            \"example_en\": \"The mountains are very high.\",\n            \"example_vi\": \"Những ngọn núi rất cao.\"\n          },\n          {\n            \"example_en\": \"He climbed to the top of the high tree.\",\n            \"example_vi\": \"Anh ấy leo lên đỉnh cây cao.\"\n          }\n        ]\n      },\n      {\n        \"partOfSpeech\": \"adjective\",\n        \"definition_en\": \"Extending far upward; having a specified height when measured from base to top.\",\n        \"definition_vi\": \"Mở rộng lên cao; có chiều cao cụ thể khi được đo từ đáy đến đỉnh.\",\n        \"examples\": [\n          {\n            \"example_en\": \"The ceiling is 3 meters high.\",\n            \"example_vi\": \"Trần nhà cao 3 mét.\"\n          },\n          {\n            \"example_en\": \"She reached for the high shelf to get the book.\",\n            \"example_vi\": \"Cô ấy vươn tới giá sách cao để lấy sách.\"\n          }\n        ]\n      },\n      {\n        \"partOfSpeech\": \"adjective\",\n        \"definition_en\": \"Situated far above the ground, sea level, or another point of reference.\",\n        \"definition_vi\": \"Được đặt cao hơn đất, mực nước biển hoặc một điểm tham chiếu khác.\",\n        \"examples\": [\n          {\n            \"example_en\": \"The airplane flew at a high altitude.\",\n            \"example_vi\": \"Máy bay bay ở độ cao cao.\"\n          },\n          {\n            \"example_en\": \"The city is located at a high elevation.\",\n            \"example_vi\": \"Thành phố nằm ở độ cao lớn.\"\n          }\n        ]\n      },\n      {\n        \"partOfSpeech\": \"adverb\",\n        \"definition_en\": \"At or to a considerable or specified height.\",\n        \"definition_vi\": \"Ở hoặc tới một chiều cao đáng kể hoặc cụ thể.\",\n        \"examples\": [\n          {\n            \"example_en\": \"They jumped high to catch the ball.\",\n            \"example_vi\": \"Họ nhảy cao để bắt trái bóng.\"\n          },\n          {\n            \"example_en\": \"Prices have risen high recently.\",\n            \"example_vi\": \"Giá cả đã tăng cao gần đây.\"\n          }\n        ]\n      }\n    ],\n    \"antonyms\": [\n      {\n        \"word\": \"low\",\n        \"phonetic\": \"/loʊ/\",\n        \"definitions\": [\n          {\n            \"partOfSpeech\": \"adjective\",\n            \"definition_en\": \"Of less than average height from top to bottom or to the top from the ground.\",\n            \"definition_vi\": \"Có chiều cao thấp hơn trung bình từ trên xuống hoặc đến đỉnh từ mặt đất.\",\n            \"examples\": [\n              {\n                \"example_en\": \"The table is low enough for children to reach easily.\",\n                \"example_vi\": \"Bàn thấp đủ để trẻ em dễ dàng tiếp cận.\"\n              },\n              {\n                \"example_en\": \"She prefers low heels to high heels.\",\n                \"example_vi\": \"Cô ấy thích giày cao gót thấp hơn giày cao gót.\"\n              }\n            ]\n          }\n        ]\n      },\n      {\n        \"word\": \"short\",\n        \"phonetic\": \"/ʃɔːrt/\",\n        \"definitions\": [\n          {\n            \"partOfSpeech\": \"adjective\",\n            \"definition_en\": \"Measuring a small distance from end to end.\",\n            \"definition_vi\": \"Đo khoảng cách nhỏ từ đầu đến cuối.\",\n            \"examples\": [\n              {\n                \"example_en\": \"She is too short to reach the top shelf.\",\n                \"example_vi\": \"Cô ấy quá ngắn để đến giá trên cùng.\"\n              },\n              {\n                \"example_en\": \"The skirt is too short for the occasion.\",\n                \"example_vi\": \"Chiếc váy quá ngắn cho dịp này.\"\n              }\n            ]\n          }\n        ]\n      },\n      {\n        \"word\": \"deep\",\n        \"phonetic\": \"/diːp/\",\n        \"definitions\": [\n          {\n            \"partOfSpeech\": \"adjective\",\n            \"definition_en\": \"Extending far downward from the top or surface.\",\n            \"definition_vi\": \"Mở rộng xuống xa từ đỉnh hoặc mặt phẳng.\",\n            \"examples\": [\n              {\n                \"example_en\": \"The lake is very deep.\",\n                \"example_vi\": \"Hồ rất sâu.\"\n              },\n              {\n                \"example_en\": \"He dug a deep hole in the garden.\",\n                \"example_vi\": \"Anh ấy đào một cái hố sâu trong vườn.\"\n              }\n            ]\n          }\n        ]\n      }\n    ]\n  }\n}"
            )
            text("input: musi")
            text("output: {\n  \"entry\": \"musi\",\n  \"response\": \"music\",\n  \"status\": \"success\",\n  \"data\": {\n    \"phonetic\": \"/ˈmjuːzɪk/\",\n    \"definitions\": [\n      {\n        \"partOfSpeech\": \"noun\",\n        \"definition_en\": \"An art form whose medium is sound organized in time.\",\n        \"definition_vi\": \"Một hình thức nghệ thuật có phương tiện là âm thanh được tổ chức theo thời gian.\",\n        \"examples\": [\n          {\n            \"example_en\": \"He loves to listen to music.\",\n            \"example_vi\": \"Anh ấy rất thích nghe nhạc.\"\n          },\n          {\n            \"example_en\": \"She plays the piano and enjoys classical music.\",\n            \"example_vi\": \"Cô ấy chơi piano và thích nhạc cổ điển.\"\n          }\n        ]\n      }\n    ],\n    \"antonyms\": []\n  }\n}")
            text("input: music")
            text("output: {\n  \"entry\": \"musi\",\n  \"response\": \"music\",\n  \"status\": \"success\",\n  \"data\": {\n    \"phonetic\": \"/ˈmjuːzɪk/\",\n    \"definitions\": [\n      {\n        \"partOfSpeech\": \"noun\",\n        \"definition_en\": \"An art form whose medium is sound organized in time.\",\n        \"definition_vi\": \"Một hình thức nghệ thuật có phương tiện là âm thanh được tổ chức theo thời gian.\",\n        \"examples\": [\n          {\n            \"example_en\": \"He loves to listen to music.\",\n            \"example_vi\": \"Anh ấy rất thích nghe nhạc.\"\n          },\n          {\n            \"example_en\": \"She plays the piano and enjoys classical music.\",\n            \"example_vi\": \"Cô ấy chơi piano và thích nhạc cổ điển.\"\n          }\n        ]\n      }\n    ],\n    \"antonyms\": []\n  }\n}")
            text("input: $word")
            text("output: ")
        }
    ).text.toString()
}

