package com.newage.gymapp.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.newage.gymapp.data.entities.Workout

@Dao
interface WorkoutDao {
    @Query("SELECT * FROM workouts ORDER BY date DESC")
    fun getAll(): LiveData<List<Workout>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(workout: Workout): Long
}


