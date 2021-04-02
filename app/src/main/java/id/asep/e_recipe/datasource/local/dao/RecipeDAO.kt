package id.asep.e_recipe.datasource.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import id.asep.e_recipe.datasource.local.model.Recipe

@Dao
interface RecipeDAO {

    @Insert
    suspend fun insert(recipe: Recipe): Long

    @Insert
    suspend fun insert(recipes: List<Recipe>): LongArray

    @Update
    suspend fun update(recipe: Recipe): Int

    @Query("select count(id) from recipe")
    suspend fun getCountRecipe(): Int

    @Query("select * from recipe where `key` = :key")
    suspend fun getRecipeByKeyRecipe(key: String): Recipe?

}