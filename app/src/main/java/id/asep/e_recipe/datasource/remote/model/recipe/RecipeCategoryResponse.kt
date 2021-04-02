package id.asep.e_recipe.datasource.remote.model.recipe

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RecipeCategoryResponse(
    @Json(name = "category") val category: String,
    @Json(name = "key") val key: String,
    @Json(name = "url") val url: String
)

