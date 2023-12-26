package com.example.testcarddd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testcarddd.ui.theme.TestCardddTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestCardddTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                ) {
                    Column (modifier = Modifier.padding(5.dp)) {
                        LessonCard(title = "What makes great art?", discription = "The know how to help you out", time = "11")
                        LessonCard(title = "What makes great art?", discription = "The know how to help you out", time = "11")

                    }

                }
            }
        }
    }
}

@Composable
fun LessonCard (title:String, discription:String, time:String) {
    Card(modifier = Modifier
        .width(300.dp)
        .height(340.dp),
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        border = BorderStroke(1.dp, color = Color.Gray)
    ){
        Column(modifier = Modifier
            .fillMaxSize(),
            horizontalAlignment = Alignment.Start){


            Image(painterResource(id = R.drawable.thinking_man),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(240.dp)
            )

            
            Text(text = title, fontSize = 20.sp, modifier = Modifier.padding(start = 10.dp))
            Text(text = discription, fontSize = 14.sp,
                color = Color.Gray,
                modifier = Modifier.padding(top = 8.dp, start = 10.dp))

            Row(modifier = Modifier
                .padding(
                    top = 14.dp,
                    start = 10.dp,
                    end = 10.dp
                )
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {

                
                Row {
                    Image(painterResource(id = R.drawable.clock), contentDescription = null, Modifier.size(18.dp))
                    Text(text = time + " minutes", modifier = Modifier.padding(start = 8.dp), color = Color.DarkGray)
                }

                Image(painterResource(id = R.drawable.save), contentDescription = null, modifier = Modifier.size(18.dp))

            }



        }
    }
}

@Preview(showBackground = true)
@Composable
fun LessonCardPreview() {
    TestCardddTheme {
        LessonCard(title = "What makes great art?", discription = "The know how to help you out", time = "11")
    }
}