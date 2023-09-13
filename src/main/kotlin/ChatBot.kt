fun main() {
    println("Hello! I'm your chatbot. What's your name?")

    val userName = readLine()
    while(true) {
        print("$userName> ")
        val userMessage = readLine()

        if (userMessage != null) {
            when (userMessage.lowercase()) {
                "hi", "hello" -> println("Chatbot>, Hello!")
                "how are you?" -> println("Chatbot>, I'm just a bunch of code, but thanks for asking!")
                "bye", "exit", "goodbye" -> {
                    println("Chatbot>, Goodbye!")
                    break
                }
                else -> println("Chatbot>, I don't understand.")
            }
        }
    }
}