package id.asep.e_recipe.datasource.local.service.implementation

import id.asep.e_recipe.datasource.local.dao.ArticleCategoryDAO
import id.asep.e_recipe.datasource.local.dao.ArticleDAO
import id.asep.e_recipe.datasource.local.dao.ArticleDetailDAO
import id.asep.e_recipe.datasource.local.model.Article
import id.asep.e_recipe.datasource.local.model.ArticleCategory
import id.asep.e_recipe.datasource.local.model.ArticleDetail
import id.asep.e_recipe.datasource.local.service.ArticleService
import javax.inject.Inject

class ArticleServiceImpl @Inject constructor(
        private val articleDAO: ArticleDAO,
        private val articleDetailDAO: ArticleDetailDAO,
        private val articleCategoryDAO: ArticleCategoryDAO

) : ArticleService {

    override suspend fun insertArticle(article: Article): Long {
        return articleDAO.insert(article)
    }

    override suspend fun insertArticle(articles: List<Article>): LongArray {
        return articleDAO.insert(articles)
    }

    override suspend fun updateArticle(article: Article): Int {
        return articleDAO.update(article)
    }

    override suspend fun insertArticleDetail(articleDetail: ArticleDetail): Long {
        return articleDetailDAO.insert(articleDetail)
    }

    override suspend fun insertArticleDetail(articleDetails: List<ArticleDetail>): LongArray {
        return articleDetailDAO.insert(articleDetails)
    }

    override suspend fun updateArticleDetail(articleDetail: ArticleDetail): Int {
        return articleDetailDAO.update(articleDetail)
    }

    override suspend fun insertArticleCategory(articleCategory: ArticleCategory): Long {
        return articleCategoryDAO.insert(articleCategory)
    }

    override suspend fun insertArticleCategory(articleCategories: List<ArticleCategory>): LongArray {
        return articleCategoryDAO.insert(articleCategories)
    }

    override suspend fun updateArticleCategory(articleCategory: ArticleCategory): Int {
        return articleCategoryDAO.update(articleCategory)
    }
}