package com.example.lesson_1_homework_month_7.presentation.doors

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.lesson_1_homework_month_7.data.Resource
import com.example.lesson_1_homework_month_7.data.resp.door.DoorModel
import com.example.lesson_1_homework_month_7.domain.usecases.GetDoorsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DoorsViewModel @Inject constructor(private val getDoorsUseCase: GetDoorsUseCase):ViewModel() {
    fun getDoors():LiveData<Resource<DoorModel>> = getDoorsUseCase.getDoors()
}