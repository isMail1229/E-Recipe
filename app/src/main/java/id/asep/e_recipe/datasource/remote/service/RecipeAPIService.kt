package id.asep.e_recipe.datasource.remote.service

import com.haroldadmin.cnradapter.NetworkResponse
import id.asep.e_recipe.datasource.remote.model.RestError
import id.asep.e_recipe.datasource.remote.model.RestResponse
import id.asep.e_recipe.datasource.remote.model.RestResponseList
import id.asep.e_recipe.datasource.remote.model.article.ArticleByCategoryResponse
import id.asep.e_recipe.datasource.remote.model.article.ArticleCategoryResponse
import id.asep.e_recipe.datasource.remote.model.article.ArticleDetailResponse
import id.asep.e_recipe.datasource.remote.model.article.ArticleResponse
import id.asep.e_recipe.datasource.remote.model.recipe.RecipeCategoryResponse
import id.asep.e_recipe.datasource.remote.model.recipe.RecipeDetailResponse
import id.asep.e_recipe.datasource.remote.model.recipe.RecipeResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RecipeAPIService {

    /*Recipe*/

    @GET("/api/recipes")
    suspend fun getNewRecipe(): NetworkResponse<RestResponseList<RecipeResponse>, RestError>

    @GET("/api/recipes-length/")
    suspend fun getRecipeByLimit(
        @Query("limit") sizeLimit: Int
    ): NetworkResponse<RestResponseList<RecipeResponse>, RestError>

    @GET("/api/recipes/{page}")
    suspend fun getRecipeByPage(
        @Path(value = "page", encoded = true) page: Long,
    ): NetworkResponse<RestResponseList<RecipeResponse>, RestError>

    @GET("/api/search/")
    suspend fun searchRecipe(
        @Query("q") query: String
    ): NetworkResponse<RestResponseList<RecipeResponse>, RestError>

    @GET("/api/categorys/recipes")
    suspend fun getRecipeCategory(): NetworkResponse<RestResponseList<RecipeCategoryResponse>, RestError>

    @GET("/api/categorys/recipes/{key}")
    suspend fun getRecipeByCategory(
        @Path(value = "key") key: String
    ): NetworkResponse<RestResponseList<RecipeResponse>, RestError>

    @GET("/api/recipe/{key}")
    suspend fun getDetailRecipe(
        @Path(value = "key") keyRecipe: String
    ): NetworkResponse<RestResponse<RecipeDetailResponse>, RestError>

    /*Article*/

    @GET("/api/articles/new")
    suspend fun getArticleNew(): NetworkResponse<RestResponseList<ArticleResponse>, RestError>

    @GET("/api/categorys/article")
    suspend fun getArticleCategories(): NetworkResponse<RestResponseList<ArticleCategoryResponse>, RestError>

    @GET("/api/categorys/article/{key}")
    suspend fun getArticleByCategories(
        @Path(value = "key") key: String
    ): NetworkResponse<RestResponseList<ArticleByCategoryResponse>, RestError>

    @GET("/api/article/{pathKeyAndTag}")
    suspend fun getArticleDetail(
        @Path(value = "pathKeyAndTag") pathKeyAndTag: String
    ): NetworkResponse<RestResponse<ArticleDetailResponse>, RestError>
}