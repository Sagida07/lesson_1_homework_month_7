package com.example.lesson_1_homework_month_7.door

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.lesson_1_homework_month_7.base.BaseFragment
import com.example.lesson_1_homework_month_7.databinding.FragmentDoorBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DoorsFragment : BaseFragment() {
    private lateinit var binding:FragmentDoorBinding
    private val viewModel:DoorViewModel by viewModels()
    private val adapter = DoorsAdapter()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDoorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getDoors().stateHandler(
            success = {
                adapter.submitList(it)
                binding.doorsRecyclerView.adapter = adapter
            }
        )
    }
}