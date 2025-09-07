package com.newage.gymapp.data.repository

import com.newage.gymapp.data.dao.ExerciseDao
import com.newage.gymapp.data.dao.WorkoutDao
import com.newage.gymapp.data.dao.WorkoutSetDao

class GymRepository(
    val exerciseDao: ExerciseDao,
    val workoutDao: WorkoutDao,
    val workoutSetDao: WorkoutSetDao
)


