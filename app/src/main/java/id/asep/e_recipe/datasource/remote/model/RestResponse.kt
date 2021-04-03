package id.asep.e_recipe.datasource.remote.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RestResponse<T>(
        @Json(name = "method") val method: String,
        @Json(name = "status") val status: Boolean,
        @Json(name = "results") val result: T? = null
)
