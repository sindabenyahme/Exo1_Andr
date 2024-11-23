package com.example.examen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Screen1(navController: NavController) {
    // Utilisation de LazyColumn pour un comportement responsive
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()  // Remplir tout l'écran
            .padding(16.dp),  // Marge de 16dp
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center  // Centrer tout verticalement
    ) {
        item {
            // Texte en haut
            Text(
                text = "Exercice",
                style = androidx.compose.material3.MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(bottom = 32.dp)  // Espacement flexible avant l'image
            )
        }

        item {
            // Affichage de l'image drawable
            Image(
                painter = painterResource(id = R.drawable.un),  // Remplacez avec le nom de votre image
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
                    navController.navigate("exercice2")  // Remplacez par le nom de votre destination
                }
            ) {
                Text("Vers Screen 2")
            }
        }
    }
}


