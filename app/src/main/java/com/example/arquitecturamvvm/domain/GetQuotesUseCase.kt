package com.example.arquitecturamvvm.domain

import com.example.arquitecturamvvm.data.QuoteRepository
import com.example.arquitecturamvvm.data.database.entity.toDatabase
import com.example.arquitecturamvvm.data.model.QuoteModel
import com.example.arquitecturamvvm.domain.model.Quote
import javax.inject.Inject


class GetQuotesUseCase @Inject constructor(
    private val repository : QuoteRepository
){


    suspend operator  fun invoke():List<Quote>{
        val quotes = repository.getAllQuotesFromApi()

        return if (quotes.isNotEmpty()){
            repository.clearQuotes()
            repository.insertQuotes(quotes.map { it.toDatabase() })
            quotes
        }else{
            repository.getAllQuotesFromDatabase()
        }
    }

}