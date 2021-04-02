package id.asep.e_recipe.datasource.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Update
import id.asep.e_recipe.datasource.local.model.Items

@Dao
interface ItemRecipeDAO {

    @Insert
    suspend fun insert(item: Items): Long

    @Insert
    suspend fun insert(items: List<Items>): LongArray

    @Update
    suspend fun update(item: Items): Int
}