package id.asep.e_recipe.datasource.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import id.asep.e_recipe.datasource.local.model.RecipeCategory

@Dao
interface RecipeCategoryDAO {

    @Insert
    suspend fun insert(recipeCategory: RecipeCategory): Long

    @Insert
    suspend fun insert(recipeCategories: List<RecipeCategory>): LongArray

    @Update
    suspend fun update(recipeCategory: RecipeCategory): Int

    @Query("select count(id) from `recipe-category`")
    suspend fun getCountRecipeCategory(): Int

    @Query("select * from `recipe-category` where `key` = :key")
    suspend fun getRecipeCategoryByKey(key: String): RecipeCategory?
}