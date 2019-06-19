package com.example.nba.repository

import com.example.nba.model.Leader
import com.example.nba.model.Team
import com.google.gson.GsonBuilder
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object TeamRepository {
    private val teams = arrayListOf(
        Team(1, "Winners"),
        Team(2, "Losers")
    )

//    private val leadersByPoints = arrayListOf<Leader>(
//        Leader("Winners", "Los Angeles", "108.1"),
//        Leader("Losers", "There","107.5")
//    )

    fun getLeadersByPoints(): Observable<Leader> {
        val retrofit = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .baseUrl("https://stats.nba.com").build()
        val nbaAPI = retrofit.create(INetworkAPI::class.java)
        return nbaAPI.getPointLeaders().observeOn(Schedulers.io())
    }

    fun getTeams(): ArrayList<Team> {
        return teams
    }

    fun getTeamByID(id: Int): Team {
        return teams[id]
    }
}