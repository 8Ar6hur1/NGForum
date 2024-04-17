package org.ngforum.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.ngforum.R
import org.ngforum.constante.SvgImageFromDrawable
import org.ngforum.ui.theme.mainBg

@Composable
fun SplashScreen() {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = mainBg
    ) {
        Box(
            modifier = Modifier.padding(start = 32.dp, end = 32.dp),
            contentAlignment = Alignment.Center
        ) {
            SvgImageFromDrawable(
                drawableResId = R.drawable.text_logo,
                contentDescription = "Logo Text"
            )
        }
    }

}