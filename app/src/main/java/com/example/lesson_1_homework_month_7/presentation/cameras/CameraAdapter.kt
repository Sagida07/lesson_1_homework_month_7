package com.example.lesson_1_homework_month_7.presentation.cameras

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.example.lesson_1_homework_month_7.databinding.ItemCameraBinding
import com.example.lesson_1_homework_month_7.data.resp.camera.SecondCamera

class CameraAdapter: ListAdapter<CameraSecond.Data.Camera, CameraViewHolder>(
    CameraDiffCallback()
) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CameraViewHolder {
        return CameraViewHolder(
            ItemCameraBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CameraViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class CameraViewHolder(private val binding: ItemCameraBinding) : ViewHolder(binding.root) {
    fun bind(position: SecondCamera.Data.Camera) = with(binding){
        tvCamera.text = position.name
        tvRoomName.text = position.room
        imgRoom.load(position.snapshot)
    }
}

class CameraDiffCallback : DiffUtil.ItemCallback<SecondCamera.Data.Camera>() {
    override fun areContentsTheSame(oldItem: SecondCamera.Data.Camera, newItem: SecondCamera.Data.Camera) = oldItem.id == newItem.id
    override fun areItemsTheSame(oldItem: SecondCamera.Data.Camera, newItem: SecondCamera.Data.Camera) = oldItem == newItem
}