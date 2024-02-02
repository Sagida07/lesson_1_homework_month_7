package com.example.lesson_1_homework_month_7.door

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.lesson_1_homework_month_7.data.Repository
import com.example.lesson_1_homework_month_7.data.Resource
import com.example.lesson_1_homework_month_7.resp.doorModel.DoorModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DoorViewModel @Inject constructor(private val repository: Repository): ViewModel() {
    fun getDoors(): LiveData<Resource<List<DoorModel.Data>>> = repository.getDoor()
}