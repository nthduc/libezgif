/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package dev.nthduc.ezgif

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.request.forms.*
import io.ktor.client.statement.*
import org.jsoup.Jsoup


class EzGifLibrary {
    private val client = HttpClient()

    suspend fun webp2gif(source: String): String {
        val getUrl = client.get("https://ezgif.com/webp-to-gif?url=$source")
        val postUrl = getUrl.request.url.toString()
        val parts = postUrl.split('/')
        val lastPart = parts.last()

        val res = client.submitFormWithBinaryData(
            url = "https://ezgif.com/webp-to-gif/$lastPart?ajax=true",
            formData = formData {
                append("file", lastPart)
            },
        )

        val document = Jsoup.parse(res.bodyAsText())
        val saveUrl = document.select("p.outfile img").attr("src")

        return "https:$saveUrl"
    }
    suspend fun jpg2webp(source: String): String {
        val getUrl = client.get("https://ezgif.com/jpg-to-webp?url=$source")
        val postUrl = getUrl.request.url.toString()
        val parts = postUrl.split('/')
        val lastPart = parts.last()

        val res = client.submitFormWithBinaryData(
            url = "https://ezgif.com/jpg-to-webp/$lastPart?ajax=true",
            formData = formData {
                append("file", lastPart)
            },
        )

        val document = Jsoup.parse(res.bodyAsText())
        val saveUrl = document.select("p.outfile img").attr("src")

        return "https:$saveUrl"
    }
    suspend fun png2webp(source: String): String {
        val getUrl = client.get("https://ezgif.com/png-to-webp?url=$source")
        val postUrl = getUrl.request.url.toString()
        val parts = postUrl.split('/')
        val lastPart = parts.last()

        val res = client.submitFormWithBinaryData(
            url = "https://ezgif.com/png-to-webp/$lastPart?ajax=true",
            formData = formData {
                append("file", lastPart)
            },
        )

        val document = Jsoup.parse(res.bodyAsText())
        val saveUrl = document.select("p.outfile img").attr("src")

        return "https:$saveUrl"
    }
}