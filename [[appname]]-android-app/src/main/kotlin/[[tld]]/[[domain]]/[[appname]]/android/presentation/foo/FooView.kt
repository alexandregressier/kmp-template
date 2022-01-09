package [[tld]].[[domain]].[[appname]].android.presentation.foo

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import [[tld]].[[domain]].[[appname]].android.[[AppName]]Theme
import [[tld]].[[domain]].[[appname]].shared.Greeting

@Composable
fun FooView() {
    val greeting = Greeting().greeting()

    Box(
        Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text(greeting)
    }
}

@Preview(showBackground = true)
@Composable
private fun FooView_Preview() {
    [[AppName]]Theme {
        FooView()
    }
}