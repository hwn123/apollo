package com.kalvinov.apollo.model

import org.jsoup.Jsoup
import javax.lang.model.element.Element

class Parser {
    val wiki = "https://en.wikipedia.org"
    fun parse(){
        val doc = Jsoup.connect("$wiki/wiki/List_of_films_with_a_100%25_rating_on_Rotten_Tomatoes").get()
        doc.select(".wikitable:first-of-type tr td:first-of-type a")    // <2>
            .map { col -> col.attr("href") }    // <3>
            .forEach { println(it) }
    }

    //fun extractMovieData(url: String): Movie? { // <1>
      //
        //return movie
    //}
}