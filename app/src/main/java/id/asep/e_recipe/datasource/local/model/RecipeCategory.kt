package id.asep.e_recipe.datasource.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import id.asep.e_recipe.utils.helper.Constants

@Entity(tableName = Constants.RECIPE_CATEGORY_TABLE)
data class RecipeCategory(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Long,
    @ColumnInfo(name = "name") val nameCategory: String,
    @ColumnInfo(name = "key") val keyCategory: String
)
