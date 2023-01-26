package com.example.foodies.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User(
    @PrimaryKey(autoGenerate = true)

    val id: Int,
    val FoodName: String,
    val FoodDescription: String,

)


