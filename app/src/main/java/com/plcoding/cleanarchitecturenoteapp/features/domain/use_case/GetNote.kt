package com.plcoding.cleanarchitecturenoteapp.features.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.features.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.features.domain.repository.NoteRepository

class GetNote (
    private val  repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}