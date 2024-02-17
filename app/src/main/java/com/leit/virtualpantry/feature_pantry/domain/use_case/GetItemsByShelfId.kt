package com.leit.virtualpantry.feature_pantry.domain.use_case

import com.leit.virtualpantry.feature_pantry.domain.model.Item
import com.leit.virtualpantry.feature_pantry.domain.repository.PantryRepository
import kotlinx.coroutines.flow.Flow

class GetItemsByShelfId(
    private val repository: PantryRepository
) {
     operator fun invoke(shelfId:Int): Flow<List<Item>> {
        return repository.getItemsByShelfId(shelfId)
    }
}