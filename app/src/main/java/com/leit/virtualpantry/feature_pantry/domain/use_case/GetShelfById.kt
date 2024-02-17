package com.leit.virtualpantry.feature_pantry.domain.use_case

import com.leit.virtualpantry.feature_pantry.domain.model.Shelf
import com.leit.virtualpantry.feature_pantry.domain.repository.PantryRepository

class GetShelfById(
    private val repository: PantryRepository
) {
    suspend operator fun invoke(id:Int):Shelf?{
        return repository.getShelfById(id)
    }
}