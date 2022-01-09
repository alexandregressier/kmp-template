package [[tld]].[[domain]].[[appname]].android

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.systemuicontroller.rememberSystemUiController

// Colors ------------------------------------------------------------------------------------------

val Purple200 = Color(0xffbb86fc)
val Purple500 = Color(0xff6200ee)
val Purple700 = Color(0xff3700b3)
val Teal200 = Color(0xff03dac5)

private val LightColors = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200,
)
private val DarkColors = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200,
)

// Typography --------------------------------------------------------------------------------------

private val Typography = Typography(
    body1 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        letterSpacing = 0.5.sp,
    ),
)

// Shapes -------------------------------------------------------------------------------------------

private val Shapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(4.dp),
    large = RoundedCornerShape(0.dp),
)

// Theme -------------------------------------------------------------------------------------------

@Composable
fun [[AppName]]Theme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val systemUiController = rememberSystemUiController()
    val colors = if (useDarkTheme) DarkColors else LightColors

    SideEffect {
        systemUiController.setSystemBarsColor(
            color = colors.surface,
            darkIcons = !useDarkTheme,
        )
    }
    MaterialTheme(colors, Typography, Shapes, content)
}