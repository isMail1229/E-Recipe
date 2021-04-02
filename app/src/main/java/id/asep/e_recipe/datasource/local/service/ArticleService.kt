package id.asep.e_recipe.datasource.local.service

import id.asep.e_recipe.datasource.local.model.Article
import id.asep.e_recipe.datasource.local.model.ArticleCategory
import id.asep.e_recipe.datasource.local.model.ArticleDetail

interface ArticleService {

    /*Article*/

    suspend fun insertArticle(article: Article): Long

    suspend fun insertArticle(articles: List<Article>): LongArray

    suspend fun updateArticle(article: Article): Int

    /*Article Detail*/

    suspend fun insertArticleDetail(articleDetail: ArticleDetail): Long

    suspend fun insertArticleDetail(articleDetails: List<ArticleDetail>): LongArray

    suspend fun updateArticleDetail(articleDetail: ArticleDetail): Int

    /*Article Category*/

    suspend fun insertArticleCategory(articleCategory: ArticleCategory): Long

    suspend fun insertArticleCategory(articleCategories: List<ArticleCategory>): LongArray

    suspend fun updateArticleCategory(articleCategory: ArticleCategory): Int

}