package dev.paulowos.desafiogloboplay.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.BottomAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.paulowos.desafiogloboplay.R

@Composable
fun BottomNavigation(navController: NavController) {
    BottomAppBar(contentPadding = PaddingValues(horizontal = 16.dp), modifier = Modifier) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxSize()
        ) {
            BottomNavigationItem(
                textId = R.string.home,
                iconId = R.drawable.ic_home,
            ) {}
            BottomNavigationItem(
                textId = R.string.my_list,
                iconId = R.drawable.ic_star_rate,
            ) {}
        }
    }
}