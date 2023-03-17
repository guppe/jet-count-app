package com.example.jetcountapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.jetcountapp.ui.theme.JetCountAppTheme

class MainActivity : ComponentActivity() {
    private val viewModel: CountViewModel by viewModels<CountViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetCountAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CountUp(viewModel = viewModel)
                }
            }
        }
    }
}

@Composable
fun CountUp(viewModel: CountViewModel) {
    val count: Int by viewModel.count
    
    Column {
        Text(text = "$count")
        Button(onClick = { viewModel.onCountUpTapped() }) {
            Text(text = "Count Up!")
        }
    }
}