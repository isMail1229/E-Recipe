package id.asep.e_recipe.di

import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import id.asep.e_recipe.MainApplication
import id.asep.e_recipe.datasource.local.RecipeDatabase
import id.asep.e_recipe.datasource.local.dao.ArticleCategoryDAO
import id.asep.e_recipe.datasource.local.dao.ArticleDAO
import id.asep.e_recipe.datasource.local.dao.ArticleDetailDAO
import id.asep.e_recipe.datasource.local.dao.ErrorLoggingDAO
import id.asep.e_recipe.datasource.local.dao.IngredientsRecipeDAO
import id.asep.e_recipe.datasource.local.dao.ItemRecipeDAO
import id.asep.e_recipe.datasource.local.dao.RecipeCategoryDAO
import id.asep.e_recipe.datasource.local.dao.RecipeDAO
import id.asep.e_recipe.datasource.local.dao.RecipeDetailDAO
import id.asep.e_recipe.datasource.local.dao.StepRecipeDAO
import id.asep.e_recipe.utils.helper.Constants
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(app: MainApplication): RecipeDatabase {
        return Room.databaseBuilder(
                app,
                RecipeDatabase::class.java,
                Constants.DATABASE_NAME
        ).fallbackToDestructiveMigration()
                .build()
    }

    @Singleton
    @Provides
    fun provideRecipeDao(db: RecipeDatabase): RecipeDAO {
        return db.recipeDao()
    }

    @Singleton
    @Provides
    fun provideRecipeCategoryDao(db: RecipeDatabase): RecipeCategoryDAO {
        return db.recipeCategoryDao()
    }

    @Singleton
    @Provides
    fun provideRecipeDetailDao(db: RecipeDatabase): RecipeDetailDAO {
        return db.recipeDetailDao()
    }

    @Singleton
    @Provides
    fun provideIngredientRecipeDao(db: RecipeDatabase): IngredientsRecipeDAO {
        return db.ingredientRecipeDao()
    }

    @Singleton
    @Provides
    fun provideItemRecipeDao(db: RecipeDatabase): ItemRecipeDAO {
        return db.itemRecipeDao()
    }

    @Singleton
    @Provides
    fun provideStepRecipeDao(db: RecipeDatabase): StepRecipeDAO {
        return db.stepRecipeDAO()
    }

    @Singleton
    @Provides
    fun provideArticleDao(db: RecipeDatabase): ArticleDAO {
        return db.articleDAO()
    }

    @Singleton
    @Provides
    fun provideArticleCategoryDao(db: RecipeDatabase): ArticleCategoryDAO {
        return db.articleCategoryDAO()
    }

    @Singleton
    @Provides
    fun provideArticleDetail(db: RecipeDatabase): ArticleDetailDAO {
        return db.articleDetailDAO()
    }

    @Singleton
    @Provides
    fun provideErrorLogging(db: RecipeDatabase): ErrorLoggingDAO {
        return db.errorLoggingDao()
    }

}