import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.VectorPainter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions

object MenuTabScreen : Tab {

    override val options: TabOptions
        @Composable
        get() {
            val icon: VectorPainter = rememberVectorPainter(image = Icons.Default.Menu)
            return remember {
                TabOptions(
                    index = 2u,
                    title = "Menu",
                    icon = icon
                )
            }
        }

    @Composable
    override fun Content() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Green),
        )
    }
}
