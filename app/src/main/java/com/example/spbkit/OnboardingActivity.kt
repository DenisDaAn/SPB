package com.example.spbkit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.spbkit.nav.Screens
import com.example.spbkit.nav.SetUpNavGraph
import com.example.spbkit.ui.theme.SpbkitTheme
import com.example.spbkit.ui.theme.ThemeFor
import java.util.logging.Logger.global


class OnboardingActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThemeFor {
                val navController = rememberNavController()
                SetUpNavGraph(navController)
            }
        }
    }
}

@Composable
fun OnBoardActivity(navController: NavController) {
    Image(
        painter = painterResource(id = R.drawable.main_background),
        modifier = Modifier.fillMaxSize(),
        contentDescription = "",
        contentScale = ContentScale.Crop
    )
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.main_logo),
                modifier = Modifier
                    .width(500.dp)
                    .height(500.dp),
                contentDescription = ""
            )
            Button(
                onClick = {
                    navController.navigate(Screens.Login.route) {
                        popUpTo(Screens.Login.route) {
                            inclusive = true
                        }
                    }
                }, modifier = Modifier
                    .width(200.dp)
                    .height(50.dp)
            ) {
                Text(
                    text = "Log in",
                    color = Color.Black,
                    fontFamily = FontFamily(Font(R.font.fonts_for_text))
                )
            }
        }
    }
}



