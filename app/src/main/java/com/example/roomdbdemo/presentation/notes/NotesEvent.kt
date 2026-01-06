package com.example.roomdbdemo.presentation.notes

import com.example.roomdbdemo.domain.model.Note
import com.example.roomdbdemo.domain.utils.NoteOrder

sealed class NotesEvent {

    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note) : NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSection : NotesEvent()
}