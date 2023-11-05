package com.example.arquitecturamvvm.data.network

import com.example.arquitecturamvvm.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {

    @GET("/.json")
    suspend fun getAllQuotes():Response<List<QuoteModel>>
}