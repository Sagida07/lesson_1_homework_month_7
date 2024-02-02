package com.example.lesson_1_homework_month_7.door

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.lesson_1_homework_month_7.databinding.ItemDoorBinding
import com.example.lesson_1_homework_month_7.resp.doorModel.DoorModel

class DoorsAdapter : ListAdapter<DoorModel.Data, DoorsAdapter.DoorViewHolder>(DoorDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoorViewHolder {
        return DoorViewHolder(
            ItemDoorBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: DoorViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class DoorViewHolder(private val binding: ItemDoorBinding) : ViewHolder(binding.root) {
        fun bind(position: DoorModel.Data) {
            itemView.setOnClickListener {
                if (binding.imgDoor.visibility == View.GONE) {
                    binding.imgDoor.visibility =
                        View.VISIBLE; binding.btnPlay.visibility = View.VISIBLE
                } else {
                    binding.imgDoor.visibility = View.GONE
                    binding.btnPlay.visibility = View.GONE
                }
            }
            binding.tvNameDoor.text = position.name
            Glide.with(binding.imgDoor).load(position.snapshot).into(binding.imgDoor)
        }
    }

    class DoorDiffCallback : DiffUtil.ItemCallback<DoorModel.Data>() {
        override fun areContentsTheSame(oldItem: DoorModel.Data, newItem: DoorModel.Data) =
            oldItem.id == newItem.id

        override fun areItemsTheSame(oldItem: DoorModel.Data, newItem: DoorModel.Data) =
            oldItem == newItem
    }
}