package com.example.lesson_1_homework_month_7.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import com.example.lesson_1_homework_month_7.R
import com.example.lesson_1_homework_month_7.data.Resource
import com.example.lesson_1_homework_month_7.resp.utils.showToast

open class BaseFragment : Fragment() {
    fun <T> LiveData<Resource<T>>.stateHandler(
        success: (data: T) -> Unit,
        state: ((res: Resource<T>) -> Unit)? = null
    ) {
        observe(this@BaseFragment) { res ->
            state?.invoke(res)
            when (res) {
                is Resource.Error -> {
                    this@BaseFragment.showToast(res.message!!)
                }

                is Resource.Loading -> {
                }

                is Resource.Success -> {
                    if (res.data != null) {
                        success(res.data)
                    }
                }

                else -> {
                    this@BaseFragment.showToast("else")
                }
            }
        }
    }
}