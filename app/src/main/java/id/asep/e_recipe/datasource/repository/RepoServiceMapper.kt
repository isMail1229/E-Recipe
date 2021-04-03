package id.asep.e_recipe.datasource.repository

import id.asep.e_recipe.datasource.local.model.ErrorLogging
import id.asep.e_recipe.datasource.local.model.Ingredients
import id.asep.e_recipe.datasource.local.model.Items
import id.asep.e_recipe.datasource.local.model.Recipe
import id.asep.e_recipe.datasource.local.model.RecipeCategory
import id.asep.e_recipe.datasource.local.model.RecipeDetail
import id.asep.e_recipe.datasource.local.model.Steps
import id.asep.e_recipe.datasource.remote.model.RestError
import id.asep.e_recipe.datasource.remote.model.recipe.Item
import id.asep.e_recipe.datasource.remote.model.recipe.RecipeCategoryResponse
import id.asep.e_recipe.datasource.remote.model.recipe.RecipeDetailResponse
import id.asep.e_recipe.datasource.remote.model.recipe.RecipeResponse

fun RestError.toErrorLog(): ErrorLogging {
    return ErrorLogging(
            id = 0L,
            message = message,
            status = status,
            code = code
    )
}

fun RecipeResponse.toRecipe(): Recipe {
    return Recipe(
            id = 0L,
            title = title,
            thumb = thumb,
            times = times,
            portion = portion,
            key = key,
            difficulty = difficulty
    )
}

fun List<RecipeResponse>.toRecipes(): List<Recipe> {
    val data = mutableListOf<Recipe>()
    forEach {
        data.add(it.toRecipe())
    }
    return data
}

fun RecipeCategoryResponse.toRecipeCategory(): RecipeCategory {
    return RecipeCategory(
            id = 0L,
            nameCategory = category,
            keyCategory = key
    )
}

fun List<RecipeCategoryResponse>.toRecipeCategories(): List<RecipeCategory> {
    val data = mutableListOf<RecipeCategory>()
    forEach {
        data.add(it.toRecipeCategory())
    }
    return data
}

fun RecipeDetailResponse.toRecipeDetail(keyRecipe: String): RecipeDetail {
    return RecipeDetail(
            id = 0L,
            title = title,
            thumb = thumb,
            servings = servings,
            times = times,
            difficulty,
            keyRecipe = keyRecipe,
            author = author.user,
            datePublished = author.datePublished,
            description = desc
    )
}

fun List<Item>.toItems(localRecipeId: Long): List<Items> {
    val dataItems = mutableListOf<Items>()
    forEach {
        dataItems.add(it.toItem(localRecipeId))
    }
    return dataItems
}

fun Item.toItem(localRecipeId: Long): Items {
    return Items(
            id = 0L,
            text = name,
            thumb = thumbItem,
            localRecipeId = localRecipeId
    )
}

fun List<String>.toIngredient(localRecipeId: Long): List<Ingredients> {
    val data = mutableListOf<Ingredients>()
    forEach { data.add(it.toIngredients(localRecipeId)) }
    return data
}

fun String.toIngredients(localRecipeId: Long): Ingredients {
    return Ingredients(
            id = 0L,
            text = this,
            localRecipeId = localRecipeId
    )
}

fun List<String>.toSteps(localRecipeId: Long): List<Steps> {
    val data = mutableListOf<Steps>()
    forEach { data.add(it.toStep(localRecipeId)) }
    return data
}

fun String.toStep(localRecipeId: Long): Steps {
    return Steps(
            id = 0L,
            text = this,
            localRecipeId = localRecipeId
    )
}
