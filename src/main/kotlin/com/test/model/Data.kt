package com.test.model

data class Data(
    val askPrice: Double,
    val bidPrice: Double,
    val impactAskPrice: Double,
    val impactBidPrice: Double,
    val impactMidPrice: Double,
    val lastPriceProtected: Double,
    val midPrice: Double,
    val symbol: String,
    val timestamp: String
) {
    override fun toString(): String {
        return "$symbol askPrice = $askPrice bidPrice = $bidPrice timestamp = $timestamp"
    }
}