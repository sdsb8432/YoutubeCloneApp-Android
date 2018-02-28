package com.app.youtubecloneapp

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by thstj on 2018-02-28.
 */
class HomeAdapter(private val context: Context) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    override fun getItemCount(): Int = 20

    override fun onBindViewHolder(holder: HomeViewHolder?, position: Int) {

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): HomeViewHolder =
            HomeViewHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false))

    class HomeViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    }

}