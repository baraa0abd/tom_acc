package com.example.tom_account

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.tom_account.screen.TopUi
import com.example.tom_account.screen.buttom
import com.example.tom_account.screen.secondUi

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            TopUi()
            secondUi()
            buttom()

        }
    }
}
@Preview
@Composable
fun GreetingPreview() {
    TopUi()
    secondUi()
    buttom()

}
