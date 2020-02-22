package com.pratik.demo2.ui.help

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HelpViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Help Fragment"
    }
    val text: LiveData<String> = _text
}
