package id.zaxx.kamusgen_z.ui.component.auth.signin

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import id.zaxx.kamusgen_z.R
import id.zaxx.kamusgen_z.ui.theme.KamusGenZTheme


@Composable
fun FormSignIn(modifier: Modifier = Modifier) {
    KamusGenZTheme {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(top = 100.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,) {
            Image(
                painter = painterResource(R.drawable.jetpack_logo),
                contentDescription = "Logo",
                Modifier.size(width = 100.dp, height = 100.dp) )


            var username by remember { mutableStateOf("") }
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 10.dp, start = 10.dp, top = 30.dp),
                value = username,
                onValueChange = { username = it },
                label = {
                    Text("Nama Lengkap")
                },
                maxLines = 1,
                placeholder = {
                    Text("Masukan Nama Anda")
                }
            )

            var email by remember { mutableStateOf("") }
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 10.dp, start = 10.dp, top = 5.dp),
                value = email,
                onValueChange = { email = it },
                label = {
                    Text("Email")
                },
                maxLines = 1,
                placeholder = {
                    Text("Masukan Email")
                }

            )

            var password by remember { mutableStateOf("") }
            var passwordVisibility by remember { mutableStateOf(false) }

            val icon = if (passwordVisibility) {
                painterResource(id = R.drawable.baseline_visibility_24)
            } else {
                painterResource(id = R.drawable.baseline_visibility_off_24)
            }

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 10.dp, start = 10.dp, top = 5.dp),
                value = password,
                onValueChange = { password = it },
                label = {
                    Text("Password")
                },
                maxLines = 1,
                placeholder = {
                    Text("Masukan Password")
                },
                trailingIcon = {
                    IconButton(onClick = {
                        passwordVisibility = !passwordVisibility
                    }) {
                        Icon(
                            painter = icon,
                            contentDescription = "Show Password"
                        )
                    }
                },
                visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation()

            )

            val mContext = LocalContext.current
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 10.dp, start = 10.dp, top = 5.dp),
                onClick = { mToast(mContext) },
                content = {
                    Text("Daftar", )
                }
            )
        }
    }
}


fun mToast(context : Context) {
    Toast.makeText(context, "Berhasil Daftar", Toast.LENGTH_SHORT).show()
}

@Preview ( showBackground = true)
@Composable
private fun SignInScreenPreview() {
FormSignIn()
}