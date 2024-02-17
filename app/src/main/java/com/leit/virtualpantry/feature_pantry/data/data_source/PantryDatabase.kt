package com.leit.virtualpantry.feature_pantry.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.leit.virtualpantry.feature_pantry.domain.model.Item
import com.leit.virtualpantry.feature_pantry.domain.model.Shelf

@Database(
    entities = [Item::class,Shelf::class],
    version = 1,
    exportSchema = false
)
abstract class PantryDatabase:RoomDatabase() {
    abstract val pantryDao:PantryDao

}