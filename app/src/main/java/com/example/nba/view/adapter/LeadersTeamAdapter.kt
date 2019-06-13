package com.example.nba.view.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.example.nba.model.Team

class LeadersTeamAdapter(items: List<Team>): RecyclerView.Adapter<LeadersTeamAdapter.ViewHolder>() {
    var items = items

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }
}