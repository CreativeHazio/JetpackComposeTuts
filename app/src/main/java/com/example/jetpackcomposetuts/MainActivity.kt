package com.example.jetpackcomposetuts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposetuts.animations.CircularProgressBar
import com.example.jetpackcomposetuts.animations.IncreaseAnimation
import com.example.jetpackcomposetuts.imageCard.ImageCard
import com.example.jetpackcomposetuts.lists.ScrollableScreen
import com.example.jetpackcomposetuts.rowsColumn.RowsAndColumnHomeScreen
import com.example.jetpackcomposetuts.state.ColorBox
import com.example.jetpackcomposetuts.stylingText.TextStyler
import com.example.jetpackcomposetuts.textviewsButtonsAndSnackBars.UsernameTextField
import com.example.jetpackcomposetuts.ui.theme.JetpackComposeTutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box (
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                
                CircularProgressBar(percentage = 0.8f, number = 100)

            }
        }
    }
}