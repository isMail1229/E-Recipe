package id.asep.e_recipe.datasource.remote.model.article

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ArticleByCategoryResponse(
    @Json(name = "title") val title: String,
    @Json(name = "thumb") val thumb: String,
    @Json(name = "tags") val tags: String,
    @Json(name = "key") val key: String,
)
