package id.asep.e_recipe.datasource.local.dao

import androidx.room.Insert
import androidx.room.Update
import id.asep.e_recipe.datasource.local.model.RecipeDetail

interface RecipeDetailDAO {

    @Insert
    suspend fun insert(recipeDetail: RecipeDetail): Long

    @Insert
    suspend fun insert(recipeDetails: List<RecipeDetail>): LongArray

    @Update
    suspend fun update(recipeDetail: RecipeDetail): Int
}