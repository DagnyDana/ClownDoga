package com.example.mysecondapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import com.example.mysecondapplication.ui.theme.MySecondApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MySecondApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // Variables to store the text state
    var text by remember { mutableStateOf("Hello $name!") }

    // Arrange items in a column with center alignment
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Display text
        Text(text = text)

        Spacer(modifier = Modifier.height(16.dp)) // Add space between the button and text

        // Button to change the text
        Button(onClick = { text = "Button Clicked!" }) {
            Text("Change Text")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MySecondApplicationTheme {
        Greeting("Android")
    }
}
