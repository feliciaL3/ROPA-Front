package com.example.app

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app.ui.theme.AppTheme

class CreditCardPayment : androidx.activity.ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                Payment()
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Payment() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "Payment",
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

                Spacer(modifier = Modifier.height(150.dp))

                MyUI()

                Text("Total : XXX MDL",
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
                        text = "Submit Payment",
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

@Composable
private fun MyUI() {

    val creditCard = remember {
        mutableStateOf(TextFieldValue())
    }
    val date = remember {
        mutableStateOf(TextFieldValue())
    }
    val securityNo = remember {
        mutableStateOf(TextFieldValue())
    }


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Column(
            modifier = Modifier
                .padding(5.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            TextField(
                value = creditCard.value,
                onValueChange = { creditCard.value = it },
                placeholder = { Text(text = "xxxx xxxx xxxx ####") },
                label = { Text(text = "Card Number") },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
                singleLine = true,
                trailingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Lock") },
            )

            Spacer(modifier = Modifier.height(10.dp))

            TextField(
                value = date.value,
                onValueChange = { date.value = it },
                placeholder = { Text(text = "MM/YY") },
                label = { Text(text = "Date") },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
                singleLine = true,
            )

            Spacer(modifier = Modifier.height(10.dp))

            TextField(
                value = securityNo.value,
                onValueChange = { securityNo.value = it },
                placeholder = { Text(text = "####") },
                label = { Text(text = "Security No.") },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
                singleLine = true,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview5() {
    AppTheme {
        Payment()
    }
}