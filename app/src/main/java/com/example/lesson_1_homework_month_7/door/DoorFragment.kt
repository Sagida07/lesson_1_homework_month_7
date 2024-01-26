package com.example.lesson_1_homework_month_7.door

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lesson_1_homework_month_7.databinding.FragmentDoorBinding

class DoorFragment : Fragment() {

    private lateinit var binding: FragmentDoorBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDoorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = DoorsAdapter()
        binding.doorsRecyclerView.adapter = adapter
    }
}