package dev.paulowos.desafiogloboplay.util

import androidx.navigation.NavController
import androidx.navigation.compose.composable
import androidx.navigation.createGraph
import dev.paulowos.desafiogloboplay.ui.screen.HomeScreen

object Routes {
    const val HOME_SCREEN = "home"

    fun navGraph(navController: NavController) =
        navController.createGraph(startDestination = HOME_SCREEN) {
            composable(route = HOME_SCREEN) {
                HomeScreen(navController = navController)
            }
        }
}