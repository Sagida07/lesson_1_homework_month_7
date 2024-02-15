package com.example.hw_1_7.domain.usecases

import androidx.lifecycle.LiveData
import com.example.hw_1_7.data.Resource
import com.example.hw_1_7.domain.models.camera.CameraModel
import com.example.hw_1_7.domain.repositories.CamerasRepository
import javax.inject.Inject

class GetCamerasUseCase @Inject constructor(private val camerasRepository: CamerasRepository) {
    fun getCameras():LiveData<Resource<CameraModel>> = camerasRepository.getCameras()
}