package id.asep.e_recipe.datasource.local.dao

import androidx.room.Insert
import androidx.room.Update
import id.asep.e_recipe.datasource.local.model.Recipe

interface RecipeDAO {

    @Insert
    suspend fun insert(recipe: Recipe): Long

    @Insert
    suspend fun insert(recipes: List<Recipe>): LongArray

    @Update
    suspend fun update(recipe: Recipe): Int

}