package com.example.nba.view

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.nba.R
import com.example.nba.viewModel.TabPointsViewModel


/**
 * A simple [Fragment] subclass.
 *
 */
class PointsFragment : Fragment() {
    private lateinit var tabViewModel: TabPointsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tabViewModel = ViewModelProviders.of(this).get(TabPointsViewModel::class.java).apply {  }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_points, container, false)
    }


}
