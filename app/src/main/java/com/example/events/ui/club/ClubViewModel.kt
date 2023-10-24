package com.example.events.ui.club

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ClubViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is clubs Fragment"
    }
    val text: LiveData<String> = _text
}