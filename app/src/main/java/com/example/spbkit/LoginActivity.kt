package com.example.spbkit

import android.os.Bundle
import android.text.Layout
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.spbkit.nav.Screens
import com.example.spbkit.nav.SetUpNavGraph
import com.example.spbkit.ui.theme.SpbkitTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SpbkitTheme {
                SetUpNavGraph(navController = rememberNavController())
            }
        }
    }
}

@Composable
fun LogActivity(navController: NavController) {
    var phone = remember { mutableStateOf("") }
    var password = remember { mutableStateOf("") }
    Image(
        painter = painterResource(id = R.drawable.main_background),
        modifier = Modifier.fillMaxSize(),
        contentDescription = "",
        contentScale = ContentScale.Crop
    )

    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.main_logo),
                modifier = Modifier
                    .height(250.dp)
                    .width(250.dp)
                    .padding(top = 100.dp),
                contentDescription = ""
            )
            TextField(
                phone.value ,
                { phone.value = it },
                textStyle = TextStyle(fontSize = 20.sp, color = Color.White),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                singleLine = true,
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.White // цвет при получении фокуса
                ),
                label = {
                    Text(
                        text = "E-mail",
                        color = Color.White,
                        fontFamily = FontFamily(Font(R.font.fonts_for_text))
                    )
                }
            )
            TextField(
                password.value ,
                { password.value = it },
                textStyle = TextStyle(fontSize = 20.sp, color = Color.White),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                singleLine = true,
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.White // цвет при получении фокуса
                ),
                modifier = Modifier.padding(bottom = 100.dp),
                label = {
                    Text(
                        text = "Password",
                        color = Color.White,
                        fontFamily = FontFamily(Font(R.font.fonts_for_text)),
                    )
                }
            )
            Button(
                onClick = {
                    navController.navigate(Screens.Menu.route) {
                        navController.navigate(Screens.Menu.route) {
                            popUpTo(Screens.Menu.route) {
                                inclusive = true
                            }
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



@Composable
@Preview
fun Previewdsad() {
    LogActivity(navController = rememberNavController())
}