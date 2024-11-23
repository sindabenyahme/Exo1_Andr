package com.example.examen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Screen4(navController: NavController, screen4ViewModel: Screen4ViewModel = viewModel()) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Grille pour afficher les mots
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),  // La grille prend l'espace disponible
            contentPadding = PaddingValues(8.dp)
        ) {
            items(screen4ViewModel.wordList.size) { index ->
                Text(
                    text = screen4ViewModel.wordList[index],
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth(),
                    style = androidx.compose.material3.MaterialTheme.typography.bodyLarge
                )
            }
        }

        // Bouton pour ajouter un mot
        Button(
            onClick = { screen4ViewModel.addWord() },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text("Ajouter mot")
        }
    }
}
