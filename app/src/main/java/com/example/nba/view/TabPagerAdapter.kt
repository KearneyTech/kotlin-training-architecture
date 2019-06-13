package com.example.nba.view

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class TabPagerAdapter(fragmentMgr: FragmentManager, private var tabCount: Int):
        FragmentPagerAdapter(fragmentMgr) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> PointsFragment()
            1 -> ReboundsFragment()
            else -> AssistsFragment()
        }
    }

    override fun getCount(): Int {
        return tabCount
    }
}