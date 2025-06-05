package com.example.tom_account.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
fun LineDivider() {
    Box(
        modifier = Modifier
            .offset(y=360.dp)
            .fillMaxWidth()
            .height(1.dp)  // 1px height
            .background(
                color = Color(0x14001A1F),  // #001A1F with 8% opacity (0x14 alpha)
                shape = RoundedCornerShape(0.dp)  // No rounding for straight line
            )
    )
}
@Composable
fun fav_food() {
    Box(
        modifier = Modifier
            .width(360.dp)
            .height(182.dp)
            .padding(8.dp)
            .offset(y=370.dp)
    ) {
        Column(
            modifier = Modifier.size(360.dp, 270.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Row(
                modifier = Modifier
                    .width(165.dp)
                    .height(30.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End // Align content to the right in the Row
            ) {
                Text(
                    text = "His favorite foods",
                    textAlign = TextAlign.Right,
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        lineHeight = 20.sp,
                        letterSpacing = 0.sp,
                        color = Color(0xDE1F1F1E)
                    ),
                    modifier = Modifier.fillMaxWidth() // Ensures right alignment is respected
                )
            }


            // Settings Item Row
            Row(
                modifier = Modifier
                    .offset(-15.dp)
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
                        painter = painterResource(id = R.drawable.img_3),
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
                        text = "Mouses",
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
                    .offset(-15.dp)
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
                        .background(Color.White)
                        .offset(x = 1.25.dp, y = 3.dp), // Optional if you want to mimic top/left
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_4),
                        contentDescription = "Your image description",
                        modifier = Modifier
                            .size(22.dp)
                            .background(Color.White)

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
                        text = "Last stolen meal",
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
                    .offset(-15.dp)
                    .width(360.dp)
                    .height(40.dp)
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                // Icon Box
                Box(
                    modifier = Modifier
                        .size(40.dp , 50.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color.White)
                        .offset(x = 1.25.dp, y = 3.dp), // Optional if you want to mimic top/left
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_5),
                        contentDescription = "Your image description",
                        modifier = Modifier
                            .size(24.dp)
                            .background(Color.White)
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
                        text = "Change sleep mood",
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