package com.example.myfirstapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myfirstapp.ui.theme.MyFirstAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(
                modifier = Modifier
                    .padding(top = 60.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                ListItems("Bogdan", "Developer")
                ListItems("Bogdan", "Developer")
                ListItems("Bogdan", "Developer")
                ListItems("Bogdan", "Developer")
                ListItems("Bogdan", "Developer")
                ListItems("Bogdan", "Developer")
                ListItems("Bogdan", "Developer")
                ListItems("Bogdan", "Developer")
                ListItems("Bogdan", "Developer")
                ListItems("Bogdan", "Developer")
            }
        }
    }
}

@Composable
private fun ListItems(name: String, prof: String) {
    var counter = remember {
        mutableStateOf(0)
    }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .clickable {
                counter.value++
            },
//            .offset(10.dp, 5.dp)
//            .pointerInput(Unit) {
//                Long press and drag
//                detectDragGesturesAfterLongPress { change, dragAmount ->
//                    if (dragAmount.x > 20) {
//                        Log.d("MyLog", "Longer than 20")
//                    }
//                }
//                Tap
//                detectTapGestures {
//                    Log.d("MyLog", "$it")
//                }
//                Only horizontal drag
//                detectHorizontalDragGestures { change, dragAmount ->
//                    Log.d("MyLog", "$dragAmount")
//                }
//            },

        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Box() {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.photo2),
                    contentDescription = "Text",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(10.dp)
                        .size(64.dp)
                        .clip(CircleShape)
                )
                Column(modifier = Modifier.padding(start = 8.dp)) {
                    Text(text = counter.value.toString())
                    Text(text = prof)
                }
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun NewText() {
//    Text(text = "Hello")
//}

//Row(
//modifier = Modifier
//.background(Color.Gray)
//.fillMaxWidth()
//.fillMaxHeight(0.5f),
//verticalAlignment = Alignment.Top
//) {
//    Column(
//        modifier = Modifier
//            .background(Color.Red)
//            .fillMaxHeight()
//            .fillMaxWidth(0.5f),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.SpaceAround
//    ) {
//        Text(text = "1")
//        Text(text = "2")
//        Text(text = "3")
//    }
//    Column(
//        modifier = Modifier
//            .background(Color.Yellow)
//            .fillMaxHeight()
//            .fillMaxWidth(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.SpaceAround
//    ) {
//        Text(text = "4")
//        Text(text = "5")
//        Text(text = "6")
//    }
//}