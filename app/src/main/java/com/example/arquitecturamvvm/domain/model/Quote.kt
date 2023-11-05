package com.example.arquitecturamvvm.domain.model

import com.example.arquitecturamvvm.data.database.entity.QuoteEntity
import com.example.arquitecturamvvm.data.model.QuoteModel

data class Quote(val quote: String, val author:String)

fun QuoteModel.toDomain() = Quote(quote, author)
fun QuoteEntity.toDomain() = Quote(quote, author)