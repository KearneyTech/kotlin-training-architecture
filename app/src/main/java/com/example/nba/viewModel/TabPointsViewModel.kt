package com.example.nba.viewModel

import android.arch.lifecycle.ViewModel
import android.os.SystemClock
import com.example.nba.model.Leader
import com.example.nba.repository.TeamRepository
import io.reactivex.Observable

class TabPointsViewModel: ViewModel() {
    fun getLeadersByPoints(): Observable<ArrayList<Leader>> {
        SystemClock.sleep(5000)
        return TeamRepository.getLeadersByPoints()
    }
}