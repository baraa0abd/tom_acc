package com.example.tom_account.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom_account.R

@Composable
fun fav_food() {
    Box(
        modifier = Modifier
            .width(360.dp)
            .height(182.dp)
            .padding(8.dp)
            .offset(y=350.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // Title Row
            Row(
                modifier = Modifier
                    .width(120.dp)
                    .height(30.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Tom settings",
                    style = TextStyle(
                        fontFamily = FontFamily.SansSerif, // Replace with IBM Plex if imported
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        lineHeight = 20.sp,
                        letterSpacing = 0.sp,
                        textAlign = TextAlign.Right,
                        color = Color(0xDE1F1F1E) // #1F1F1EDE
                    )
                )
            }

            // Settings Item Row
            Row(
                modifier = Modifier
                    .width(360.dp)
                    .height(40.dp)
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                // Icon Box
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color.White), // Replace with actual icon or image
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img),
                        contentDescription = "Your image description",
                        modifier = Modifier
                            .size(24.dp)
                            .background(Color.White),

                        )

                }

                // Text Box
                Box(
                    modifier = Modifier
                        .width(165.dp)
                        .height(24.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "Change sleeping place",
                        style = TextStyle(
                            fontFamily = FontFamily.SansSerif, // Replace with IBM Plex
                            fontWeight = FontWeight.Medium,
                            fontSize = 16.sp,
                            lineHeight = 16.sp,
                            color = Color(0xDE1F1F1E) // #1F1F1EDE
                        )
                    )
                }
            }

            Row(
                modifier = Modifier
                    .width(360.dp)
                    .height(40.dp)
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                // Icon Box
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color.White), // Replace with actual icon or image
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "Your image description",
                        modifier = Modifier
                            .size(40.dp)
                            .background(Color.White),

                        )

                }

                // Text Box
                Box(
                    modifier = Modifier
                        .width(165.dp)
                        .height(24.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "Meow settings",
                        style = TextStyle(
                            fontFamily = FontFamily.SansSerif, // Replace with IBM Plex
                            fontWeight = FontWeight.Medium,
                            fontSize = 16.sp,
                            lineHeight = 16.sp,
                            color = Color(0xDE1F1F1E) // #1F1F1EDE
                        )
                    )
                }
            }

            Row(
                modifier = Modifier
                    .width(360.dp)
                    .height(40.dp)
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                // Icon Box
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color.White), // Replace with actual icon or image
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_1),
                        contentDescription = "Your image description",
                        modifier = Modifier
                            .size(40.dp)
                            .background(Color.White),

                        )

                }

                // Text Box
                Box(
                    modifier = Modifier
                        .width(205.dp)
                        .height(24.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "Password to open the fridge",
                        style = TextStyle(
                            fontFamily = FontFamily.SansSerif, // Replace with IBM Plex
                            fontWeight = FontWeight.Medium,
                            fontSize = 16.sp,
                            lineHeight = 16.sp,
                            color = Color(0xDE1F1F1E) // #1F1F1EDE
                        )
                    )
                }
            }
        }
    }
}