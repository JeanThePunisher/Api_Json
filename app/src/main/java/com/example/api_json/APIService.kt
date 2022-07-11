package com.example.api_json

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface APIService {
    @GET ("public/{v1}/users")
  fun getpeopleforname (@Path ("v1") v1: String?): Call<List<PersonResponse>>

}