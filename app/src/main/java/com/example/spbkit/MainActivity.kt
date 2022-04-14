package com.example.spbkit

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.spbkit.ui.theme.SpbkitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SpbkitTheme {
                Greeting()

            }
            object : CountDownTimer(3000, 10000) {
                override fun onTick(millisUntilFinished: Long) {
                }

                override fun onFinish() {
                    val intent = Intent(this@MainActivity, OnboardingActivity::class.java)
                    startActivity(intent)
                }
            }.start()
        }
    }
}

@Composable
fun Greeting() {
    Image(
        painter = painterResource(id = R.drawable.main_background),
        modifier = Modifier.fillMaxSize(),
        contentDescription = "",
        contentScale = ContentScale.Crop
    )
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            text = "Student\nhunter",
            color = Color.White,

            fontSize = 75.sp,
            textAlign = TextAlign.Center,
            fontFamily = FontFamily(Font(R.font.standart_font))
        )

    }
}