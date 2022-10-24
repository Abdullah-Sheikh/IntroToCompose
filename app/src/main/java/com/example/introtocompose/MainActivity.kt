package com.example.introtocompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.introtocompose.ui.theme.IntroToComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntroToComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    color = Color(0xFF546E74)
                ) {
                    Column(verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "$100",
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 35.sp)
                        Spacer(modifier = Modifier.height(130.dp))

                        CreateCircle()
                    }

                }
            }
        }
    }
}


@Preview
@Composable
fun CreateCircle()
{
        Card(modifier = Modifier
            .size(105.dp)
            .padding(3.dp)
            .clickable { Log.d("Tap", "CreateCircle: Tap ") },
            elevation = 4.dp,

            shape = CircleShape
        ) {
            Box(contentAlignment = Alignment.Center) {

                Text(text = "Tap",  modifier = Modifier)
            }
            
        }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun ShowAge(age: Int = 12)
{
    Text( text= age.toString() )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    IntroToComposeTheme {
        Column {
            CreateCircle()
        }

    }
}