package id.asep.e_recipe.datasource.remote.model.recipe

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RecipeDetailResponse(
    @Json(name = "title") val title: String,
    @Json(name = "thumb") val thumb: String,
    @Json(name = "servings") val servings: String,
    @Json(name = "times") val times: String,
    @Json(name = "difficulty") val difficulty: String,
    @Json(name = "author") val author: Author,
    @Json(name = "desc") val desc: String,
    @Json(name = "needItem") val needItem: List<Item>,
    @Json(name = "ingredient") val ingredient: List<String>,
    @Json(name = "step") val step: List<String>,
)

@JsonClass(generateAdapter = true)
data class Author(
    @Json(name = "user") val user: String,
    @Json(name = "datePublished") val datePublished: String,
)

@JsonClass(generateAdapter = true)
data class Item(
    @Json(name = "item_name") val user: String,
    @Json(name = "thumb_item") val datePublished: String,
)