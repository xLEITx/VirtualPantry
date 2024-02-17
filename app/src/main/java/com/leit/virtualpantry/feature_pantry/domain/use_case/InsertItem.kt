package com.leit.virtualpantry.feature_pantry.domain.use_case

import com.leit.virtualpantry.feature_pantry.domain.model.Item
import com.leit.virtualpantry.feature_pantry.domain.repository.PantryRepository

class InsertItem(
    private val repository: PantryRepository
) {
    suspend operator fun invoke(item: Item){
        repository.insertItem(item)
    }
}