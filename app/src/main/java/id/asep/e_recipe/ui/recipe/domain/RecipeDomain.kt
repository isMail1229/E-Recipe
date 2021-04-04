package id.asep.e_recipe.ui.recipe.domain

data class RecipeDomain(
        val id: Long,
        val title: String,
        val time: String,
        val key: String,
        val difficulty: String,
        val isFavorite: Boolean,
        val thumb: String,
        val portion: String
)
