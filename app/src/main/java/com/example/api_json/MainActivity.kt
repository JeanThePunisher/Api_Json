package com.example.api_json


import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PerAdapter()

        val retrofit = Retrofit.Builder()
            .baseUrl("https://gorest.co.in/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val service = retrofit.create(APIService::class.java)
        val repos=service.getpeopleforname("v2")

        repos.enqueue(object : Callback<List<PersonResponse>>{
            override fun onFailure(call: Call<List<PersonResponse>>, t: Throwable) {
                call.cancel()
            }

            override fun onResponse(call: Call<List<PersonResponse>>, response: Response<List<PersonResponse>>) {
                if(response.isSuccessful) {
                    response.body()?.let { repos ->
                        (recyclerView.adapter as PerAdapter).setNameList(repos)
                    }
                } else {
                    Toast.makeText(this@MainActivity, response.message(), Toast.LENGTH_LONG).show()
                }
            }
    })

}
}

