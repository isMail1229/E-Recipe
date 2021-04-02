package id.asep.e_recipe.datasource.local.service

import id.asep.e_recipe.datasource.local.model.ErrorLogging

interface ErrorLoggingService {

    suspend fun insert(errorLogging: ErrorLogging): Long

    suspend fun insert(errorLogging: List<ErrorLogging>): LongArray

    suspend fun update(errorLogging: ErrorLogging): Int

    suspend fun getCountErrorLogging(): Int

    suspend fun delete()
}