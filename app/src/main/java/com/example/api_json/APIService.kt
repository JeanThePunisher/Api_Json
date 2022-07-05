package com.example.api_json

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
    @GET
    fun getpeopleforname (@Url url:String): Response<PersonResponse>

}