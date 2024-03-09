import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import screens.MainScreen

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        MainScreen()
    }
}
