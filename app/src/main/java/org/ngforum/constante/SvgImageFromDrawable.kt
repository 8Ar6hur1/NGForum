package org.ngforum.constante

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest

@Composable
fun SvgImageFromDrawable(drawableResId: Int, contentDescription: String) {
    val painter = rememberAsyncImagePainter(
        ImageRequest.Builder(LocalContext.current).data(data = drawableResId)
            .apply(block = fun ImageRequest.Builder.() {
                crossfade(true)
            }).build()
    )
    Image(
        painter = painter,
        contentDescription = contentDescription
    )
}
