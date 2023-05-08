package com.plcoding.cleanarchitecturenoteapp.features.presentation.notes

import com.plcoding.cleanarchitecturenoteapp.features.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.features.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order (val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object TogglerOrderSection: NotesEvent()
}
