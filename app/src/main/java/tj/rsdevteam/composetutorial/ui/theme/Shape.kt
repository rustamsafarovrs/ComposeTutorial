package tj.rsdevteam.composetutorial.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.dp

/**
 * Created by Rustam Safarov on 10/15/22.
 * github.com/rustamsafarovrs
 */

data class Shape(
    val default: RoundedCornerShape = RoundedCornerShape(0.dp),
    val small: RoundedCornerShape = RoundedCornerShape(4.dp),
    val medium: RoundedCornerShape = RoundedCornerShape(8.dp),
    val large: RoundedCornerShape = RoundedCornerShape(16.dp)
)

val LocalShape = compositionLocalOf { Shape() }

val MaterialTheme.shape: Shape
    @Composable
    @ReadOnlyComposable
    get() = LocalShape.current
