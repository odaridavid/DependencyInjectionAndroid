package dev.davidodari.dependencyinjection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.davidodari.dependencyinjection.ui.theme.DependencyInjectionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DependencyInjectionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CarList(cars = listOf())
                }
            }
        }
    }
}

@Composable
fun CarList(cars: List<Car>) {
    Column(modifier = Modifier.fillMaxSize()) {
        for (car in cars) {
            CarItem(car = car)
        }
        Text(text = "Hello")
    }
}

@Composable
fun CarItem(car: Car) {
    Text(text = car.name)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DependencyInjectionTheme {
        CarList(emptyList())
    }
}
