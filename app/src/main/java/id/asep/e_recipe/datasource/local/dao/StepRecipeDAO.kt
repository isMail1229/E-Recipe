package id.asep.e_recipe.datasource.local.dao

import androidx.room.Insert
import androidx.room.Update
import id.asep.e_recipe.datasource.local.model.Steps

interface StepRecipeDAO {

    @Insert
    suspend fun insert(step: Steps): Long

    @Insert
    suspend fun insert(steps: List<Steps>): LongArray

    @Update
    suspend fun update(step: Steps): Int
}