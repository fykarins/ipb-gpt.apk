package com.example.reposights.ui.document

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.reposights.data.Repository
import com.example.reposights.data.model.Document
import kotlinx.coroutines.launch

class FindDocumentViewModel : ViewModel() {

    private val repository = Repository()

    private val _searchResults = MutableLiveData<List<Document>>()
    val searchResults: LiveData<List<Document>> get() = _searchResults

    fun searchDocuments(query: String) {
        viewModelScope.launch {
            val results = repository.searchDocuments(query) // Ambil hasil pencarian dari repository
            _searchResults.postValue(results)
        }
    }
}
