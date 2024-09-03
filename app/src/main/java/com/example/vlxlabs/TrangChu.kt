package com.example.vlxlabs

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Preview
@Composable
fun TrangChu(navController: NavController? = null) {
    val context = LocalContext.current
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFECEDEE)) // Adjusted to the blue background from the screenshot
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp, vertical = 20.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.anhlogothuctap),
                contentDescription = "Logo",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp), // Adjust height as necessary
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = Modifier.height(30.dp)) // Adjust space between image and text

            Text(
                text = "VNXLabs is an application with a user-friendly interface and diverse features. It not only connects users with high-quality research products but also creates opportunities for collaboration and development within the research community. It is an ideal place for researchers and organizations to showcase their achievements and seek potential partners for new projects.",
                color = Color.Black, // White text color for contrast
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Justify,
                lineHeight = 24.sp
            )
            Spacer(modifier = Modifier.height(20.dp)) // Adjust space between text and button

            CustomRow(onClick = {
                // navController?.navigate(ROUTE_NAME.login.name)
            })
        }
    }
}

@Composable
fun CustomRow(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .padding(7.dp)
            .width(200.dp)
            .height(50.dp)
            .clip(RoundedCornerShape(25.dp)) // Rounded corners for the button
            .background(Color(0xFF00A1FF)) // Bright blue background color for the button
            .clickable(onClick = onClick)
            .then(modifier)
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Start",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }
    }
}
