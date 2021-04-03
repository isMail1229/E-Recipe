package id.asep.e_recipe.datasource.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import id.asep.e_recipe.utils.helper.Constants

@Entity(tableName = Constants.RECIPE_DETAIL_TABLE)
data class RecipeDetail(
        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "id") val id: Long,
        @ColumnInfo(name = "title") val title: String,
        @ColumnInfo(name = "thumb") val thumb: String,
        @ColumnInfo(name = "servings") val servings: String,
        @ColumnInfo(name = "times") val times: String,
        @ColumnInfo(name = "difficulty") val difficulty: String,
        @ColumnInfo(name = "key") val keyRecipe: String,
        @ColumnInfo(name = "author") val author: String,
        @ColumnInfo(name = "date_published") val datePublished: String,
        @ColumnInfo(name = "desc") val description: String
)

@Entity(tableName = Constants.RECIPE_INGREDIENTS_TABLE)
data class Ingredients(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Long,
    @ColumnInfo(name = "text") val text: String,
    @ColumnInfo(name = "local_recipe_id") val localRecipeId: Long,
)

@Entity(tableName = Constants.RECIPE_STEP_TABLE)
data class Steps(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Long,
    @ColumnInfo(name = "text") val text: String,
    @ColumnInfo(name = "local_recipe_id") val localRecipeId: Long,
)

@Entity(tableName = Constants.RECIPE_ITEM_TABLE)
data class Items(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Long,
    @ColumnInfo(name = "text") val text: String,
    @ColumnInfo(name = "thumb") val thumb: String,
    @ColumnInfo(name = "local_recipe_id") val localRecipeId: Long,
)
