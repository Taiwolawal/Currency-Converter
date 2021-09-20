package com.example.android.currencyconverter

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {

    @GET("/convert")
    suspend fun getRates(
        @Query("from") from: String,
        @Query("to") to: String,
        @Query("amount") amount: Float,
        @Query("api_key") api_key: String = BuildConfig.API_KEY
    ): Response<CurrencyResponse>
}