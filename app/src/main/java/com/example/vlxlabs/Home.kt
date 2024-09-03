package com.example.vlxlabs

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@Composable
fun HomePage(navController: NavController? = null) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        HeaderSection()
        Spacer(modifier = Modifier.height(16.dp))
        FeaturedSection()
        Spacer(modifier = Modifier.height(16.dp))
        ResearchProductCard()
    }
}

@Composable
fun HeaderSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.anhlogothuctap),
            contentDescription = "Logo",
            modifier = Modifier
                .height(40.dp)
        )
        Text(
            text = "Home",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Image(
            painter = painterResource(id = R.drawable.icon), // Thay thế bằng resource hình ảnh của menu
            contentDescription = "Menu",
            modifier = Modifier
                .height(32.dp) // Icon to hơn
                .width(32.dp)  // Icon to hơn
        )
    }
}

@Composable
fun FeaturedSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(Color.LightGray) // Bạn có thể thay đổi màu nền theo hình ảnh thực tế
    ) {
        Image(
            painter = painterResource(id = R.drawable.anhlogothuctap), // Thay thế bằng resource hình ảnh thực tế
            contentDescription = "Featured Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
        )
    }
    Spacer(modifier = Modifier.height(8.dp))
    Text(
        text = "Featured Research Products",
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        modifier = Modifier.padding(start = 8.dp)
    )
}

@Composable
fun ResearchProductCard() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(Color.White)
            .padding(8.dp)
    ) {
        Column {
            Image(
                painter = painterResource(id = R.drawable.anhlogothuctap), // Thay thế bằng resource hình ảnh thực tế
                contentDescription = "Research Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(140.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Research on technology",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Some kind of technology research",
                fontSize = 14.sp,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.anhlogothuctap), // Thay thế bằng resource hình ảnh thực tế
                        contentDescription = "Likes",
                        modifier = Modifier
                            .height(24.dp) // Icon to hơn
                            .width(24.dp)  // Icon to hơn
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(text = "30")
                }
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.anhlogothuctap), // Thay thế bằng resource hình ảnh thực tế
                        contentDescription = "Views",
                        modifier = Modifier
                            .height(24.dp) // Icon to hơn
                            .width(24.dp)  // Icon to hơn
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(text = "30")
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewHomePage() {
    HomePage()
}
