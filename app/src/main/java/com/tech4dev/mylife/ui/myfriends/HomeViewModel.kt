package com.tech4dev.mylife.ui.myfriends

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is myfriends Fragment"
    }
    val text: LiveData<String> = _text
}