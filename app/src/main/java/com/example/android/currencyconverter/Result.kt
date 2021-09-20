package com.example.android.currencyconverter


import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("rate")
    val rate: Double,
    @SerializedName("USD")
    val uSD: Double
)