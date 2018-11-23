package lk.avix.ktor.http

import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import io.ktor.client.request.get

suspend fun main(args: Array<String>) {
    val client = HttpClient(Apache)
    val text = client.get<String>("http://0.0.0.0:9090/")
    println("Response: $text")
}