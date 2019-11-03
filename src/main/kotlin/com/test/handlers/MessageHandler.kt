package com.test.handlers

import com.google.gson.Gson
import com.test.model.SymbolPrice

class MessageHandler(message: String) {

    var result : SymbolPrice? = null

    init {
        if (message.contains("askPrice") && message.contains("bidPrice")) {
            result = Gson().fromJson(message, SymbolPrice::class.java)
            println(result.toString())
        }
    }
}