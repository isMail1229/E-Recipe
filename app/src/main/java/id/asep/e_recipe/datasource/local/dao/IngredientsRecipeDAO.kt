package id.asep.e_recipe.datasource.local.dao

import androidx.room.Insert
import androidx.room.Update
import id.asep.e_recipe.datasource.local.model.Ingredients

interface IngredientsRecipeDAO {

    @Insert
    suspend fun insert(ingredient: Ingredients): Long

    @Insert
    suspend fun insert(ingredients: List<Ingredients>): LongArray

    @Update
    suspend fun update(ingredient: Ingredients): Int
}