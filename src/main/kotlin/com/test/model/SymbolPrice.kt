package com.test.model

import com.google.gson.annotations.SerializedName

data class SymbolPrice(
    val action: String,
    @SerializedName("data")
    val symbolData: List<Data>,
    val table: String
) {

    override fun toString(): String {
        return symbolData.joinToString(prefix = "", postfix = "", separator = "\n") + " - $action"
    }
}