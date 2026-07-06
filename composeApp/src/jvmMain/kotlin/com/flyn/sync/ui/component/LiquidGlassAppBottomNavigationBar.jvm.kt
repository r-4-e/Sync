package com.flyn.sync.ui.component

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.flyn.sync.expect.ui.PlatformBackdrop
import com.flyn.sync.viewModel.SharedViewModel
import kotlin.reflect.KClass

@Composable
actual fun LiquidGlassAppBottomNavigationBar(
    startDestination: Any,
    navController: NavController,
    backdrop: PlatformBackdrop,
    viewModel: SharedViewModel,
    isScrolledToTop: Boolean,
    onOpenNowPlaying: () -> Unit,
    reloadDestinationIfNeeded: (KClass<*>) -> Unit
) {
}