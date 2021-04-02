package id.asep.e_recipe.datasource.repository.implementation

import com.haroldadmin.cnradapter.NetworkResponse
import id.asep.e_recipe.datasource.remote.service.RecipeAPIService
import id.asep.e_recipe.datasource.repository.RecipeRepository
import retrofit2.Retrofit
import javax.inject.Inject

class RecipeRepositoryImpl @Inject constructor(
        private val retrofit: Retrofit
) : RecipeRepository {
    override suspend fun getNewRecipe() {
        val response = retrofit.create(RecipeAPIService::class.java)
                .getNewRecipe()
        if (response is NetworkResponse.Success) {

        } else {

        }
    }

    override suspend fun getRecipeCategory() {
        TODO("Not yet implemented")
    }

    override suspend fun getRecipeByCategory() {
        TODO("Not yet implemented")
    }

    override suspend fun getDetailRecipe() {
        TODO("Not yet implemented")
    }

    override suspend fun getRecipeByLimit() {
        TODO("Not yet implemented")
    }

    override suspend fun getRecipeByPage() {
        TODO("Not yet implemented")
    }
}