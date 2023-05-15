package br.com.appversioncontrol.presenter.ui.screen.search_repositories

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SearchRepositoriesScreen() {

    Box(modifier = Modifier.fillMaxSize()) {
    Greeting(name = "TESTE")
    }

    }

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}