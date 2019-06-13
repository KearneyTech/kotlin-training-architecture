package com.example.nba.view

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.example.nba.R
import com.example.nba.viewModel.TabPointsViewModel

class PointsFragment : Fragment() {
    private lateinit var tabViewModel: TabPointsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tabViewModel = ViewModelProviders.of(this).get(TabPointsViewModel::class.java).apply {  }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // TODO: Define events
        // TODO: Handle events
        // TODO: Fix tab titles

        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_points, container, false)
        updateViews(rootView)

        return rootView
    }

    private fun defineEvents() {}

    private fun updateViews(rootView: View) {
        // Get views by ID
        val textTeam1Name: TextView = rootView.findViewById(R.id.textViewTeam1Name)
        val textTeam1City: TextView = rootView.findViewById(R.id.textViewTeam1City)
        val textTeam1Points: TextView = rootView.findViewById(R.id.textViewTeam1Points)
        val textTeam2Name: TextView = rootView.findViewById(R.id.textViewTeam2Name)
        val textTeam2City: TextView = rootView.findViewById(R.id.textViewTeam2City)
        val textTeam2Points: TextView = rootView.findViewById(R.id.textViewTeam2Points)
        // Get model from viewModel
        val leaders = tabViewModel.getLeadersByPoints()
        // Assign model values to views
        textTeam1Name.text = leaders[0].name
        textTeam1City.text = leaders[0].city
        textTeam1Points.text = leaders[0].category
        textTeam2Name.text = leaders[1].name
        textTeam2City.text = leaders[1].city
        textTeam2Points.text = leaders[1].category
    }
}
