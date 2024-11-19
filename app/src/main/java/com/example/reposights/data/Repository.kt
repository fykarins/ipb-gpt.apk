package com.example.reposights.data

import com.example.reposights.data.model.Document

class Repository {

    fun searchDocuments(query: String): List<Document> {
        // Logika pencarian dokumen, contoh hardcoded data
        return listOf(
            Document("1", "Document 1", "Description 1", "file://doc1.pdf"),
            Document("2", "Document 2", "Description 2", "file://doc2.pdf")
        ).filter { it.title.contains(query, ignoreCase = true) }
    }

    suspend fun sendMessageToDocument(documentId: String, message: String) {
        // Logika pengiriman pesan ke dokumen tertentu
        // Contoh simulasi API call
        println("Pesan \"$message\" dikirim ke dokumen ID: $documentId")
    }
}
