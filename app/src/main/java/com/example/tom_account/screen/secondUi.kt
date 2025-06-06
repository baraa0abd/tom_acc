package com.example.tom_account.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom_account.R

@Composable
fun secondUi() {
    Box(
        modifier = Modifier
            .size(width = 660.dp, height = 621.dp)
            .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
            .background(Color(0xFFEEF4F6))
    )
    {
        Row(
            modifier = Modifier
                .offset(x = 16.dp , y=23.dp)
                .width(328.dp)
                .height(124.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .width(160.dp)
                    .height(58.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color(0xFFD0E5F0))
                    .padding(horizontal = 12.dp, vertical = 8.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Circular Icon
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_6),
                            contentDescription = "Cat icon",
                            modifier = Modifier
                                .fillMaxSize()
                                .background(Color.White, shape = CircleShape)
                                .clip(CircleShape)
                        )
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    // Text Content
                    Column {
                        Text(
                            text = "2M 12K",
                            style = TextStyle(
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 16.sp,
                                color = Color(0x99121212) // #121212 with 60% opacity
                            )
                        )
                        Text(
                            text = "No. of quarrels",
                            style = TextStyle(
                                fontWeight = FontWeight.Medium,
                                fontSize = 12.sp,
                                color = Color(0x5E121212)
                            )
                        )
                    }


                }
            }
            Box(
                modifier = Modifier
                    .width(160.dp)
                    .height(58.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color(0xFFDEEECD))                    .padding(horizontal = 12.dp, vertical = 8.dp)
            ) {
                Column() {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_7),
                            contentDescription = "Cat icon",
                            modifier = Modifier
                                .fillMaxSize()
                                .background(Color.White, shape = CircleShape)
                                .clip(CircleShape)
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .offset(x=15.dp)
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "+500 h",
                        style = TextStyle(
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 16.sp,
                            color = Color(0x99121212) // #121212 with 60% opacity
                        )
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "Chase time",
                        style = TextStyle(
                            fontWeight = FontWeight.Medium,
                            fontSize = 12.sp,
                            color = Color(0x5E121212) // #121212 with 37% opacity
                        )
                    )
                }
            }


            // Repeat similar `Box` here to make the remaining 3 items
        }
        Row(
            modifier = Modifier
                .offset(x = 16.dp , y=23.dp)
                .width(328.dp)
                .height(124.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            Box(
                modifier = Modifier
                    .offset(y = 73.dp)
                    .width(170.dp)
                    .height(65.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color(0xFFF2D9E7)) // Light green background
                    .padding(horizontal = 12.dp, vertical = 8.dp)
            ) {
                Column() {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_9),
                            contentDescription = "Cat icon",
                            modifier = Modifier
                                .fillMaxSize()
                                .background(Color.White, shape = CircleShape)
                                .clip(CircleShape)
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .offset(40.dp)
                    .size(84.dp,42.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "2M 12K",
                        style = TextStyle(
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 16.sp,
                            color = Color(0x99121212) // #121212 with 60% opacity
                        )
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "Hunting times",
                        style = TextStyle(
                            fontWeight = FontWeight.Medium,
                            fontSize = 12.sp,
                            color = Color(0x5E121212) // #121212 with 37% opacity
                        )
                    )
                }
            }
            Box(
                modifier = Modifier
                    .offset(y = 73.dp)
                    .width(170.dp)
                    .height(65.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color(0xFFFAEDCF)) // Light green background
                    .padding(horizontal = 12.dp, vertical = 8.dp)
            ) {
                Column() {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_8),
                            contentDescription = "Cat icon",
                            modifier = Modifier
                                .fillMaxSize()
                                .background(Color.White, shape = CircleShape)
                                .clip(CircleShape)
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .offset(15.dp)
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "3M 7K",
                        style = TextStyle(
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 16.sp,
                            color = Color(0x99121212) // #121212 with 60% opacity
                        )
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "Heartbroken",
                        style = TextStyle(
                            fontWeight = FontWeight.Medium,
                            fontSize = 12.sp,
                            color = Color(0x5E121212) // #121212 with 37% opacity
                        )
                    )
                }
            }


            // Repeat similar `Box` here to make the remaining 3 items
        }
        tom_setting()
        LineDivider()
        fav_food()

    }

}

@Preview
@Composable
fun secondUiPreview() {
    secondUi()
}