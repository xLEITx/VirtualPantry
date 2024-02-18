package com.leit.virtualpantry.di

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import com.leit.virtualpantry.feature_pantry.data.data_source.PantryDatabase
import com.leit.virtualpantry.feature_pantry.data.repository.PantryRepositoryImpl
import com.leit.virtualpantry.feature_pantry.domain.repository.PantryRepository
import com.leit.virtualpantry.feature_pantry.domain.use_case.DeleteShelf
import com.leit.virtualpantry.feature_pantry.domain.use_case.GetShelves
import com.leit.virtualpantry.feature_pantry.domain.use_case.ShelvesScreenUseCases
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
    fun providePantryDatabase(app:Application):PantryDatabase{
        return Room.databaseBuilder(
            app,
            PantryDatabase::class.java,
            PantryDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db:PantryDatabase):PantryRepository{
        return PantryRepositoryImpl(db.pantryDao)
    }

    @Provides
    @Singleton
    fun provideShelvesScreenUseCases(repository:PantryRepository):ShelvesScreenUseCases{
        return ShelvesScreenUseCases(
            getShelves = GetShelves(repository),
            deleteShelf = DeleteShelf(repository)
        )
    }
}