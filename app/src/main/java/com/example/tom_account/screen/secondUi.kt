package com.example.tom_account.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun secondUi() {
    Box(
        modifier = Modifier
            .size(width = 460.dp, height = 821.dp)
            .offset(y = 206.dp)
            .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
            .background(Color(0xFFEEF4F6))
    )
    {
        Row(
            modifier = Modifier
                .offset(15.dp)
                .padding(top = 23.dp, start = 16.dp)
                .width(328.dp)
                .height(124.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .width(160.dp)
                    .height(58.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color(0xFFD0E5F0)) // Replace with your actual background
                    .padding(start = 12.dp, end = 12.dp, top = 8.dp, bottom = 8.dp)
            ) {
                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "2M 12K",
                            modifier = Modifier
                                .width(59.dp)
                                .height(24.dp),
                            style = TextStyle(
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 16.sp,
                                lineHeight = 16.sp,
                                letterSpacing = 0.5.sp,
                                textAlign = TextAlign.Center,
                                color = Color(0x99121212) // #12121299
                            )
                        )
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "No. of quarrels",
                            modifier = Modifier
                                .width(88.dp)
                                .height(18.dp),
                            style = TextStyle(
                                fontWeight = FontWeight.Medium,
                                fontSize = 12.sp,
                                lineHeight = 12.sp,
                                letterSpacing = 0.5.sp,
                                textAlign = TextAlign.Center,
                                color = Color(0x5E121212) // #1212125E
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
                    .background(Color(0xFFD0E5F0)) // Replace with your actual background
                    .padding(start = 12.dp, end = 12.dp, top = 8.dp, bottom = 8.dp)
            ) {
                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "2M 12K",
                            modifier = Modifier
                                .width(59.dp)
                                .height(24.dp),
                            style = TextStyle(
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 16.sp,
                                lineHeight = 16.sp,
                                letterSpacing = 0.5.sp,
                                textAlign = TextAlign.Center,
                                color = Color(0x99121212) // #12121299
                            )
                        )
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "No. of quarrels",
                            modifier = Modifier
                                .width(88.dp)
                                .height(18.dp),
                            style = TextStyle(
                                fontWeight = FontWeight.Medium,
                                fontSize = 12.sp,
                                lineHeight = 12.sp,
                                letterSpacing = 0.5.sp,
                                textAlign = TextAlign.Center,
                                color = Color(0x5E121212) // #1212125E
                            )
                        )
                    }
                }
            }


            // Repeat similar `Box` here to make the remaining 3 items
        }
        Row(
            modifier = Modifier
                .offset(x=15.dp,y = 66.dp)
                .padding(top = 23.dp, start = 16.dp)
                .width(328.dp)
                .height(58.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .width(160.dp)
                    .height(58.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color(0xFFD0E5F0)) // Replace with your actual background
                    .padding(start = 12.dp, end = 12.dp, top = 8.dp, bottom = 8.dp)
            ) {
                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "2M 12K",
                            modifier = Modifier
                                .width(59.dp)
                                .height(24.dp),
                            style = TextStyle(
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 16.sp,
                                lineHeight = 16.sp,
                                letterSpacing = 0.5.sp,
                                textAlign = TextAlign.Center,
                                color = Color(0x99121212) // #12121299
                            )
                        )
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "No. of quarrels",
                            modifier = Modifier
                                .width(88.dp)
                                .height(18.dp),
                            style = TextStyle(
                                fontWeight = FontWeight.Medium,
                                fontSize = 12.sp,
                                lineHeight = 12.sp,
                                letterSpacing = 0.5.sp,
                                textAlign = TextAlign.Center,
                                color = Color(0x5E121212) // #1212125E
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
                    .background(Color(0xFFD0E5F0)) // Replace with your actual background
                    .padding(start = 12.dp, end = 12.dp, top = 8.dp, bottom = 8.dp)
            ) {
                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "2M 12K",
                            modifier = Modifier
                                .width(59.dp)
                                .height(24.dp),
                            style = TextStyle(
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 16.sp,
                                lineHeight = 16.sp,
                                letterSpacing = 0.5.sp,
                                textAlign = TextAlign.Center,
                                color = Color(0x99121212) // #12121299
                            )
                        )
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "No. of quarrels",
                            modifier = Modifier
                                .width(88.dp)
                                .height(18.dp),
                            style = TextStyle(
                                fontWeight = FontWeight.Medium,
                                fontSize = 12.sp,
                                lineHeight = 12.sp,
                                letterSpacing = 0.5.sp,
                                textAlign = TextAlign.Center,
                                color = Color(0x5E121212) // #1212125E
                            )
                        )
                    }
                }
            }
        }

        tom_setting()
        fav_food()

    }

}
@Preview
@Composable
fun secondUiPreview() {
    secondUi()
}