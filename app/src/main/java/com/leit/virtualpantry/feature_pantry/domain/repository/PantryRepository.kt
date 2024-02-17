package com.leit.virtualpantry.feature_pantry.domain.repository

import com.leit.virtualpantry.feature_pantry.domain.model.Item
import com.leit.virtualpantry.feature_pantry.domain.model.Shelf
import kotlinx.coroutines.flow.Flow

interface PantryRepository {

    fun getShelves():Flow<List<Shelf>>

    suspend fun getShelfById(id:Int):Shelf?

    suspend fun insertShelf(shelf: Shelf)

    suspend fun deleteShelf(shelf: Shelf)

    fun getItemsByShelfId(shelfId:Int):Flow<List<Item>>

    suspend fun getItemById(id:Int):Item?

    suspend fun insertItem(item: Item)

    suspend fun deleteItem(item: Item)

    suspend fun deleteAllItemsByShelfId(shelfId: Int)
}