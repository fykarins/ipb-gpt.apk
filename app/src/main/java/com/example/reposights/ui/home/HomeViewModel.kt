package com.example.reposights.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.reposights.data.Repository
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private val repository = Repository()

    fun sendMessage(documentId: String, message: String) {
        viewModelScope.launch {
            // Panggil repository untuk mengirim pesan
            repository.sendMessageToDocument(documentId, message)
        }
    }
}
