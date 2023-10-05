package com.septalfauzan.sodoku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.ui.Modifier
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.septalfauzan.sodoku.ui.features.SudokuApp
import com.septalfauzan.sodoku.ui.features.home.HomeVewModel
import com.septalfauzan.sodoku.ui.theme.SodokuTheme
import dagger.hilt.android.AndroidEntryPoint
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SodokuTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val windowSize = calculateWindowSizeClass(this)

                    val homeVewModel: HomeVewModel by viewModels()
                    SudokuApp(homeVewModel = homeVewModel, windowSize = windowSize.widthSizeClass)
                }
            }
        }
    }
}