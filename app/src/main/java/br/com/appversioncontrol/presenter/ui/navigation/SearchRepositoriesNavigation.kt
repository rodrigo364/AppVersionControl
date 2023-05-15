package br.com.appversioncontrol.presenter.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.appversioncontrol.presenter.ui.screen.search_repositories.SearchRepositoriesScreen

@Composable
fun SearchRepositoriesNavigation() {

    val navHostController = rememberNavController()
    NavHost(navController = navHostController,
        startDestination = NavigationItems.SearchRepositories.route) {

        composable(NavigationItems.SearchRepositories.route) {
            SearchRepositoriesScreen()
        }

    }
}