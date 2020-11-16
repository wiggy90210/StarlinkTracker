package com.example.starlinktracker.retrofit

import com.google.gson.annotations.SerializedName

data class Results(
    @SerializedName("category")
    val category: String,
    @SerializedName("transactionscount")
    val transactionsCount: Int,
    @SerializedName("satcount")
    val satelitesCount: Int,
    @SerializedName("above")
    val sateliteList: List<SateliteResults>
)