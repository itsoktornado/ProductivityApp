package com.example.productivityapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.productivityapp.ui.theme.PastelBlue
import com.example.productivityapp.ui.theme.PastelGreen
import com.example.productivityapp.ui.theme.PastelOrange
import com.example.productivityapp.ui.theme.PastelPink
import com.example.productivityapp.ui.theme.PastelRed
import com.example.productivityapp.ui.theme.PastelYellow

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(PastelRed, PastelPink, PastelOrange, PastelYellow, PastelGreen, PastelBlue)
    }
}

class InvalidNoteException(message: String): Exception(message)