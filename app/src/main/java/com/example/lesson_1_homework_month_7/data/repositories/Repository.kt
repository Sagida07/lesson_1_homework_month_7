package com.example.hw_1_7.data.repositories

import androidx.lifecycle.LiveData
import com.example.hw_1_7.base.BaseRepository
import com.example.hw_1_7.data.Resource
import com.example.hw_1_7.data.remote.ApiService
import com.example.hw_1_7.domain.models.camera.CameraModel
import com.example.hw_1_7.domain.models.door.DoorModel
import com.example.hw_1_7.domain.repositories.CamerasRepository
import com.example.hw_1_7.domain.repositories.DoorsRepository

class Repository (private val apiService: ApiService) : CamerasRepository, DoorsRepository, BaseRepository() {
    override fun getCameras(): LiveData<Resource<CameraModel>> = performRequest{
        apiService.getCameras().body() as CameraModel
    }

    override fun getDoors(): LiveData<Resource<DoorModel>> = performRequest{
        apiService.getDoors().body() as DoorModel
    }
}