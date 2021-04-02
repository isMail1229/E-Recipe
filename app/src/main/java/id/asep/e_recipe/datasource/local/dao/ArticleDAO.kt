package id.asep.e_recipe.datasource.local.dao

import androidx.room.Insert
import androidx.room.Update
import id.asep.e_recipe.datasource.local.model.Article

interface ArticleDAO {

    @Insert
    suspend fun insert(article: Article): Long

    @Insert
    suspend fun insert(articles: List<Article>): LongArray

    @Update
    suspend fun update(article: Article): Int
}