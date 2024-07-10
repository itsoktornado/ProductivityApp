package com.example.productivityapp.feature_note.domain.use_case

import com.example.productivityapp.feature_note.domain.model.InvalidNoteException
import com.example.productivityapp.feature_note.domain.model.Note
import com.example.productivityapp.feature_note.domain.repository.NoteRepository

class AddNoteUseCase(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("Please fill in the title.")
        }

        if (note.content.isBlank()) {
            throw InvalidNoteException("Please fill in the content.")
        }

        repository.insertNote(note)
    }
}