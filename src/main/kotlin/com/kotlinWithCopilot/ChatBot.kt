package com.kotlinWithCopilot

import io.github.dragneelfps.kbot.bot
import io.github.dragneelfps.kbot.generic
import io.github.dragneelfps.kbot.text
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking {
   val bot = bot {
        token = "" // add token here or put in env
        usePolling = true
       pollDelaySeconds = 2

       listeners {
           generic { client, update ->
               val chatId = update.message?.chat?.id!!
               val text = update.message?.text!!
               client.sendMessage(chatId, text)
           }

           text(match = "start") { client, message, _ ->
               val chatId = message.chat?.id!!
               client.sendMessage(chatId, "Let's gooo!!!")
           }

           text(match = """^url (\w*)$""") { client, message, matches ->
               val chatId = message.chat?.id!!
               client.sendMessage(chatId, matches.toString())
           }
       }
   }
    bot.startPolling()
}


