package com.example.roomdbdemo.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.roomdbdemo.ui.theme.BabyBlue
import com.example.roomdbdemo.ui.theme.LightGreen
import com.example.roomdbdemo.ui.theme.RedOrange
import com.example.roomdbdemo.ui.theme.RedPink
import com.example.roomdbdemo.ui.theme.Violet

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
