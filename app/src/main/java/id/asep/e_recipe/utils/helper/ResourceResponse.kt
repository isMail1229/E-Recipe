package id.asep.e_recipe.utils.helper

data class ResourceResponse<out T>(
        val status: Status,
        val data: T?,
        val message: String?
) {
    companion object {

        fun <T> success(data: T?): ResourceResponse<T> {
            return ResourceResponse(Status.SUCCESS, data, null)
        }

        fun <T> error(msg: String, data: T?): ResourceResponse<T> {
            return ResourceResponse(Status.ERROR, data, msg)
        }

        fun <T> loading(data: T?): ResourceResponse<T> {
            return ResourceResponse(Status.LOADING, data, null)
        }

    }
}