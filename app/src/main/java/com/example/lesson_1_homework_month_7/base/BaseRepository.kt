package com.example.lesson_1_homework_month_7.base

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.bumptech.glide.load.engine.Resource
import com.example.lesson_1_homework_month_7.data.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.internal.NopCollector.emit

abstract class BaseRepository() {
    fun <T> performRequest(apiCall: suspend () -> T): LiveData<Resource<T>> =
        liveData(Dispatchers.Main) {
            emit(Resource.Loading())
            try {
                val response = apiCall.invoke()
                emit(Resource.Success(response))
            }
        } catch (s: Exception)
    {
        emit(Resource.Error(s.localizedMessage ?: "Unknown Error"))
        Log.e("performRequest", "${s.message}")
    }
}