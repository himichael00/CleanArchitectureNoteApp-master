package com.plcoding.cleanarchitecturenoteapp.features.presentation.notes

import android.provider.ContactsContract.CommonDataKinds.Note
import com.plcoding.cleanarchitecturenoteapp.features.domain.util.NoteOrder
import com.plcoding.cleanarchitecturenoteapp.features.domain.util.OrderType

data class NoteState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
