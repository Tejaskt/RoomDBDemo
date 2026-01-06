package com.example.roomdbdemo.domain.use_case

import com.example.roomdbdemo.domain.model.Note
import com.example.roomdbdemo.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note){
        repository.deleteNote(note)
    }
}