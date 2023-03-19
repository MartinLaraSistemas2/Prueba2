 package com.example.prueba2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.prueba2.ui.theme.Prueba2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Prueba2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Martin")
                }
            }
        }
    }
}

 @Composable
 fun MasSaludos(){
     Column(

     ) {
         Greeting(name = "Android")
         Greeting(name = "803-A")
     }
 }
@Composable
fun Greeting(name: String, modifier: Modifier=Modifier) {
    Column( modifier = Modifier
        .fillMaxWidth()
        .padding(all = 8.dp)
        .background(color = MaterialTheme.colors.secondary)) {
        Text(
            text = "Hello $name!",
            modifier= Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp, horizontal = 8.dp),
            style = MaterialTheme.typography.h5
        )
        Text(
            text = "$name!",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 2.dp, horizontal = 8.dp),
            style = MaterialTheme.typography.subtitle1,
            color=MaterialTheme.colors.primary
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Prueba2Theme {
        //Greeting("Martin")
        //Greeting(name="803-A")
        MasSaludos()
    }
}