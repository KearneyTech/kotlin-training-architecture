package com.example.nba.model

import com.google.gson.annotations.SerializedName

//data class Leader(val name: String, val city: String, val category: String)
data class Leader(
    @SerializedName("resultSets") val resultSets: ArrayList<Result>
)

data class Result(
    @SerializedName("rowSet") val rowSet: ArrayList<String>? = null
)