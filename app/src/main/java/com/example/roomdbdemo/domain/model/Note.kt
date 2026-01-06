package com.example.roomdbdemo.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.roomdbdemo.ui.theme.BabyBlue
import com.example.roomdbdemo.ui.theme.LightGreen
import com.example.roomdbdemo.ui.theme.RedOrange
import com.example.roomdbdemo.ui.theme.RedPink
import com.example.roomdbdemo.ui.theme.Violet


/*
*   Define Data Class For the Data That will be shown on the note or Fetching from the Api
* */


@Entity
data class Note(
    @PrimaryKey val id: Int? = null,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color : Int,
){

    /* Define Colors for The Notes Background */

    companion object{
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message : String) : Exception(message)