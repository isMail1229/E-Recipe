package id.asep.e_recipe.datasource.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import id.asep.e_recipe.utils.helper.Constants

@Entity(tableName = Constants.ARTICLE_TABLE)
data class Article(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Long,
    @ColumnInfo(name = "thumb") val thumb: String,
    @ColumnInfo(name = "tags") val tags: String,
    @ColumnInfo(name = "key") val key: String,
)
