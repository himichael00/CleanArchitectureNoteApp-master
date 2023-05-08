package com.plcoding.cleanarchitecturenoteapp.features.data.data_sources

import androidx.room.Database
import androidx.room.RoomDatabase
import com.plcoding.cleanarchitecturenoteapp.features.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabases: RoomDatabase() {
    abstract val noteDao: NoteDao
}