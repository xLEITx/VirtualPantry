package com.leit.virtualpantry.feature_pantry.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Shelf(
    val title:String,
    val iconId:Int,
    val color:Int,
    @PrimaryKey val id:Int? = null
){
    companion object{
       
    }
}
