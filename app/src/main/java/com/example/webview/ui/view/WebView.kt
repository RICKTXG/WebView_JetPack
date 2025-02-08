package com.example.webview.ui.view
import android.content.Context
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext


@Composable
fun WebView() {

    val content = LocalContext.current
    val URL by remember { mutableStateOf("https//www.techtorq.com/") }
    val onBackPressedDispatcher = LocalOnBackPressedDispatcherOwner.current?.onBackPressedDispatcher

    val webView = remember {
        android.webkit.WebView(content).apply {


        }
    }
}