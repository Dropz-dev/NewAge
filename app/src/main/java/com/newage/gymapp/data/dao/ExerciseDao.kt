package com.newage.gymapp.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.newage.gymapp.data.entities.Exercise

@Dao
interface ExerciseDao {
    @Query("SELECT * FROM exercises ORDER BY name ASC")
    fun getAll(): LiveData<List<Exercise>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(items: List<Exercise>)
}


