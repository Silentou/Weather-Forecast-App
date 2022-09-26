package com.kamesh.weatherapplication.adapter

import android.content.Context
import android.icu.text.SimpleDateFormat
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.kamesh.weatherapplication.model.forecast.WeatherDataModel
import com.kamesh.weatherapplication.R

import kotlinx.android.synthetic.main.weather_forecast_item.view.*
import java.util.*




class WeatherForecastAdapter (
    private val forecastList: ArrayList<WeatherDataModel>,
    val context: Context

    ) :RecyclerView.Adapter<WeatherForecastAdapter.WeatherForecastHolder>() {

    class WeatherForecastHolder (itemView: View): RecyclerView.ViewHolder(itemView) {

        @RequiresApi(Build.VERSION_CODES.N)
        fun bind(forecastElement: WeatherDataModel) {


            itemView.forecastDegree.text = "${(forecastElement.main.temp - 273.15).toInt()} °C "
            val sdfSource = SimpleDateFormat("YYYY-MM-dd HH:mm:ss")
            val date = sdfSource.parse(forecastElement.dt_txt)
            val sdfDestination = SimpleDateFormat("d MMM hh:mm a")
            itemView.forecastTime.text = sdfDestination.format(date)
            updateUI(forecastElement.weather[0].icon)
        }
        private fun updateUI(icon: String) {
            when (icon) {
                "11d" -> {
                    itemView.forecastCard.background = ContextCompat.getDrawable(
                        itemView.context,
                        R.drawable.thunderstorm_bga
                    )
                    itemView.forecastImage.setImageResource(R.drawable.thunderstorm)

                }
                "11n" -> {
                    itemView.forecastCard.background = ContextCompat.getDrawable(
                        itemView.context,
                        R.drawable.thunderstorm_bga
                    )
                    itemView.forecastImage.setImageResource(R.drawable.thunderstorm)
                }
                "09d" -> {
                    itemView.forecastCard.background = ContextCompat.getDrawable(
                        itemView.context,
                        R.drawable.drizzle_bga
                    )
                    itemView.forecastImage.setImageResource(R.drawable.cloud_rain_night)
                }
                "09n" -> {
                    itemView.forecastCard.background = ContextCompat.getDrawable(
                        itemView.context,
                        R.drawable.drizzle_bga
                    )
                    itemView.forecastImage.setImageResource(R.drawable.cloud_rain_night)

                }
                "10d" -> {
                    itemView.forecastCard.background = ContextCompat.getDrawable(
                        itemView.context,
                        R.drawable.rainy_bga
                    )
                    itemView.forecastImage.setImageResource(R.drawable.sun_rain)

                }
                "10n" -> {
                    itemView.forecastCard.background = ContextCompat.getDrawable(
                        itemView.context,
                        R.drawable.rainy_bga_ni8
                    )
                    itemView.forecastImage.setImageResource(R.drawable.rainy_night)

                }
                "13d" -> {
                    itemView.forecastCard.background = ContextCompat.getDrawable(
                        itemView.context,
                        R.drawable.rainy_bga
                    )
                    itemView.forecastImage.setImageResource(R.drawable.snow_cloud_day)

                }

                "13n" -> {
                    itemView.forecastCard.background = ContextCompat.getDrawable(
                        itemView.context,
                        R.drawable.rainy_bga
                    )
                    itemView.forecastImage.setImageResource(R.drawable.snow_cloud_night)

                }
                "50d" -> {
                    itemView.forecastCard.background = ContextCompat.getDrawable(
                        itemView.context,
                        R.drawable.mist_bga
                    )
                    itemView.forecastImage.setImageResource(R.drawable.fog_night)

                }
                "50n" -> {
                    itemView.forecastCard.background = ContextCompat.getDrawable(
                        itemView.context,
                        R.drawable.mist_bga
                    )
                    itemView.forecastImage.setImageResource(R.drawable.fog_night)

                }
                "01d" -> {
                    itemView.forecastCard.background = ContextCompat.getDrawable(
                        itemView.context,
                        R.drawable.clear_bga
                    )
                    itemView.forecastImage.setImageResource(R.drawable.sun_)

                }
                "01n" -> {
                    itemView.forecastCard.background = ContextCompat.getDrawable(
                        itemView.context,
                        R.drawable.clear_bga_night
                    )
                    itemView.forecastImage.setImageResource(R.drawable.moon)

                }
                "02d" -> {
                    itemView.forecastCard.background = ContextCompat.getDrawable(
                        itemView.context,
                        R.drawable.cloud_bga
                    )
                    itemView.forecastImage.setImageResource(R.drawable.cloud_day)

                }
                "02n" -> {
                    itemView.forecastCard.background = ContextCompat.getDrawable(
                        itemView.context,
                        R.drawable.cloud_bga_ni8
                    )
                    itemView.forecastImage.setImageResource(R.drawable.cloud_night)

                }
                "03d" -> {
                    itemView.forecastCard.background = ContextCompat.getDrawable(
                        itemView.context,
                        R.drawable.cloud_bga
                    )
                    itemView.forecastImage.setImageResource(R.drawable.cloud_day)
                }
                "03n" -> {
                    itemView.forecastCard.background = ContextCompat.getDrawable(
                        itemView.context,
                        R.drawable.cloud_bga_ni8
                    )
                    itemView.forecastImage.setImageResource(R.drawable.cloud_day)
                }
                "04d" -> {
                    itemView.forecastCard.background = ContextCompat.getDrawable(
                        itemView.context,
                        R.drawable.cloud_bga
                    )
                    itemView.forecastImage.setImageResource(R.drawable.cloud_day)
                }
                "04n" -> {
                    itemView.forecastCard.background = ContextCompat.getDrawable(
                        itemView.context,
                        R.drawable.cloud_bga_ni8
                    )
                    itemView.forecastImage.setImageResource(R.drawable.cloud_day)
                }
                else -> {
                    itemView.forecastCard.background = ContextCompat.getDrawable(
                        itemView.context,
                        R.drawable.cloud_bga
                    )
                    itemView.forecastImage.setImageResource(R.drawable.cloud_day)
                }
            }


        }
    }




        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherForecastHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.weather_forecast_item, parent, false)
            return WeatherForecastHolder(view)
        }

        @RequiresApi(Build.VERSION_CODES.N)
        override fun onBindViewHolder(holder: WeatherForecastHolder, position: Int) {
            forecastList[position].let {
                holder.bind(forecastElement = it)
            }

        }

        override fun getItemCount(): Int = forecastList.size


}
