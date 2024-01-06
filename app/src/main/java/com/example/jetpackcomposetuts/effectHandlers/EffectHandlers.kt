package com.example.jetpackcomposetuts.effectHandlers

import androidx.compose.animation.core.Animatable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*

// Effect Handlers are used to do non compose things into compose things
@Composable
fun LaunchedEffectScreen() {
    var text by remember {
        mutableStateOf("")
    }

    val animatable = remember {
        Animatable(0f)
    }

}