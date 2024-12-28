package id.zaxx.kamusgen_z

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import id.zaxx.kamusgen_z.ui.Greeting
import id.zaxx.kamusgen_z.ui.component.auth.signin.FormSignIn
import id.zaxx.kamusgen_z.ui.theme.KamusGenZTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KamusGenZTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    val scope = rememberCoroutineScope()
//                    var text by remember { mutableStateOf("Loading") }
//                    LaunchedEffect(true) {
//                        scope.launch {
//                            text = try {
//                                Greeting().greeting()
//                            } catch (e: Exception) {
//                                e.localizedMessage ?: "error"
//                            }
//                        }
//                    }
//                    GreetingView(text)
                    FormSignIn()
                }
            }
        }
    }
}

@Composable
fun GreetingView(text: String) {
    Text(text = text)
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KamusGenZTheme {
        GreetingView("Hello, Android!")
    }
}