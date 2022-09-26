package com.kamesh.weatherapplication.api


import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

//http://api.openweathermap.org/data/2.5/weather?id=524901&appid=58714ed8d6b840338d172d0808694e3e

object WeatherApiServices {
    private var retrofit:Retrofit?=null
    private val WEATHER_BASE_URL = "https://api.openweathermap.org/data/2.5/"
//    private val api = Retrofit.Builder()
//        .baseUrl(WEATHER_BASE_URL)
//        .addConverterFactory(GsonConverterFactory.create())
//        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//        .build()
//        .create(WeatherAPI::class.java)
//    fun getWeatherDataServices(cityName:String): Single<WeatherModel>{
//        return api.getWeatherData(cityName)
//    }
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