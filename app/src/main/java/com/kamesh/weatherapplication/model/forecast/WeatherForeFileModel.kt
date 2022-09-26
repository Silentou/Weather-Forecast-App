package com.kamesh.weatherapplication.model.forecast

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class WeatherParentModel(
    val list: List<WeatherDataModel>
    ): Parcelable

@Parcelize
data class WeatherDataModel(
    val dt:Long,
    val dt_txt: String,
    val weather:List<WeatherValueModel>,
    val main: MainModel
    ): Parcelable

@Parcelize
data class MainModel(
    val temp: Double
    ): Parcelable

@Parcelize
data class WeatherValueModel(
    val id: Int,
    val main: String,
    val description: String,
    val icon:String
    ): Parcelable