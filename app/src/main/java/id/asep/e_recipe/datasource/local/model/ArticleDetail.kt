package id.asep.e_recipe.datasource.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import id.asep.e_recipe.utils.helper.Constants

@Entity(tableName = Constants.ARTICLE_DETAIL_TABLE)
data class ArticleDetail(
        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "id") val id: Long,
        @ColumnInfo(name = "thumb") val thumb: String,
        @ColumnInfo(name = "title") val title: String,
        @ColumnInfo(name = "author") val author: String,
        @ColumnInfo(name = "date_published") val datePublished: String,
        @ColumnInfo(name = "description") val description: String
)
