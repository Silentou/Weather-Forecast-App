package com.kamesh.weatherapplication.api


import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


object WeatherApiServices {
    private var retrofit:Retrofit?=null
    private val WEATHER_BASE_URL = "https://api.openweathermap.org/data/2.5/"
    fun getApiInterface(): WeatherAPI?{
        if (retrofit == null){
            retrofit = Retrofit.Builder()
                .baseUrl(WEATHER_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
        }
      return retrofit!!.create(WeatherAPI::class.java)
    }

}
