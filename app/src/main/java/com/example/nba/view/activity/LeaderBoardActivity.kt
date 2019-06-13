package com.example.nba.view.activity

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import com.example.nba.R
import android.support.v4.view.ViewPager
import com.example.nba.view.TabPagerAdapter

class LeaderBoardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leader_board)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        val viewPager = findViewById<ViewPager>(R.id.tabViewPager)
        val fragmentAdapter = TabPagerAdapter(supportFragmentManager, tabLayout.tabCount)
        viewPager.adapter = fragmentAdapter
        tabLayout.setupWithViewPager(viewPager)
    }
}