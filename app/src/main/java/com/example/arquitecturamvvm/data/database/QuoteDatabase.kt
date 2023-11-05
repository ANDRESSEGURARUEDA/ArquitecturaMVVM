package com.example.arquitecturamvvm.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.arquitecturamvvm.data.database.dao.QuoteDao
import com.example.arquitecturamvvm.data.database.entity.QuoteEntity

@Database(entities = [QuoteEntity::class], version = 1)
abstract class QuoteDatabase: RoomDatabase() {


    abstract fun getQuoteDato(): QuoteDao
}