package com.example.examen



import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class Screen3ViewModel : ViewModel() {
    // État booléen initialisé à vrai
    val isTrueState = mutableStateOf(true)


    // Fonction pour inverser l'état
    fun toggleState() {
        isTrueState.value = !isTrueState.value
    }




}
