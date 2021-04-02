package id.asep.e_recipe.datasource.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Update
import id.asep.e_recipe.datasource.local.model.ArticleCategory

@Dao
interface ArticleCategoryDAO {

    @Insert
    suspend fun insert(articleCategory: ArticleCategory): Long

    @Insert
    suspend fun insert(articleCategory: List<ArticleCategory>): LongArray

    @Update
    suspend fun update(articleCategory: ArticleCategory): Int
}