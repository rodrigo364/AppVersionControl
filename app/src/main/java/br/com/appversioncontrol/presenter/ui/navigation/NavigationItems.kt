package br.com.appversioncontrol.presenter.ui.navigation

sealed class NavigationItems(val route: String) {
    object SearchRepositories: NavigationItems("searchRepositories")
}