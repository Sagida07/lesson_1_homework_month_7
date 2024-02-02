package com.example.lesson_1_homework_month_7.camera

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.lesson_1_homework_month_7.databinding.ItemCameraBinding
import com.example.lesson_1_homework_month_7.resp.cam.SecondCamera

class CameraAdapter : ListAdapter<SecondCamera.Data.Camera, CameraViewHolder>(CameraDiff()) {
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
    fun bind(position: SecondCamera.Data.Camera) {
        binding.tvCamera.text = position.name
        binding.tvRoomName.text = position.room
        Glide.with(binding.imgRoom).load(position.snapshot).into(binding.imgRoom)
    }
}
class CameraDiff : DiffUtil.ItemCallback<SecondCamera.Data.Camera>() {
    override fun areContentsTheSame(
        oldItem: SecondCamera.Data.Camera,
        newItem: SecondCamera.Data.Camera
    ) = oldItem.id == newItem.id

    override fun areItemsTheSame(
        oldItem: SecondCamera.Data.Camera,
        newItem: SecondCamera.Data.Camera
    ) = oldItem == newItem
}