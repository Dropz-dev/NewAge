package com.newage.gymapp.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "workouts")
data class Workout(
    @PrimaryKey(autoGenerate = true) val workoutId: Long = 0,
    val date: Date,
    val startTime: Long,
    val endTime: Long? = null,
    val totalVolume: Float = 0f,
    val notes: String = ""
)


