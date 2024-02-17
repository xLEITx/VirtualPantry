package com.leit.virtualpantry.feature_pantry.domain.use_case

import com.leit.virtualpantry.feature_pantry.domain.model.Shelf
import com.leit.virtualpantry.feature_pantry.domain.repository.PantryRepository

class InsertShelf(
    private val repository: PantryRepository
) {
    suspend operator fun invoke(shelf: Shelf){
        repository.insertShelf(shelf)
    }
}