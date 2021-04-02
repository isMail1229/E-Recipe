package id.asep.e_recipe.datasource.repository

import id.asep.e_recipe.datasource.local.model.ErrorLogging
import id.asep.e_recipe.datasource.local.model.Recipe
import id.asep.e_recipe.datasource.local.model.RecipeCategory
import id.asep.e_recipe.datasource.remote.model.RestError
import id.asep.e_recipe.datasource.remote.model.recipe.RecipeCategoryResponse
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

