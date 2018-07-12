package com.example.sontbv.keddit.commons.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

interface ViewTypeDelegateAdapter {
    fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder

    fun onBindViewHolder(parent: RecyclerView.ViewHolder, item: ViewType)
}