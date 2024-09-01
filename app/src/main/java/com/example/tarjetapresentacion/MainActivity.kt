package com.example.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material3.Icon
import androidx.compose.material3.icons.Icons
import androidx.compose.material3.icons.filled.Call
import androidx.compose.material3.icons.filled.Email
import androidx.compose.material3.icons.filled.Share
import androidx.compose.ui.text.style.TextAlign
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                Surface(color = Color(0xFFD3E3D3)) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.android), // Asegúrate de tener esta imagen en drawable
            contentDescription = "Logo de Android",
            modifier = Modifier.size(100.dp),
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Jennifer Doe",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Text(
            text = "Android Developer Extraordinaire",
            fontSize = 20.sp,
            color = Color(0xFF3DDC84),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(48.dp))
        ContactInfo()
    }
}

@Composable
fun ContactInfo() {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        ContactRow(icon = Icons.Default.Call, contactText = "+11 (123) 444 555 666")
        ContactRow(icon = Icons.Default.Share, contactText = "@AndroidDev")
        ContactRow(icon = Icons.Default.Email, contactText = "jen.doe@android.com")
    }
}

@Composable
fun ContactRow(icon: ImageVector, contactText: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.size(24.dp),
            tint = Color(0xFF3DDC84)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = contactText, fontSize = 16.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    TarjetaPresentacionTheme {
        Surface(color = Color(0xFFD3E3D3)) {
            BusinessCard()
        }
    }
}
