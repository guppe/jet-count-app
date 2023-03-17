package com.example.jetcountapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {
    val count: MutableState<Int> = mutableStateOf(0)

    fun onCountUpTapped() {
        val currentValue = requireNotNull(count.value)
        count.value = currentValue + 1
    }

}