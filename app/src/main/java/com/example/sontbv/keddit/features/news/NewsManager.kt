package com.example.sontbv.keddit.features.news

import com.example.sontbv.keddit.commons.RedditNewsItem
import io.reactivex.Observable

class NewsManager() {
    fun getNews(): Observable<List<RedditNewsItem>> {
        return Observable.create {
            subsriber ->

            val news = mutableListOf<RedditNewsItem>()
            for (i in 1..10) {
                news.add(RedditNewsItem(
                        "author $i",
                        "title $i",
                        i,
                        1457207701L - i * 200,
                        "http://lorempixel.com/200/200/technics/$i",
                        "url"
                ))
            }
            subsriber.onNext(news)
        }
    }
}