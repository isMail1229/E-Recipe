package id.asep.e_recipe.datasource.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Update
import id.asep.e_recipe.datasource.local.model.ArticleDetail

@Dao
interface ArticleDetailDAO {

    @Insert
    suspend fun insert(articleDetail: ArticleDetail): Long

    @Insert
    suspend fun insert(articleDetails: List<ArticleDetail>): LongArray

    @Update
    suspend fun update(articleDetail: ArticleDetail): Int
}