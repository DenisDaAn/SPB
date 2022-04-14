package com.example.spbkit.bottomnav.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import com.example.spbkit.R
import androidx.compose.ui.unit.dp

@Composable
fun TimetableScreen() {
    Image(
        painter = painterResource(id = R.drawable.main_background),
        modifier = Modifier.fillMaxSize(),
        contentDescription = "",
        contentScale = ContentScale.Crop
    )
    val time = listOf(
        "09:00",
        "11:05",
        "13:10",
        "14:55"
    )
    val subjectMonday = listOf(
        "None",
        "Проектироване БД (307)",
        "Физкультура (спортзал)",
        "ИСРПО (213)"
    )
    val tableData = (0..3).mapIndexed { index, item ->
        index to time[index]
    }
    LazyColumn(
        Modifier
            .fillMaxSize()
            .padding(30.dp)
    ) {
        item {
            Row(Modifier.background(Color.Transparent)) {
                TableCell(text = "Monday", weight = .10f)
            }
        }
        item {
            Row(Modifier.background(Color.Transparent)) {
                TableCell(text = "Time", weight = .3f)
                TableCell(text = "Subject", weight = .7f)
            }
        }
        items(tableData) {
            val (id, text) = it
            Row(Modifier.fillMaxWidth()) {
                TableCell(text = text, weight = .3f)
                TableCell(text = subjectMonday[id], weight = .7f)
            }
        }

    }
    LazyColumn(
        Modifier
            .fillMaxSize()
            .padding(top = 330.dp, start = 30.dp, end = 30.dp)
    ) {
        item {
            Row(Modifier.background(Color.Transparent)) {
                TableCell(text = "Tuesday", weight = .10f)
            }
        }
        item {
            Row(Modifier.background(Color.Transparent)) {
                TableCell(text = "Time", weight = .3f)
                TableCell(text = "Subject", weight = .7f)
            }
        }
        items(tableData) {
            val (id, text) = it
            Row(Modifier.fillMaxWidth()) {
                TableCell(text = text, weight = .3f)
                TableCell(text = subjectMonday[id], weight = .7f)
            }
        }

    }
    LazyColumn(
        Modifier
            .fillMaxSize()
            .padding(top = 630.dp, start = 30.dp, end = 30.dp)
    ) {
        item {
            Row(Modifier.background(Color.Transparent)) {
                TableCell(text = "Wednesday", weight = .10f)
            }
        }
        item {
            Row(Modifier.background(Color.Transparent)) {
                TableCell(text = "Time", weight = .3f)
                TableCell(text = "Subject", weight = .7f)
            }
        }
        items(tableData) {
            val (id, text) = it
            Row(Modifier.fillMaxWidth()) {
                TableCell(text = text, weight = .3f)
                TableCell(text = subjectMonday[id], weight = .7f)
            }
        }

    }

}


@Composable
fun RowScope.TableCell(
    text: String,
    weight: Float
) {
    Text(
        text = text,
        Modifier
            .border(0.5.dp, Color.White)
            .weight(weight)
            .padding(10.dp)
    )
}

