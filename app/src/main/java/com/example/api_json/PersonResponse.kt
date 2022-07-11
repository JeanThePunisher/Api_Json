package com.example.api_json

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PersonResponse(@Expose @SerializedName(value="id") val id:Int,
                          @Expose @SerializedName("name") val name: String,
                          @Expose @SerializedName("email") val email: String,
                          @Expose @SerializedName("gender") val gender: String,
                          @Expose @SerializedName("status") val status: String)


