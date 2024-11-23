package com.example.examen



import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

@Composable
fun Screen3(navController: NavController, screen3ViewModel: Screen3ViewModel = viewModel()) {
    // Obtenez l'état actuel à partir du ViewModel
    val isTrue by screen3ViewModel.isTrueState

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Affichez l'état actuel
        Text(
            text = if (isTrue) "État Vrai" else "État Faux",
            style = androidx.compose.material3.MaterialTheme.typography.headlineLarge,
            modifier = Modifier.padding(bottom = 32.dp)
        )

        // Bouton pour changer l'état
        Button(
            onClick = { screen3ViewModel.toggleState() },
            modifier = Modifier.padding(bottom = 16.dp)
        ) {
            Text("Changement de l'état")
        }

        // Bouton pour naviguer vers Screen4
        Button(
            onClick = {
                navController.navigate("exercice4")  // Remplacez par le nom de votre destination
            }
        ) {
            Text("Vers Screen 3")
        }
    }
}
