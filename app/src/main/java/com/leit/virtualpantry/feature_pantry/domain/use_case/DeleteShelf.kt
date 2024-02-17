package com.leit.virtualpantry.feature_pantry.domain.use_case

import com.leit.virtualpantry.feature_pantry.domain.model.Shelf
import com.leit.virtualpantry.feature_pantry.domain.repository.PantryRepository

class DeleteShelf(
    private val repository: PantryRepository
) {
    suspend operator fun invoke(shelf: Shelf){
        repository.deleteShelf(shelf)
    }
}