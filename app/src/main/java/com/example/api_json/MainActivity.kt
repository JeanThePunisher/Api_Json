package com.example.api_json

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.api_json.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private lateinit var binding:ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun getRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://gorest.co.in/public/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun searchByName(query:String)
    {
        CoroutineScope(Dispatchers.IO).launch {
            val call=getRetrofit().create(APIService::class.java).getpeopleforname(url="$query/images")
            val persons=call.body()
            if (call.isSuccessful)
            {
                //show recyclerview
            }
            else
            {
                //show error
            }
        }
    }
}