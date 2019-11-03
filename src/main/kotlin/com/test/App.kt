package com.test

import com.test.controller.WebsocketClient
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.net.ConnectException
import java.net.URI

fun main() {
    runBlocking {
        val job = launch {
            connectToSocket()
        }
        job.join()
    }
}

suspend fun connectToSocket(): Unit = run {
    try {
    WebsocketClient(URI("wss://www.bitmex.com/realtime?subscribe=instrument:XBTUSD"))
    while (true) {
        delay(10)
    }}
    catch (e: ConnectException) {
        println("Timeout connection...")
        connectToSocket()
    }

}
