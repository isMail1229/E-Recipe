package id.asep.e_recipe.datasource.remote.model.article

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ArticleDetailResponse(
    @Json(name = "title") val title: String,
    @Json(name = "thumb") val thumb: String,
    @Json(name = "author") val author: String,
    @Json(name = "date_published") val date_published: String,
    @Json(name = "description") val description: String,
)
