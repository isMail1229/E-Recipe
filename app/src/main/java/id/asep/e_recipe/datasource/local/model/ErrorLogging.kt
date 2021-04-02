package id.asep.e_recipe.datasource.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import id.asep.e_recipe.utils.helper.Constants

@Entity(tableName = Constants.ERROR_LOGGING_TABLE)
data class ErrorLogging(
        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "id") val id: Long,
        @ColumnInfo(name = "message") val message: String,
        @ColumnInfo(name = "status") val status: Boolean,
        @ColumnInfo(name = "code") val code: Int
)
