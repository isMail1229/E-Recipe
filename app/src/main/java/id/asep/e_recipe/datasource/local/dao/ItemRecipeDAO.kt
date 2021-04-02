package id.asep.e_recipe.datasource.local.dao

import androidx.room.Insert
import androidx.room.Update
import id.asep.e_recipe.datasource.remote.model.recipe.Item

interface ItemRecipeDAO {

    @Insert
    suspend fun insert(item: Item): Long

    @Insert
    suspend fun insert(items: List<Item>): LongArray

    @Update
    suspend fun update(item: Item): Int
}