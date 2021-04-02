package id.asep.e_recipe.datasource.remote.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RestError(
    @Json(name = "method") val method: String,
    @Json(name = "message") val message: String,
    @Json(name = "status") val status: Boolean,
    @Json(name = "code") val code: Int
)
