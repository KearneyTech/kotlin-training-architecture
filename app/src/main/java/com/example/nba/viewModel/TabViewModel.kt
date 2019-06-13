package com.example.nba.viewModel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Transformations
import android.arch.lifecycle.ViewModel
import com.example.nba.model.Team

class TabViewModel: ViewModel() {
    private val index = MutableLiveData<Int>()
    private lateinit var teams: Array<Team>

    val text: LiveData<String> = Transformations.map(index) {
        "Index value: $it"
    }

    fun setIndex(p_index: Int) {
        index.value = p_index
    }
}