package com.example.roomdbdemo.presentation.notes

import com.example.roomdbdemo.domain.model.Note
import com.example.roomdbdemo.domain.utils.NoteOrder
import com.example.roomdbdemo.domain.utils.OrderType

data class NotesState(
    val notes : List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible : Boolean = false
    )
