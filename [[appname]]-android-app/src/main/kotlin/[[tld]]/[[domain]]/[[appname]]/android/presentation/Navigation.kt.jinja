package [[tld]].[[domain]].[[appname]].android.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import [[tld]].[[domain]].[[appname]].android.presentation.bar.BarView
import [[tld]].[[domain]].[[appname]].android.presentation.foo.FooView

private sealed class View(
    val route: String,
    val title: String,
    val icon: ImageVector,
) {
    object Foo : View("foo", "Foo", Icons.Filled.Star)
    object Bar : View("bar", "Bar", Icons.Filled.Favorite)

    companion object {
        val values = listOf(Foo, Bar)
    }
}

@Composable
fun ViewGroup() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomNavigation(
                backgroundColor = MaterialTheme.colors.surface,
                contentColor = MaterialTheme.colors.onSurface,
            ) {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination
                View.values.forEach { view ->
                    val isSelected = currentDestination?.hierarchy?.any { it.route == view.route } == true
                    BottomNavigationItem(
                        icon = { Icon(view.icon, contentDescription = view.title) },
                        label = { Text(view.title) },
                        selected = isSelected,
                        onClick = {
                            navController.navigate(view.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        },
                        selectedContentColor = MaterialTheme.colors.primary,
                        unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.medium),
                    )
                }
            }
        },
    ) { innerPadding ->
        NavHost(navController, startDestination = View.Foo.route, Modifier.padding(innerPadding)) {
            composable(View.Foo.route) {
//                val viewModel = hiltViewModel<FooViewModel>()
                FooView()
            }
            composable(View.Bar.route) {
//                val viewModel = hiltViewModel<BarViewModel>()
                BarView()
            }
        }
    }
}