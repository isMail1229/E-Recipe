package id.asep.e_recipe.datasource.local

import androidx.room.Database
import androidx.room.RoomDatabase
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
import id.asep.e_recipe.datasource.local.model.Article
import id.asep.e_recipe.datasource.local.model.ArticleCategory
import id.asep.e_recipe.datasource.local.model.ArticleDetail
import id.asep.e_recipe.datasource.local.model.ErrorLogging
import id.asep.e_recipe.datasource.local.model.Ingredients
import id.asep.e_recipe.datasource.local.model.Items
import id.asep.e_recipe.datasource.local.model.Recipe
import id.asep.e_recipe.datasource.local.model.RecipeCategory
import id.asep.e_recipe.datasource.local.model.RecipeDetail
import id.asep.e_recipe.datasource.local.model.Steps

@Database(
        entities = [
            Recipe::class,
            RecipeCategory::class,
            RecipeDetail::class,
            Ingredients::class,
            Items::class,
            Steps::class,
            Article::class,
            ArticleDetail::class,
            ArticleCategory::class,
            ErrorLogging::class
        ],
        exportSchema = true,
        version = 1
)
abstract class RecipeDatabase : RoomDatabase() {

    abstract fun recipeDao(): RecipeDAO

    abstract fun recipeCategoryDao(): RecipeCategoryDAO

    abstract fun recipeDetailDao(): RecipeDetailDAO

    abstract fun ingredientRecipeDao(): IngredientsRecipeDAO

    abstract fun itemRecipeDao(): ItemRecipeDAO

    abstract fun stepRecipeDAO(): StepRecipeDAO

    abstract fun articleDetailDAO(): ArticleDetailDAO

    abstract fun articleDAO(): ArticleDAO

    abstract fun articleCategoryDAO(): ArticleCategoryDAO

    abstract fun errorLoggingDao(): ErrorLoggingDAO

}