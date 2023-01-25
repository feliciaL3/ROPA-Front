package com.example.app

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app.ui.theme.AppTheme

class PendingOrders : androidx.activity.ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                PendingOrd()
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun PendingOrd() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "Pending Orders",
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 20.sp
                        )
                    }
                },
                backgroundColor = Color.White
            )
        }, content = {
            Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(20.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // dummy list
                LazyColumn {
                    items(3) {index ->
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween)
                        {
                            Text(text = "Order #$index",
                                fontWeight = FontWeight.SemiBold)
                            Text(text = "Status:...")
                            Text(text = "Price")
                        }
                    }
                }
                Spacer(modifier = Modifier.height(150.dp))

                Text("Orders in Wait: X")

                Text("Total Price: XXX MDL",
                    fontWeight = FontWeight.SemiBold,)

                Button(
                    onClick = {},
                    modifier = Modifier
                        .height(50.dp)
                        .width(275.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color(0xFFEE6C6C))
                ) {
                    Text(
                        text = "Go Back to Menu",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFFFFFFF)
                    )
                }


                Button(
                    onClick = {},
                    modifier = Modifier
                        .height(50.dp)
                        .width(275.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color(0xFFEE6C6C))
                ) {
                    Text(
                        text = "Check Out",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFFFFFFF)
                    )
                }

            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    AppTheme {
        PendingOrd()
    }
}