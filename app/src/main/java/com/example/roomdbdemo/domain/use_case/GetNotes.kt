package com.example.roomdbdemo.domain.use_case

import com.example.roomdbdemo.domain.model.Note
import com.example.roomdbdemo.domain.repository.NoteRepository
import com.example.roomdbdemo.domain.utils.NoteOrder
import com.example.roomdbdemo.domain.utils.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetNotes (
    private val repository: NoteRepository
) {

    /*
    * Here we use operator invoke fun which allows this class object to call as a function like
    *
    *   1) without invoke
    *   person p1 = new person();
    *   p1.getName()
    *
    *   2) with invoke
    *   val p1 = Person() // same as
    *   P1() // Same as p1.getName()
    *
    * */
    operator fun invoke(
        noteOrder : NoteOrder = NoteOrder.Date(OrderType.Descending)
    ) : Flow<List<Note>> {
        return repository.getNotes().map { notes ->
            when(noteOrder.orderType){
                is OrderType.Ascending -> {
                    when(noteOrder) {
                        is NoteOrder.Date -> notes.sortedBy { it.timestamp }
                        is NoteOrder.Title -> notes.sortedBy { it.title.lowercase() }
                        is NoteOrder.Color -> notes.sortedBy { it.color }
                    }
                }
                is OrderType.Descending -> {
                    when(noteOrder){
                        is NoteOrder.Title -> notes.sortedByDescending { it.title.lowercase() }
                        is NoteOrder.Date -> notes.sortedByDescending { it.timestamp }
                        is NoteOrder.Color -> notes.sortedByDescending { it.color }
                    }

                }
            }
        }
    }
}