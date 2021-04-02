package id.asep.e_recipe.datasource.local.service.implementation

import id.asep.e_recipe.datasource.local.dao.IngredientsRecipeDAO
import id.asep.e_recipe.datasource.local.dao.ItemRecipeDAO
import id.asep.e_recipe.datasource.local.dao.RecipeCategoryDAO
import id.asep.e_recipe.datasource.local.dao.RecipeDAO
import id.asep.e_recipe.datasource.local.dao.RecipeDetailDAO
import id.asep.e_recipe.datasource.local.dao.StepRecipeDAO
import id.asep.e_recipe.datasource.local.model.Ingredients
import id.asep.e_recipe.datasource.local.model.Items
import id.asep.e_recipe.datasource.local.model.Recipe
import id.asep.e_recipe.datasource.local.model.RecipeCategory
import id.asep.e_recipe.datasource.local.model.RecipeDetail
import id.asep.e_recipe.datasource.local.model.Steps
import id.asep.e_recipe.datasource.local.service.RecipeService
import javax.inject.Inject

class RecipeServiceImpl @Inject constructor(
        private val recipeDAO: RecipeDAO,
        private val recipeDetailDAO: RecipeDetailDAO,
        private val recipeCategoryDAO: RecipeCategoryDAO,
        private val itemRecipeDAO: ItemRecipeDAO,
        private val stepRecipeDAO: StepRecipeDAO,
        private val ingredientsRecipeDAO: IngredientsRecipeDAO
) : RecipeService {
    override suspend fun insertRecipe(recipe: Recipe): Long {
        return recipeDAO.insert(recipe)
    }

    override suspend fun insertRecipe(recipes: List<Recipe>): LongArray {
        return recipeDAO.insert(recipes)
    }

    override suspend fun updateRecipe(recipe: Recipe): Int {
        return recipeDAO.update(recipe)
    }

    override suspend fun insertRecipeDetail(recipeDetail: RecipeDetail): Long {
        return recipeDetailDAO.insert(recipeDetail)
    }

    override suspend fun insertRecipeDetail(recipeDetails: List<RecipeDetail>): LongArray {
        return recipeDetailDAO.insert(recipeDetails)
    }

    override suspend fun updateRecipeDetail(recipeDetail: RecipeDetail): Int {
        return recipeDetailDAO.update(recipeDetail)
    }

    override suspend fun insertRecipeCategory(recipeCategory: RecipeCategory): Long {
        return recipeCategoryDAO.insert(recipeCategory)
    }

    override suspend fun insertRecipeCategory(recipeCategories: List<RecipeCategory>): LongArray {
        return recipeCategoryDAO.insert(recipeCategories)
    }

    override suspend fun updateRecipeCategory(recipeCategory: RecipeCategory): Int {
        return recipeCategoryDAO.update(recipeCategory)
    }

    override suspend fun insertIngredientRecipe(ingredientRecipe: Ingredients): Long {
        return ingredientsRecipeDAO.insert(ingredientRecipe)
    }

    override suspend fun insertIngredientRecipe(ingredientRecipes: List<Ingredients>): LongArray {
        return ingredientsRecipeDAO.insert(ingredientRecipes)
    }

    override suspend fun updateIngredientRecipe(ingredientRecipe: Ingredients): Int {
        return ingredientsRecipeDAO.update(ingredientRecipe)
    }

    override suspend fun insertItemRecipe(itemRecipe: Items): Long {
        return itemRecipeDAO.insert(itemRecipe)
    }

    override suspend fun insertItemRecipe(itemRecipes: List<Items>): LongArray {
        return itemRecipeDAO.insert(itemRecipes)
    }

    override suspend fun updateItemRecipe(itemRecipe: Items): Int {
        return itemRecipeDAO.update(itemRecipe)
    }

    override suspend fun insertStepRecipe(step: Steps): Long {
        return stepRecipeDAO.insert(step)
    }

    override suspend fun insertStepRecipe(steps: List<Steps>): LongArray {
        return stepRecipeDAO.insert(steps)
    }

    override suspend fun updateStepRecipe(step: Steps): Int {
        return stepRecipeDAO.update(step)
    }
}
