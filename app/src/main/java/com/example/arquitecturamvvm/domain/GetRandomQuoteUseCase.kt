package com.example.arquitecturamvvm.domain

import com.example.arquitecturamvvm.data.QuoteRepository
import com.example.arquitecturamvvm.domain.model.Quote
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(private val repository: QuoteRepository) {

     suspend operator fun invoke(): Quote?{
       val quotes = repository.getAllQuotesFromDatabase()
        if(!quotes.isNullOrEmpty()){
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }


}