package com.example.starlinktracker.retrofit

import com.google.gson.annotations.SerializedName

data class SateliteResults(
    @SerializedName("startAz")
    val relativeAzimuth: Float,
    @SerializedName("satid")
    val sateliteId: Int,
    @SerializedName("intDesignator")
    val sateliteInternationalDesignator: String,
    @SerializedName("satname")
    val sateliteName: String,
    @SerializedName("launchDate")
    val launchDate: String,
    @SerializedName("satlat")
    val latitude: Float,
    @SerializedName("satlng")
    val longitude: Float,
    @SerializedName("satalt")
    val altitude: Float
)