package com.leit.virtualpantry.feature_pantry.data.repository

import com.leit.virtualpantry.feature_pantry.data.data_source.PantryDao
import com.leit.virtualpantry.feature_pantry.domain.model.Item
import com.leit.virtualpantry.feature_pantry.domain.model.Shelf
import com.leit.virtualpantry.feature_pantry.domain.repository.PantryRepository
import kotlinx.coroutines.flow.Flow

class PantryRepositoryImpl(
    private val dao:PantryDao
):PantryRepository {
    override fun getShelves(): Flow<List<Shelf>> {
       return dao.getShelves()
    }

    override suspend fun getShelfById(id: Int): Shelf? {
       return dao.getShelfById(id)
    }

    override suspend fun insertShelf(shelf: Shelf) {
        dao.insertShelf(shelf)
    }

    override suspend fun deleteShelf(shelf: Shelf) {
        dao.deleteShelf(shelf)
    }

    override fun getItemsByShelfId(shelfId: Int): Flow<List<Item>> {
        return dao.getItemsByShelfId(shelfId)
    }

    override suspend fun getItemById(id: Int): Item? {
        return dao.getItemById(id)
    }

    override suspend fun insertItem(item: Item) {
        dao.insertItem(item)
    }

    override suspend fun deleteItem(item: Item) {
        dao.deleteItem(item)
    }

    override suspend fun deleteAllItemsByShelfId(shelfId: Int) {
        dao.deleteAllItemsByShelfId(shelfId)
    }
}