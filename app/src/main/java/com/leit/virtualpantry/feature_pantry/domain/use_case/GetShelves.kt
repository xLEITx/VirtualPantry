package com.leit.virtualpantry.feature_pantry.domain.use_case

import com.leit.virtualpantry.feature_pantry.domain.model.Shelf
import com.leit.virtualpantry.feature_pantry.domain.repository.PantryRepository
import kotlinx.coroutines.flow.Flow

class GetShelves(
    private val repository: PantryRepository
) {
    operator fun invoke():Flow<List<Shelf>>{
        return repository.getShelves()
    }

}