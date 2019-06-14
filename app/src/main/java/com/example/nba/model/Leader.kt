package com.example.nba.model

import com.google.gson.annotations.SerializedName

//data class Leader(val name: String, val city: String, val category: String)
data class Leader(
    @SerializedName("rowSet") val rowSet: String
)

data class oddBall(
    val rank: String,
    val teamID: String
)