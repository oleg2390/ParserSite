package org.example

import org.jsoup.Jsoup
import org.jsoup.select.Elements

fun main() {

    val url = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"
    val doc = Jsoup.connect(url).get()
    val quoteElements: Elements = doc.select("div.sc-2aegk7-2")

    for (quote in quoteElements){
        println("${quote.text()}\n")
    }
}