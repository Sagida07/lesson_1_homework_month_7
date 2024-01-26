package com.example.lesson_1_homework_month_7.camera

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.lesson_1_homework_month_7.databinding.ItemCameraBinding

class CameraAdapter : Adapter<CameraAdapter.CameraViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CameraViewHolder {
        return CameraViewHolder(
            ItemCameraBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return 50
    }

    override fun onBindViewHolder(holder: CameraViewHolder, position: Int) {
        holder.bind(position)
    }

    inner class CameraViewHolder(private val binding: ItemCameraBinding) :
        ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.tvRoomName.isVisible = position == 0
        }
    }
}