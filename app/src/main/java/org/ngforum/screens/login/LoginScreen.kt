package org.ngforum.screens.login

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.ngforum.R
import org.ngforum.constant.ui.LoginTextField
import org.ngforum.constant.ui.PasswordTextField
import org.ngforum.ui.theme.dMainBg

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
fun LoginScreen(/*navController: NavController*/) {

    Scaffold(modifier = Modifier.fillMaxSize(), content = {
        Surface(
            modifier = Modifier.fillMaxSize(),
            shadowElevation = 8.dp,
            color = dMainBg
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(30.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(
                        id = R.drawable.b_top_text_logo
                    ),
                    contentDescription = "top drawable",
                    modifier = Modifier.padding(start = 42.dp, end = 42.dp)
                )
                Box(
                    modifier = Modifier.padding(top = 140.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column {
                        LoginTextField()
                        Spacer(modifier = Modifier.padding(top = 35.dp))
                        PasswordTextField()
                        Spacer(modifier = Modifier.padding(top = 4.dp))
                        TextButton(
                            onClick = { /*TODO*/ },
                        ) {
                            Text(
                                "Забули пароль?",
                                color = Color.White,
                                fontSize = 15.sp
                            )
                        }
                    }
                }
            }
        }
    })

}
