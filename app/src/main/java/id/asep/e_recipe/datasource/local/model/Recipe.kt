package id.asep.e_recipe.datasource.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import id.asep.e_recipe.utils.helper.Constants

@Entity(tableName = Constants.RECIPE_TABLE)
data class Recipe(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Long,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "thumb") val thumb: String,
    @ColumnInfo(name = "key") val key: String,
    @ColumnInfo(name = "times") val times: String,
    @ColumnInfo(name = "portion") val portion: String,
    @ColumnInfo(name = "difficulty") val difficulty: String,
    @ColumnInfo(name = "is_favorite") val isFavorite: Boolean = false
)
