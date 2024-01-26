package com.example.lesson_1_homework_month_7.door

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.lesson_1_homework_month_7.databinding.ItemDoorBinding

class DoorsAdapter : Adapter<DoorsAdapter.DoorsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoorsViewHolder {
        return DoorsViewHolder(
            ItemDoorBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return 50
    }

    override fun onBindViewHolder(holder: DoorsViewHolder, position: Int) {
        holder.toBind()
    }

    inner class DoorsViewHolder(private val binding: ItemDoorBinding) : ViewHolder(binding.root) {
        fun toBind() {
            itemView.setOnClickListener {
                if (binding.imgDoor.visibility == View.GONE) {
                    binding.imgDoor.visibility =
                        View.VISIBLE; binding.btnPlay.visibility = View.VISIBLE
                } else {
                    binding.imgDoor.visibility = View.GONE
                    binding.btnPlay.visibility = View.GONE
                }
            }
        }
    }
}