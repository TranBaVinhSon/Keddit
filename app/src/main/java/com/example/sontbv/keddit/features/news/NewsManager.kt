package com.example.sontbv.keddit.features.news

import com.example.sontbv.keddit.api.RestAPI
import com.example.sontbv.keddit.commons.RedditNewsItem
import io.reactivex.Observable

class NewsManager(private val api: RestAPI = RestAPI()) {
    fun getNews(limit: String = "10"): Observable<List<RedditNewsItem>> {
        return Observable.create {
            subsriber ->
            val callResponse = api.getNews("", limit)
            val response = callResponse.execute()

            if(response.isSuccessful){
                val news = response.body()!!.data.children.map {
                    val item = it.data
                    RedditNewsItem(item.author, item.title, item.num_comments,
                            item.created, item.thumbnail, item.url)
                }
                subsriber.onNext(news)
                subsriber.onComplete()
            }else{
                subsriber.onError(Throwable(response.message()))
            }
        }
    }
}