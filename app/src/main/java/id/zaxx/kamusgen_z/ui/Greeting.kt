package id.zaxx.kamusgen_z.ui

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText

class Greeting {
    private val client = HttpClient()

    suspend fun greeting(): String {
        val response = client.get("http://localhost:3000/api/v1/kamus")
        return response.bodyAsText()
    }
}