package id.asep.e_recipe.datasource.repository

interface RecipeRepository {

    suspend fun getNewRecipe()

    suspend fun getRecipeCategory()

    suspend fun getRecipeByCategory()

    suspend fun getDetailRecipe()

    suspend fun getRecipeByLimit()

    suspend fun getRecipeByPage()
}