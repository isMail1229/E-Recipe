package id.asep.e_recipe.datasource.local.dao

import androidx.room.Dao
import androidx.room.Insert
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
}