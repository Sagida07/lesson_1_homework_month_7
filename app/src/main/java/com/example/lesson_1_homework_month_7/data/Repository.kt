package com.example.lesson_1_homework_month_7.data

import androidx.lifecycle.LiveData
import com.example.lesson_1_homework_month_7.base.BaseRepository
import com.example.lesson_1_homework_month_7.resp.cam.SecondCamera
import com.example.lesson_1_homework_month_7.resp.doorModel.DoorModel
import javax.inject.Inject

class Repository @Inject constructor(private val apiService: ApiService) :
    BaseRepository(apiService) {
    fun getCamera(): LiveData<Resource<List<SecondCamera.Data.Camera>>> = performR {
        apiService.getCamera().body()!!
    }
    fun getDoor(): LiveData<Resource<List<DoorModel.Data>>> = performR {
        apiService.getDoor().body()!!
    }
}