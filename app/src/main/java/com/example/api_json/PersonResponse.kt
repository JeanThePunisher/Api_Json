package com.example.api_json

import com.google.gson.annotations.SerializedName

data class PersonResponse(@SerializedName(value="status") var status:String,
@SerializedName(value="message") var images:List<String>)

