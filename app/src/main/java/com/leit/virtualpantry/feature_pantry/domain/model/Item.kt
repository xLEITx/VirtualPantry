package com.leit.virtualpantry.feature_pantry.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Item(
    val title:String,
    val amount:Int,
    val shelfId:Int,
    @PrimaryKey val id:Int?= null

)
