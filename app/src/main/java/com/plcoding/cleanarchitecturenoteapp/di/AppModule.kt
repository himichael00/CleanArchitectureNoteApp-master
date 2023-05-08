package com.plcoding.cleanarchitecturenoteapp.di

import android.app.Application
import android.provider.ContactsContract.CommonDataKinds.Note
import androidx.room.Room
import com.plcoding.cleanarchitecturenoteapp.features.data.data_sources.NoteDatabases
import com.plcoding.cleanarchitecturenoteapp.features.data.repository.NoteRepositoryImpl
import com.plcoding.cleanarchitecturenoteapp.features.domain.repository.NoteRepository
import com.plcoding.cleanarchitecturenoteapp.features.domain.use_case.AddNote
import com.plcoding.cleanarchitecturenoteapp.features.domain.use_case.DeleteNotes
import com.plcoding.cleanarchitecturenoteapp.features.domain.use_case.GetNotes
import com.plcoding.cleanarchitecturenoteapp.features.domain.use_case.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideDatabase(app: Application): NoteDatabases {
        return Room.databaseBuilder(
            app,
            NoteDatabases::class.java,
            NoteDatabases.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabases): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases{
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNotes = DeleteNotes(repository),
            addNote = AddNote(repository)
        )
    }
}