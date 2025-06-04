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
fun buttom(){
    Box(
        modifier = Modifier
            .offset(152.dp,765.dp)
            .size(width = 56.dp, height = 18.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "v.TomBeta", // Replace with v.TomBeta if it's a variable
            style = TextStyle(
                fontWeight = FontWeight.Normal, // 400 weight
                fontSize = 12.sp,
                lineHeight = 12.sp,
                letterSpacing = 0.sp,
                textAlign = TextAlign.Center,
                color = Color(0xFF121212) // #12121299
            ),
            modifier = Modifier.fillMaxWidth() // ensures center alignment if needed
        )
    }
}