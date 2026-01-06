package com.example.roomdbdemo.domain.use_case

import com.example.roomdbdemo.domain.model.InvalidNoteException
import com.example.roomdbdemo.domain.model.Note
import com.example.roomdbdemo.domain.repository.NoteRepository
import kotlin.jvm.Throws

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note){
        if(note.title.isBlank()){
            throw InvalidNoteException("The Title Of The Note Can't Be Empty!!")
        }
        if(note.content.isBlank()){
            throw InvalidNoteException("The Content of the note can't be empty!!")
        }
        repository.insertNote(note)
    }
}