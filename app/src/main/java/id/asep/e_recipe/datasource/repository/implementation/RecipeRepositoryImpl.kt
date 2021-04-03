package id.asep.e_recipe.datasource.repository.implementation

import com.haroldadmin.cnradapter.NetworkResponse
import id.asep.e_recipe.datasource.local.model.ErrorLogging
import id.asep.e_recipe.datasource.local.service.ErrorLoggingService
import id.asep.e_recipe.datasource.local.service.RecipeService
import id.asep.e_recipe.datasource.remote.model.RestError
import id.asep.e_recipe.datasource.remote.service.RecipeAPIService
import id.asep.e_recipe.datasource.repository.RecipeRepository
import id.asep.e_recipe.datasource.repository.toErrorLog
import id.asep.e_recipe.datasource.repository.toIngredient
import id.asep.e_recipe.datasource.repository.toItems
import id.asep.e_recipe.datasource.repository.toRecipe
import id.asep.e_recipe.datasource.repository.toRecipeCategories
import id.asep.e_recipe.datasource.repository.toRecipeCategory
import id.asep.e_recipe.datasource.repository.toRecipeDetail
import id.asep.e_recipe.datasource.repository.toRecipes
import id.asep.e_recipe.datasource.repository.toSteps
import retrofit2.Retrofit
import javax.inject.Inject

class RecipeRepositoryImpl @Inject constructor(
        private val retrofit: Retrofit,
        private val errorLoggingService: ErrorLoggingService,
        private val recipeService: RecipeService

) : RecipeRepository {
    override suspend fun getNewRecipe() {
        val response = retrofit.create(RecipeAPIService::class.java)
                .getNewRecipe()
        if (response is NetworkResponse.Success) {
            val data = response.body.result
            data?.let {
                val countLocal = recipeService.getCountRecipe()
                if (countLocal > 0) {
                    for (resultData in it) {
                        val dataLocal = recipeService.getDataRecipeByKeyRecipe(resultData.key)
                        if (dataLocal == null) {
                            recipeService.insertRecipe(resultData.toRecipe())
                        } else {
                            return
                        }
                    }
                } else {
                    recipeService.insertRecipe(it.toRecipes())
                }
            }
            errorLoggingService.delete()
        } else {
            handleErrorLog(response)
        }
    }

    override suspend fun getRecipeCategory() {
        val response = retrofit.create(RecipeAPIService::class.java)
                .getRecipeCategory()
        if (response is NetworkResponse.Success) {
            val data = response.body.result
            data?.let {
                val countLocal = recipeService.getCountRecipeCategories()
                if (countLocal > 0) {
                    for (dataResult in it) {
                        val dataLocal = recipeService.getCategoryByKeyCategory(dataResult.key)
                        if (dataLocal == null) {
                            recipeService.insertRecipeCategory(dataResult.toRecipeCategory())
                        } else {
                            return
                        }
                    }
                } else {
                    recipeService.insertRecipeCategory(it.toRecipeCategories())
                }
            }
            errorLoggingService.delete()
        } else {
            handleErrorLog(response)
        }
    }

    override suspend fun getRecipeByCategory(key: String) {
        val response = retrofit.create(RecipeAPIService::class.java)
                .getRecipeByCategory(key)

        if (response is NetworkResponse.Success) {
            val data = response.body.result
            data?.let {
                val countLocal = recipeService.getCountRecipe()
                if (countLocal > 0) {
                    for (resultData in it) {
                        val dataLocal = recipeService.getDataRecipeByKeyRecipe(resultData.key)
                        if (dataLocal == null) {
                            recipeService.insertRecipe(resultData.toRecipe())
                        } else {
                            return
                        }
                    }
                } else {
                    recipeService.insertRecipe(it.toRecipes())
                }
            }
            errorLoggingService.delete()
        } else {
            handleErrorLog(response)
        }
    }

    override suspend fun getDetailRecipe(keyRecipe: String) {
        val response = retrofit.create(RecipeAPIService::class.java)
                .getDetailRecipe(keyRecipe)
        if (response is NetworkResponse.Success) {
            val data = response.body.result
            data?.let {
                val dataDetail = it.toRecipeDetail(keyRecipe)
                val row = recipeService.insertRecipeDetail(dataDetail)
                recipeService.insertItemRecipe(it.needItem.toItems(row))
                recipeService.insertIngredientRecipe(it.ingredient.toIngredient(row))
                recipeService.insertStepRecipe(it.step.toSteps(row))
            }
            errorLoggingService.delete()
        } else {
            handleErrorLog(response)
        }
    }

    override suspend fun getRecipeByLimit(limit: Int) {
        val response = retrofit.create(RecipeAPIService::class.java)
                .getRecipeByLimit(limit)
        if (response is NetworkResponse.Success) {
            val data = response.body.result
            data?.let {
                val countLocal = recipeService.getCountRecipe()
                if (countLocal > 0) {
                    for (resultData in it) {
                        val dataLocal = recipeService.getDataRecipeByKeyRecipe(resultData.key)
                        if (dataLocal == null) {
                            recipeService.insertRecipe(resultData.toRecipe())
                        } else {
                            return
                        }
                    }
                } else {
                    recipeService.insertRecipe(it.toRecipes())
                }
            }
        } else {
            handleErrorLog(response)
        }
    }

    override suspend fun getRecipeByPage(page: Int) {
        val response = retrofit.create(RecipeAPIService::class.java)
                .getRecipeByPage(page)
        if (response is NetworkResponse.Success) {
            val data = response.body.result
            data?.let {
                val countLocal = recipeService.getCountRecipe()
                if (countLocal > 0) {
                    for (resultData in it) {
                        val dataLocal = recipeService.getDataRecipeByKeyRecipe(resultData.key)
                        if (dataLocal == null) {
                            recipeService.insertRecipe(resultData.toRecipe())
                        } else {
                            return
                        }
                    }
                } else {
                    recipeService.insertRecipe(it.toRecipes())
                }
            }
            errorLoggingService.delete()
        } else {
            handleErrorLog(response)
        }
    }

    private suspend fun handleErrorLog(errorLog: NetworkResponse<*, RestError>) {
        when (errorLog) {
            is NetworkResponse.ServerError -> {
                val errorLogData = errorLog.body
                val dataErrorLog = errorLogData?.toErrorLog()
                dataErrorLog?.let {
                    errorLoggingService.insert(dataErrorLog)
                }
            }
            is NetworkResponse.NetworkError -> {
                val error = errorLog.error.message
                val dataErrorLog = ErrorLogging(
                        id = 0L,
                        message = error ?: "Network Error",
                        code = 0,
                        status = false
                )
                errorLoggingService.insert(dataErrorLog)
            }
            is NetworkResponse.UnknownError -> {
                val error = errorLog.error.message
                val dataErrorLog = ErrorLogging(
                        id = 0L,
                        message = error ?: "Other Error / Unknown",
                        code = 0,
                        status = false
                )
                errorLoggingService.insert(dataErrorLog)
            }
            else -> return
        }
    }
}