package com.example.plusminuscount

import android.util.Log
import android.widget.ListView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {
    //Mutable can change the value for "val"
    //LiveData
    private val _count = MutableLiveData<Int>()

    val count: LiveData<Int>
        get() = _count

    init{
        _count.value = 0
        Log.d("ViewModel", "ViewModel initialized")
    }

    fun incremant(){
        _count.value = _count.value?.plus(1)
    }

    fun decremant(){
        _count.value = _count.value?.minus(1)
    }

    override fun onCleared(){
        Log.d("ViewModel", "ViewModel cleared")
        super.onCleared()
    }
}