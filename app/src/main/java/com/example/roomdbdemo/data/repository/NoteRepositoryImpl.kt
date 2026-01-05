package com.example.roomdbdemo.data.repository

import com.example.roomdbdemo.data.data_source.NoteDao
import com.example.roomdbdemo.domain.model.Note
import com.example.roomdbdemo.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl (
    private val dao: NoteDao
): NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNotesById(id: Int): Note? {
        return dao.getNotesById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}