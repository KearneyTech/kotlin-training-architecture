package com.example.nba.repository

import com.example.nba.model.Team

class TeamRepository {
    private val teams = arrayOf(
        Team(1, "Winners"),
        Team(2, "Losers")
    )

    fun getTeams(): Array<Team> {
        return teams
    }

    fun getTeamByID(id: Int): Team {
        return teams[id]
    }
}