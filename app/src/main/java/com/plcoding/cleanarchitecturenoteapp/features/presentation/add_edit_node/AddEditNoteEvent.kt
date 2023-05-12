package com.plcoding.cleanarchitecturenoteapp.features.presentation.add_edit_node

import androidx.compose.ui.focus.FocusState

sealed class AddEditNoteEvent {
    data class EnteredTitle(val value: String): AddEditNoteEvent()
    data class TitleFocus(val focusState: FocusState): AddEditNoteEvent()
    data class EnteredIdea(val value: String): AddEditNoteEvent()
    data class ContentFocus(val focusState: FocusState): AddEditNoteEvent()
    data class ChangeColor(val color: Int): AddEditNoteEvent()
    object SaveNote: AddEditNoteEvent()
}
