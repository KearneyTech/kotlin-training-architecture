package com.example.nba.repository

import com.example.nba.model.Leader
import io.reactivex.Observable
import retrofit2.http.GET

interface INetworkAPI {
    @GET("")
    fun getPointLeaders(): Observable<ArrayList<Leader>>
}