package com.example.businesscard

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.modifier.ModifierLocal
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme
import java.security.AllPermission

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CardCreation("Biswajeet Sahoo")
                }
            }
        }
    }
}

@Composable
fun CardCreation(name:String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(0xFFCDF5AD)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            modifier = Modifier
                .width(150.dp)
                .height(150.dp)
                .background(Color(0xFF052458)),
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(8.dp)
            )
        }
        Text(
            text = "Biswajeet Sahoo",
            color = Color.Black,
            modifier = Modifier
                .padding(top = 8.dp),
            fontSize = 32.sp,
            fontFamily = FontFamily.SansSerif,
        )
        Text(
            text = "Android Developer Extraordinaire",
            color = Color(0xFF267E2A),
            modifier = Modifier
                .padding(top = 8.dp),
            fontSize = 16.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(100.dp))
        Column(
            modifier = Modifier
                .width(250.dp)
        ) {
            val icon = painterResource(id = R.drawable.baseline_phone_enabled_24)
            val icon2 = painterResource(id = R.drawable.baseline_screen_share_24)
            val icon3 = painterResource(id = R.drawable.baseline_mail_24)
            UserDetails(icon = icon, text = "+91-7008210175")
            UserDetails(icon = icon2, text = "@AndroidDev")
            UserDetails(icon = icon3, text = "biswajeet23@gmail.com")
        }
    }
}

@Composable
fun UserDetails(icon: Painter, text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
    ) {
        Icon(
            painter = icon,
            contentDescription = null,
            tint = Color(0xFF1D8321)
        )
        Text(
            text = text,
            modifier = Modifier
                .padding(start = 20.dp),
            color = Color.Black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        CardCreation("Biswajeet Sahoo")
    }
}