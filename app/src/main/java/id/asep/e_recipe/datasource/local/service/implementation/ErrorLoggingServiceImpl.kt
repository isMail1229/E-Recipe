package id.asep.e_recipe.datasource.local.service.implementation

import id.asep.e_recipe.datasource.local.dao.ErrorLoggingDAO
import id.asep.e_recipe.datasource.local.model.ErrorLogging
import id.asep.e_recipe.datasource.local.service.ErrorLoggingService
import javax.inject.Inject

class ErrorLoggingServiceImpl @Inject constructor(
        private val errorLoggingDAO: ErrorLoggingDAO
) : ErrorLoggingService {
    override suspend fun insert(errorLogging: ErrorLogging): Long {
        return errorLoggingDAO.insert(errorLogging)
    }

    override suspend fun insert(errorLogging: List<ErrorLogging>): LongArray {
        return errorLoggingDAO.insert(errorLogging)
    }

    override suspend fun update(errorLogging: ErrorLogging): Int {
        return errorLoggingDAO.update(errorLogging)
    }

    override suspend fun getCountErrorLogging(): Int {
        return errorLoggingDAO.getCountError()
    }

    override suspend fun delete() {
        return errorLoggingDAO.delete()
    }
}
