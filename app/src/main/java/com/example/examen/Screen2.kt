package com.example.examen

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController



@Composable
fun Screen2(navController: NavController) {
    // Obtenir la configuration actuelle pour détecter l'orientation
    val configuration = LocalConfiguration.current
    val isPortrait = configuration.orientation == Configuration.ORIENTATION_PORTRAIT

    // Utilisation de LazyColumn pour un comportement responsive
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()  // Remplir tout l'écran
            .padding(16.dp),  // Marge de 16dp
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center  // Centrer tout verticalement
    ) {
        item {
            // Texte en haut qui change en fonction de l'orientation
            Text(
                text = if (isPortrait) "Mode portrait" else "Mode paysage",
                style = androidx.compose.material3.MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(bottom = 32.dp)  // Espacement flexible avant l'image
            )
        }

        item {
            // Affichage de l'image qui change en fonction de l'orientation
            Image(
                painter = painterResource(
                    id = if (isPortrait) R.drawable.deux else R.drawable.trois
                ),  // Remplacez les noms des images
                contentDescription = "Image Exercice",
                modifier = Modifier
                    .fillMaxWidth()  // Image occupe toute la largeur disponible
                    .padding(bottom = 32.dp)  // Espacement flexible avant le bouton
            )
        }

        item {
            // Bouton qui navigue vers une autre screen
            Button(
                onClick = {
                    navController.navigate("exercice3")  // Remplacez par le nom de votre destination
                }
            ) {
                Text("Vers Screen 3")
            }
        }
    }
}

