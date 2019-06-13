package com.example.nba.viewModel

import android.arch.lifecycle.ViewModel
import com.example.nba.model.Leader
import com.example.nba.repository.TeamRepository

class TabPointsViewModel: ViewModel() {
    fun getLeadersByPoints(): ArrayList<Leader> {
        return TeamRepository.getLeadersByPoints()
    }
}