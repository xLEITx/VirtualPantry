package com.leit.virtualpantry.feature_pantry.domain.use_case

import com.leit.virtualpantry.feature_pantry.domain.model.Item
import com.leit.virtualpantry.feature_pantry.domain.repository.PantryRepository

class GetItemById(
    private val repository: PantryRepository
) {
    suspend operator fun invoke(id:Int):Item?{
        return repository.getItemById(id)
    }
}