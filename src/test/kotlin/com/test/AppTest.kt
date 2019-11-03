package com.test

import com.test.handlers.MessageHandler
import org.junit.Test
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class AppTest {

    val first =
        "{\"table\":\"instrument\",\"action\":\"update\",\"data\":[{\"symbol\":\"XBTUSD\",\"lastPriceProtected\":9178.5,\"bidPrice\":9178,\"midPrice\":9178.25,\"askPrice\":9178.5,\"impactBidPrice\":9177.6799,\"impactMidPrice\":9178,\"impactAskPrice\":9178.5223,\"timestamp\":\"2019-11-01T17:37:58.908Z\"}]}"
    val second =
        "{\"table\":\"instrument\",\"action\":\"update\",\"data\":[{\"symbol\":\"XBTUSD\",\"lastPriceProtected\":9192,\"timestamp\":\"2019-11-01T17:33:08.124Z\"}]}"
    val third =
        "{\"table\":\"instrument\",\"action\":\"update\",\"data\":[{\"symbol\":\"XBTUSD\",\"lastPrice\":9192,\"lastTickDirection\":\"PlusTick\",\"lastChangePcnt\":-0.0088,\"timestamp\":\"2019-11-01T17:33:08.124Z\"}]}"
    val forth =
        "{\"table\":\"instrument\",\"action\":\"update\",\"data\":[{\"symbol\":\"XBTUSD\",\"openInterest\":753957449,\"openValue\":8208334747263,\"timestamp\":\"2019-11-01T17:33:05.983Z\"}]}"

    @Test
    fun testIfMessageHandlerWorksCorrectly() {
        assertNotNull(MessageHandler(first).result)
        assertNull(MessageHandler(second).result)
        assertNull(MessageHandler(third).result)
        assertNull(MessageHandler(forth).result)
    }
}
