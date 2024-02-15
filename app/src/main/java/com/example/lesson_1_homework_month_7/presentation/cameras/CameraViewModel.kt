package com.example.lesson_1_homework_month_7.presentation.cameras

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.lesson_1_homework_month_7.data.Resource
import com.example.lesson_1_homework_month_7.data.resp.camera.SecondCamera
import com.example.lesson_1_homework_month_7.domain.usecases.GetCamerasUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CameraViewModel @Inject constructor(private val getCamerasUseCase: GetCamerasUseCase):ViewModel() {
    fun getCameras():LiveData<Resource<SecondCamera>> = getCamerasUseCase.getCameras()
}