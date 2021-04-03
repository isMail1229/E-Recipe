package id.asep.e_recipe.datasource.local.service

import id.asep.e_recipe.datasource.local.model.Ingredients
import id.asep.e_recipe.datasource.local.model.Items
import id.asep.e_recipe.datasource.local.model.Recipe
import id.asep.e_recipe.datasource.local.model.RecipeCategory
import id.asep.e_recipe.datasource.local.model.RecipeDetail
import id.asep.e_recipe.datasource.local.model.Steps

interface RecipeService {

    /*Recipe*/

    suspend fun insertRecipe(recipe: Recipe): Long

    suspend fun insertRecipe(recipes: List<Recipe>): LongArray

    suspend fun updateRecipe(recipe: Recipe): Int

    suspend fun getCountRecipe(): Int

    suspend fun getDataRecipeByKeyRecipe(key: String): Recipe?

    /*Recipe Detail*/

    suspend fun insertRecipeDetail(recipeDetail: RecipeDetail): Long

    suspend fun insertRecipeDetail(recipeDetails: List<RecipeDetail>): LongArray

    suspend fun updateRecipeDetail(recipeDetail: RecipeDetail): Int

    suspend fun getDetailRecipeLocalByKey(keyRecipe: String): RecipeDetail

    /*Recipe Category*/

    suspend fun insertRecipeCategory(recipeCategory: RecipeCategory): Long

    suspend fun insertRecipeCategory(recipeCategories: List<RecipeCategory>): LongArray

    suspend fun updateRecipeCategory(recipeCategory: RecipeCategory): Int

    suspend fun getCountRecipeCategories(): Int

    suspend fun getCategoryByKeyCategory(key: String): RecipeCategory?

    /*Ingredients*/

    suspend fun insertIngredientRecipe(ingredientRecipe: Ingredients): Long

    suspend fun insertIngredientRecipe(ingredientRecipes: List<Ingredients>): LongArray

    suspend fun updateIngredientRecipe(ingredientRecipe: Ingredients): Int

    /*Item*/

    suspend fun insertItemRecipe(itemRecipe: Items): Long

    suspend fun insertItemRecipe(itemRecipes: List<Items>): LongArray

    suspend fun updateItemRecipe(itemRecipe: Items): Int

    /*Steps*/

    suspend fun insertStepRecipe(step: Steps): Long

    suspend fun insertStepRecipe(steps: List<Steps>): LongArray

    suspend fun updateStepRecipe(step: Steps): Int
}