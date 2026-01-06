package com.example.roomdbdemo.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.roomdbdemo.domain.model.Note


// Define Room Database where specify entities ( Tables ) and version of the db.

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase : RoomDatabase() {
    abstract val noteDao : NoteDao
    companion object{
        const val DATABASE_NAME = "notes_db"
    }
}