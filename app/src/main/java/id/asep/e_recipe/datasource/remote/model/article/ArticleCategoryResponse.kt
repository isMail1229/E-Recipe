package id.asep.e_recipe.datasource.remote.model.article

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ArticleCategoryResponse(
    @Json(name = "title") val title: String,
    @Json(name = "key") val key: String
)
