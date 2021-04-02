package id.asep.e_recipe.datasource.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import id.asep.e_recipe.datasource.local.model.ErrorLogging

@Dao
interface ErrorLoggingDAO {

    @Insert
    suspend fun insert(errorLogging: ErrorLogging): Long

    @Insert
    suspend fun insert(errorLogging: List<ErrorLogging>): LongArray

    @Update
    suspend fun update(errorLogging: ErrorLogging): Int

    @Query("select count(id) from `error-logging`")
    suspend fun getCountError(): Int

    @Query("delete from `error-logging`")
    suspend fun delete()
}