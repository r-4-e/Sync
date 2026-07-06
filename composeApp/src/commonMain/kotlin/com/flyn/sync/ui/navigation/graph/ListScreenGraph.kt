package com.flyn.sync.ui.navigation.graph

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.flyn.sync.ui.navigation.destination.list.AlbumDestination
import com.flyn.sync.ui.navigation.destination.list.ArtistDestination
import com.flyn.sync.ui.navigation.destination.list.LocalPlaylistDestination
import com.flyn.sync.ui.navigation.destination.list.MoreAlbumsDestination
import com.flyn.sync.ui.navigation.destination.list.PlaylistDestination
import com.flyn.sync.ui.navigation.destination.list.PodcastDestination
import com.flyn.sync.ui.screen.library.LocalPlaylistScreen
import com.flyn.sync.ui.screen.other.AlbumScreen
import com.flyn.sync.ui.screen.other.ArtistScreen
import com.flyn.sync.ui.screen.other.MoreAlbumsScreen
import com.flyn.sync.ui.screen.other.PlaylistScreen
import com.flyn.sync.ui.screen.other.PodcastScreen

@ExperimentalMaterial3Api
@ExperimentalFoundationApi
fun NavGraphBuilder.listScreenGraph(
    innerPadding: PaddingValues,
    navController: NavController,
) {
    composable<AlbumDestination> { entry ->
        val data = entry.toRoute<AlbumDestination>()
        AlbumScreen(
            browseId = data.browseId,
            navController = navController,
        )
    }
    composable<ArtistDestination> { entry ->
        val data = entry.toRoute<ArtistDestination>()
        ArtistScreen(
            channelId = data.channelId,
            navController = navController,
        )
    }
    composable<LocalPlaylistDestination> { entry ->
        val data = entry.toRoute<LocalPlaylistDestination>()
        LocalPlaylistScreen(
            id = data.id,
            navController = navController,
        )
    }
    composable<MoreAlbumsDestination> { entry ->
        val data = entry.toRoute<MoreAlbumsDestination>()
        MoreAlbumsScreen(
            innerPadding = innerPadding,
            navController = navController,
            type = data.type,
            id = data.id,
        )
    }
    composable<PlaylistDestination> { entry ->
        val data = entry.toRoute<PlaylistDestination>()
        PlaylistScreen(
            playlistId = data.playlistId,
            isYourYouTubePlaylist = data.isYourYouTubePlaylist,
            navController = navController,
        )
    }
    composable<PodcastDestination> { entry ->
        val data = entry.toRoute<PodcastDestination>()
        PodcastScreen(
            podcastId = data.podcastId,
            navController = navController,
        )
    }
}