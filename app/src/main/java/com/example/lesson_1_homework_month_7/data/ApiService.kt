package com.example.lesson_1_homework_month_7.data

import com.example.lesson_1_homework_month_7.resp.cam.SecondCamera
import com.example.lesson_1_homework_month_7.resp.doorModel.DoorModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("camera")
    suspend fun getCamera(): Response<List<SecondCamera.Data.Camera>>

    @GET("door")
    suspend fun getDoor(): Response<List<DoorModel.Data>>
}