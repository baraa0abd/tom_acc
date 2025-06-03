package com.example.tom_account.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.* // Import all from layout
import androidx.compose.foundation.shape.CircleShape // Import CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
// RoundedCornerShape is still used by your original code, kept if needed elsewhere, but not for circular profile pic
// import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip // Import clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom_account.R

@Composable
fun TopUi() {
    // Outer blue Box - matching target dimensions and removing the y-offset
    Box(
        modifier = Modifier
            .size(400.dp,250.dp)
            .offset(y = (13).dp)
            .background(Color(0xFF226993)),
        contentAlignment = Alignment.TopCenter
    ) {
        Box(
            modifier = Modifier
                .size(width = 113.dp, height = 170.dp) // Correctly sets width and height
                .offset(x = 0.dp, y = 25.dp)          // This offset is different from your specs
        ){
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(4.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .size(64.dp)
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.tomaccpic),
                        contentDescription = "Profile picture",
                        modifier = Modifier
                            .size(64.dp)
                            .clip(RoundedCornerShape(12.dp)) // Corrected shape with 12dp radius
                            .border(
                                width = 1.dp,
                                color = (Color(0xFF226993)), // White border as specified
                                shape = RoundedCornerShape(12.dp) // Same radius for border
                            ),
                        contentScale = ContentScale.Crop // Ensures proper image scaling
                    )
                }
                Box(
                    modifier = Modifier
                        .size(113.dp,45.dp)
                ){
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Tom",
                            style = TextStyle(
                                fontWeight = FontWeight.Medium, // 500 weight
                                fontSize = 18.sp,
                                lineHeight = 18.sp, // 100% of font size (18px)
                                letterSpacing = 0.sp,
                                color = Color(0xFFFFFFFF),

                                )
                        )
                    }
                }
                Box(
                    modifier = Modifier
                        .size(113.dp,18.dp)
                ){
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "specializes in failure!",
                            style = TextStyle(
                                fontWeight = FontWeight.Normal, // 400 weight (use Normal instead of raw value)
                                fontSize = 12.sp,
                                lineHeight = 12.sp, // 100% of 12px font size
                                letterSpacing = 0.sp,
                                color = Color.White // Or Color(0xFFFFFFFF)
                            )
                        )
                    }
                }
//                width: 97;
//                height: 25;
//                gap: 10px;
//                border-radius: 40px;

                Box(
                    modifier = Modifier
                        .size(width = 97.dp, height = 25.dp)
                        .clip(RoundedCornerShape(40.dp))
                ){
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                color = Color(0x1FFFFFFF)
                                )
                            .padding(start = 12.dp, top = 6.dp, end = 12.dp, bottom = 6.dp)
                            ,
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ){
                        Text(
                            text = "Edit foolishness",
                            style = TextStyle(
                                fontFamily = FontFamily.Default, // Replace with IBM Plex Sans Arabic if loaded
                                fontWeight = FontWeight.Medium, // 500 weight
                                fontSize = 10.sp,
                                lineHeight = 10.sp, // 100% of font size
                                letterSpacing = 0.sp,
                                color = Color.White // Text color, optional
                            )
                        )
                    }
                }

            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TopUiPreview() {
    TopUi()
}