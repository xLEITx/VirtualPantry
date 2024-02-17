package com.leit.virtualpantry.feature_pantry.data.data_source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.leit.virtualpantry.feature_pantry.domain.model.Item
import com.leit.virtualpantry.feature_pantry.domain.model.Shelf
import kotlinx.coroutines.flow.Flow

@Dao
interface PantryDao {
    @Query("SELECT * FROM shelf")
    fun  getShelves():Flow<List<Shelf>>

    @Query("SELECT * FROM shelf WHERE id=:id")
    suspend fun getShelfById(id:Int):Shelf?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertShelf(shelf: Shelf)

    @Delete
    suspend fun deleteShelf(shelf: Shelf)

    @Query("SELECT * FROM item WHERE shelfId=:shelfId")
    fun getItemsByShelfId(shelfId:Int):Flow<List<Item>>

    @Query("SELECT * FROM item WHERE id=:id")
    suspend fun getItemById(id: Int):Item?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(item: Item)

    @Delete
    suspend fun deleteItem(item: Item)

    @Query("DELETE FROM item WHERE shelfId=:shelfId")
    suspend fun deleteAllItemsByShelf(shelfId: Int)
}