package id.asep.e_recipe.datasource.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import id.asep.e_recipe.datasource.local.model.RecipeDetail

@Dao
interface RecipeDetailDAO {

    @Insert
    suspend fun insert(recipeDetail: RecipeDetail): Long

    @Insert
    suspend fun insert(recipeDetails: List<RecipeDetail>): LongArray

    @Update
    suspend fun update(recipeDetail: RecipeDetail): Int

    @Query("select * from `recipe-detail` where `key` = :keyRecipe")
    suspend fun getDetailRecipeLocalByKey(keyRecipe: String): RecipeDetail?
}