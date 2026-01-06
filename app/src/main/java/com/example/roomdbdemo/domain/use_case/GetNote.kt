package com.example.roomdbdemo.domain.use_case

import com.example.roomdbdemo.domain.model.Note
import com.example.roomdbdemo.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id : Int) : Note? {
        return repository.getNotesById(id)
    }
}
