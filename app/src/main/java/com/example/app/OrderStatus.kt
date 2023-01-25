package com.example.app

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app.ui.theme.AppTheme

class OrderStatus : androidx.activity.ComponentActivity() {
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
fun OrdStatus() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Order Status",
                        textAlign = TextAlign.Center)
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.ArrowBack, "goBack")
                    }
                },
                backgroundColor = Color.White
            )
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
                    .padding(30.dp),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.Start
            ) {
                Row(horizontalArrangement = Arrangement.SpaceBetween) {
                    Text("ETA: XX minutes")
                    Spacer(modifier = Modifier.width(50.dp))
                    Text("Order no. : #XX")
                }

                Text("Time passed: xx minutes")

                Spacer(modifier = Modifier.height(150.dp))

                Row {
                    Canvas(
                        modifier = Modifier
                            .size(15.dp)
                            .offset(0.dp,7.dp),
                        onDraw = {
                            drawCircle(color = Color(0xFFEE6C6C))
                        }
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Text(
                        "Order Placed",
                        // text = "${info.orderPlaced}",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                }

                Row {
                    Canvas(
                        modifier = Modifier
                            .size(15.dp)
                            .offset(0.dp,7.dp),
                        onDraw = {
                            drawCircle(color = Color(0xFFEE6C6C))
                        }
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Text(
                        "Order Confirmed",
                        // text = "${info.orderConfirmation}",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                }

                Row {
                    Canvas(
                        modifier = Modifier
                            .size(15.dp)
                            .offset(0.dp,7.dp),
                        onDraw = {
                            drawCircle(color = Color(0xFF56707C))
                        }
                    )

                    Spacer(modifier = Modifier.width(30.dp))

                    Text(
                        "Order Done!",
                        // text = "${info.orderDone}",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Normal,
                        color = Color.Black
                    )
                }

                Button(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(30.dp)
                        .height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color(0xFFEE6C6C))
                ) {
                    Text(
                        text = "Check Order Items",
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
fun DefaultPreview4() {
    AppTheme {
        OrdStatus()
    }
}