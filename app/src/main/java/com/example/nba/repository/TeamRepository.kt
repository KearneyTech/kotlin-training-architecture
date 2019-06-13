package com.example.nba.repository

import com.example.nba.model.Leader
import com.example.nba.model.Team

object TeamRepository {
    private val teams = arrayListOf(
        Team(1, "Winners"),
        Team(2, "Losers")
    )

    private val leadersByPoints = arrayListOf<Leader>(
        Leader("Winners", "Here", "108.1"),
        Leader("Losers", "There","107.5")
    )

    fun getLeadersByPoints(): ArrayList<Leader> {
        return leadersByPoints
    }

    fun getTeams(): ArrayList<Team> {
        return teams
    }

    fun getTeamByID(id: Int): Team {
        return teams[id]
    }
}