package com.example.roomdbdemo.domain.repository

import com.example.roomdbdemo.domain.model.Note
import kotlinx.coroutines.flow.Flow


// Define the Interface Repo which will be implemented later in data layer repo. use the same methods as Dao
interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNotesById(id : Int) : Note?

    suspend fun insertNote(note : Note)

    suspend fun deleteNote(note: Note)
}