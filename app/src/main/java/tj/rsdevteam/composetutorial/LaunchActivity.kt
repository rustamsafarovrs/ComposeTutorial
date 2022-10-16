package tj.rsdevteam.composetutorial

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * Created by Rustam Safarov on 10/15/22.
 * github.com/rustamsafarovrs
 */

class LaunchActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                Button(onClick = { openStarter() }) {
                    Text(text = "1. Starter Tutorial")
                }
                Button(onClick = { openBasics() }) {
                    Text(text = "2. Jetpack Compose basics")
                }
            }
        }
    }

    private fun openStarter() {
        startActivity(Intent(this, StarterActivity::class.java))
    }

    private fun openBasics() {
        startActivity(Intent(this, BasicsActivity::class.java))
    }
}