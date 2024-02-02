package com.example.lesson_1_homework_month_7.base

import com.example.lesson_1_homework_month_7.data.ApiService
import com.example.lesson_1_homework_month_7.data.Resource
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers

abstract class BaseRepository(private val api: ApiService) {
    fun <T> performR(apiCall: suspend () -> T): LiveData<Resource<T>> =
        liveData(Dispatchers.Main) {
            emit(Resource.Loading())
            try {
                val response = apiCall.invoke()
                emit(Resource.Success(response))
            } catch (s: Exception) {
                emit(Resource.Error(s.localizedMessage ?: "Unknown Error"))
                Log.e("performRequest", "${s.message}")
            }
        }
}