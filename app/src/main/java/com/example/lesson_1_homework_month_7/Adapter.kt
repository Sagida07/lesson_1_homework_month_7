package com.example.lesson_1_homework_month_7

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.lesson_1_homework_month_7.camera.CameraFragment
import com.example.lesson_1_homework_month_7.door.DoorFragment

class Adapter(fragment: FragmentActivity): FragmentStateAdapter(fragment) {

    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {
        return if (position == 0)
            CameraFragment()
        else
            DoorFragment()
    }
}