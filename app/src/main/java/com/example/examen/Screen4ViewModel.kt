package com.example.examen

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class Screen4ViewModel : ViewModel() {


    val wordList = mutableStateListOf<String>()
    fun addWord(){
        wordList.add("coucou")
    }
}