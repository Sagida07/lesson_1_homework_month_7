package com.example.lesson_1_homework_month_7.camera

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.lesson_1_homework_month_7.data.Repository
import com.example.lesson_1_homework_month_7.data.Resource
import com.example.lesson_1_homework_month_7.resp.cam.SecondCamera
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CameraViewModel @Inject constructor(private val repository: Repository) : ViewModel() {
    fun getCamera(): LiveData<Resource<List<SecondCamera.Data.Camera>>> = repository.getCamera()
}