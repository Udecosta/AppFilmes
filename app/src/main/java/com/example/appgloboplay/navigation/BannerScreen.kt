package com.example.appgloboplay.navigation

import androidx.compose.foundation.BorderStroke
import com.example.appgloboplay.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun BannerScreen(navController: NavHostController) {
    val modifier = Modifier
    Box(modifier = modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.splash), contentDescription = "",
            modifier.fillMaxSize(), contentScale = ContentScale.Crop
        )
        Column(
            modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
             ) {
           Button(
                onClick = { navController.navigate("Home Screen") },
                modifier
                    .padding(bottom = 55.dp, start = 20.dp, end = 20.dp)
                    .fillMaxWidth()
                    .background(color = Color.White.copy(0.8f), RoundedCornerShape(18.dp))

            ) {
                Text(text = "Acessar" ,style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Thin,
                    color = Color.White,
                    fontFamily = FontFamily(Font(R.font.krona_one)),
                    textAlign = TextAlign.Center
                ))
            }
        }
    }
}
