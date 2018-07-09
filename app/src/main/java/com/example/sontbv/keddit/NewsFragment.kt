package com.example.sontbv.keddit

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.*
import com.example.sontbv.keddit.commons.inflate
import kotlinx.android.synthetic.main.news_fragment.*

class NewsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.news_fragment)
    }

    private val newsList by lazy {
        news_list.setHasFixedSize(true)
        news_list.layoutManager = LinearLayoutManager(context)
        news_list // this will work as the return type
    }
}
