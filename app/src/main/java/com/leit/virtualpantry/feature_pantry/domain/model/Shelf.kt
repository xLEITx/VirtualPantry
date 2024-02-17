package com.leit.virtualpantry.feature_pantry.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.leit.virtualpantry.ui.theme.BabyBlue
import com.leit.virtualpantry.ui.theme.LightGreen
import com.leit.virtualpantry.ui.theme.RedOrange
import com.leit.virtualpantry.ui.theme.RedPink
import com.leit.virtualpantry.ui.theme.Violet

@Entity
data class Shelf(
    val title:String,
    val iconId:Int,
    val color:Int,
    @PrimaryKey val id:Int? = null
){
    companion object{
       val shelfColors = listOf(
            RedOrange, Violet, RedPink, BabyBlue, LightGreen
           )
    }
}
