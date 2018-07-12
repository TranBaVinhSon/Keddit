package com.example.sontbv.keddit.features.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.droidcba.kedditbysteps.commons.extensions.inflate
import com.example.sontbv.keddit.R
import com.example.sontbv.keddit.commons.adapter.ViewType
import com.example.sontbv.keddit.commons.adapter.ViewTypeDelegateAdapter

class LoadingDelegateAdapter : ViewTypeDelegateAdapter {
    override fun onCreateViewHolder(parent: ViewGroup) = LoadingViewHolder(parent)

    override fun onBindViewHolder(parent: RecyclerView.ViewHolder, item: ViewType) {
    }

    class LoadingViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder (
        parent.inflate(R.layout.news_item_loading)) {
    }
}