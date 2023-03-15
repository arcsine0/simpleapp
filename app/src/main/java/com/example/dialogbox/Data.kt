package com.example.dialogbox

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Data : ViewModel() {
    val username = MutableLiveData<String>()
    val email = MutableLiveData<String>()
    val pass = MutableLiveData<String>()
}