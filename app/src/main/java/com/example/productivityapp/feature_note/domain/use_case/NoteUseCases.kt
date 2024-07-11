package com.example.productivityapp.feature_note.domain.use_case

data class NoteUseCases(
    val getNoteUseCase: GetNoteUseCase, // Get one
    val getNotesUseCase: GetNotesUseCase,   // Get multiple
    val deleteNoteUseCase: DeleteNoteUseCase,
    val addNoteUseCase: AddNoteUseCase
) {
}