package id.asep.e_recipe.datasource.repository

interface RecipeRepository {

    suspend fun getNewRecipe()

    suspend fun getRecipeCategory()

    suspend fun getRecipeByCategory(key: String)

    suspend fun getDetailRecipe(keyRecipe: String)

    suspend fun getRecipeByLimit(limit: Int)

    suspend fun getRecipeByPage(page: Int)
}