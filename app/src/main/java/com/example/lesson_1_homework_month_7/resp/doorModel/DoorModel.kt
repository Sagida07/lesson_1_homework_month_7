package com.example.lesson_1_homework_month_7.resp.doorModel

import com.google.gson.annotations.SerializedName

data class DoorModel(
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("data")
    val data: List<Data>
) {
    data class Data(
        @SerializedName("room")
        val room: String,
        @SerializedName("snapshot")
        val snapshot: String,
        @SerializedName("favorites")
        val favorites: Boolean,
        @SerializedName("name")
        val name: String,
        @SerializedName("id")
        val id: Int
    )
}