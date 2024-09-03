package com.example.vlxlabs

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt

@Composable
fun Otp() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(13.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Divider(
                    color = Color("#BDBDBD".toColorInt()),
                    thickness = 2.dp,
                    modifier = Modifier.width(105.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.anhlogothuctap),
                    contentDescription = null,
                    modifier = Modifier.size(75.dp)
                )
                Divider(
                    color = Color("#BDBDBD".toColorInt()),
                    thickness = 2.dp,
                    modifier = Modifier.width(105.dp)
                )
            }
        }
        Column {
            Text(
                text = "Email",
//                color = colorResource(id = R.color.graySecond),
//                fontFamily = FontFamily(Font(R.font.nunitosans_7pt_condensed_light)),
                fontWeight = FontWeight.Bold,
                fontSize = 17.sp
            )
            TextField(
                value = "",
                onValueChange = {  },
                modifier = Modifier
                    .fillMaxWidth(),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color("#E0E0E0".toColorInt()),
                    unfocusedContainerColor = Color.White,
                    disabledContainerColor = Color.Gray,
                    unfocusedIndicatorColor = Color.Gray,
                ),
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "OTP",
                color = Color.White,
//                fontFamily = FontFamily(Font(R.font.nunitosans_7pt_condensed_light)),
                fontWeight = FontWeight(600),
                fontSize = 17.sp,
                modifier = Modifier
                    .background(Color.Blue)
                    .padding(vertical = 8.dp, horizontal = 24.dp)
                    .clickable { /* Handle Sign Up action */ }
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.Gray,
                        fontSize = 15.sp,
                        fontWeight = FontWeight(600),
//                fontFamily = FontFamily(Font(R.font.nunitosans_7pt_condensed_light))
                    )
                ) {
                    append("Already have an account? ")
                }
                withStyle(
                    style = SpanStyle(
                        color = Color.Black,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
//                fontFamily = FontFamily(Font(R.font.nunitosans_7pt_condensed_light))
                    )
                ) {
                    append("SIGN IN")
                }
            },
                modifier = Modifier.clickable { /* Handle Sign In action */ })
        }
    }
}

