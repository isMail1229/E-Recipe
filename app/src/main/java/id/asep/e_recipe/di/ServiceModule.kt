package id.asep.e_recipe.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import id.asep.e_recipe.datasource.local.service.ArticleService
import id.asep.e_recipe.datasource.local.service.ErrorLoggingService
import id.asep.e_recipe.datasource.local.service.RecipeService
import id.asep.e_recipe.datasource.local.service.implementation.ArticleServiceImpl
import id.asep.e_recipe.datasource.local.service.implementation.ErrorLoggingServiceImpl
import id.asep.e_recipe.datasource.local.service.implementation.RecipeServiceImpl
import id.asep.e_recipe.datasource.repository.RecipeRepository
import id.asep.e_recipe.datasource.repository.implementation.RecipeRepositoryImpl


@Module
@InstallIn(SingletonComponent::class)
abstract class ServiceModule {

    @Binds
    abstract fun bindServiceRecipe(serviceRecipeServiceImpl: RecipeServiceImpl): RecipeService

    @Binds
    abstract fun bindServiceArticle(articleServiceImpl: ArticleServiceImpl): ArticleService

    @Binds
    abstract fun bindErrorLoggingService(errorLoggingServiceImpl: ErrorLoggingServiceImpl): ErrorLoggingService

    @Binds
    abstract fun bindRecipeRepository(recipeRepositoryImpl: RecipeRepositoryImpl): RecipeRepository
}