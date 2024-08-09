package dev.paulowos.desafiogloboplay

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import dev.paulowos.desafiogloboplay.ui.theme.DesafioGloboplayTheme
import dev.paulowos.desafiogloboplay.util.Routes.navGraph

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DesafioGloboplayTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    graph = navGraph(navController),
                    modifier = Modifier.safeContentPadding()
                )
            }

        }
    }
}