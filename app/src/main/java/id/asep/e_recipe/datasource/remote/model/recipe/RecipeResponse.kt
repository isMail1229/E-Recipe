package id.asep.e_recipe.datasource.remote.model.recipe

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RecipeResponse(
        @Json(name = "title") val title: String,
        @Json(name = "thumb") val thumb: String,
        @Json(name = "key") val key: String,
        @Json(name = "times") val times: String,
        @Json(name = "portion") val portion: String,
        @Json(name = "dificulty") val difficulty: String
)