package com.newage.gymapp.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.newage.gymapp.data.dao.ExerciseDao
import com.newage.gymapp.data.dao.WorkoutDao
import com.newage.gymapp.data.dao.WorkoutSetDao
import com.newage.gymapp.data.entities.Exercise
import com.newage.gymapp.data.entities.Workout
import com.newage.gymapp.data.entities.WorkoutSet

@Database(
    entities = [Exercise::class, Workout::class, WorkoutSet::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class GymDatabase : RoomDatabase() {
    abstract fun exerciseDao(): ExerciseDao
    abstract fun workoutDao(): WorkoutDao
    abstract fun workoutSetDao(): WorkoutSetDao

    companion object {
        @Volatile private var INSTANCE: GymDatabase? = null

        fun getInstance(context: Context): GymDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    GymDatabase::class.java,
                    "gym.db"
                ).build().also { INSTANCE = it }
            }
    }
}


