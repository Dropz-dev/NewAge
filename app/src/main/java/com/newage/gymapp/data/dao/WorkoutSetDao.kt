package com.newage.gymapp.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.newage.gymapp.data.entities.WorkoutSet

@Dao
interface WorkoutSetDao {
    @Query("SELECT * FROM workout_sets WHERE workoutId = :workoutId ORDER BY setNumber ASC")
    fun getSetsForWorkout(workoutId: Long): LiveData<List<WorkoutSet>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(set: WorkoutSet): Long
}


