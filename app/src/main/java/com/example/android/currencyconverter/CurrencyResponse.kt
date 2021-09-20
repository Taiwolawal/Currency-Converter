package com.example.android.currencyconverter


import com.google.gson.annotations.SerializedName

data class CurrencyResponse(
    @SerializedName("amount")
    val amount: Int,
    @SerializedName("base")
    val base: String,
    @SerializedName("ms")
    val ms: Int,
    @SerializedName("result")
    val result: Result
)