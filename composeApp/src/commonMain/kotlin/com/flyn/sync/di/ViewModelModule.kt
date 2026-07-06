package com.flyn.sync.di

import com.flyn.sync.viewModel.AlbumViewModel
import com.flyn.sync.viewModel.AnalyticsViewModel
import com.flyn.sync.viewModel.ArtistViewModel
import com.flyn.sync.viewModel.HomeViewModel
import com.flyn.sync.viewModel.LibraryDynamicPlaylistViewModel
import com.flyn.sync.viewModel.LibraryViewModel
import com.flyn.sync.viewModel.LocalPlaylistViewModel
import com.flyn.sync.viewModel.LogInViewModel
import com.flyn.sync.viewModel.MoodViewModel
import com.flyn.sync.viewModel.MoreAlbumsViewModel
import com.flyn.sync.viewModel.NotificationViewModel
import com.flyn.sync.viewModel.NowPlayingBottomSheetViewModel
import com.flyn.sync.viewModel.PlaylistViewModel
import com.flyn.sync.viewModel.PodcastViewModel
import com.flyn.sync.viewModel.RecentlySongsViewModel
import com.flyn.sync.viewModel.SearchViewModel
import com.flyn.sync.viewModel.SettingsViewModel
import com.flyn.sync.viewModel.SharedViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule =
    module {
        single {
            SharedViewModel(
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
            )
        }
        single {
            SearchViewModel(
                get(),
                get(),
            )
        }
        viewModel {
            NowPlayingBottomSheetViewModel(
                get(),
                get(),
                get(),
                get(),
            )
        }
        viewModel {
            LibraryViewModel(
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
            )
        }
        viewModel {
            LibraryDynamicPlaylistViewModel(
                get(),
                get(),
            )
        }
        viewModel {
            AlbumViewModel(
                get(),
                get(),
            )
        }
        viewModel {
            HomeViewModel(
                get(),
                get(),
            )
        }
        viewModel {
            SettingsViewModel(
                get(),
                get(),
                get(),
                get(),
                get(),
            )
        }
        viewModel {
            ArtistViewModel(
                get(),
                get(),
                get(),
            )
        }
        viewModel {
            PlaylistViewModel(
                get(),
                get(),
                get(),
            )
        }
        viewModel {
            LogInViewModel(
                get(),
            )
        }
        viewModel {
            PodcastViewModel(
                get(),
            )
        }
        viewModel {
            MoreAlbumsViewModel(
                get(),
            )
        }
        viewModel {
            RecentlySongsViewModel(
                get(),
            )
        }
        viewModel {
            LocalPlaylistViewModel(
                get(),
                get(),
                get(),
            )
        }
        viewModel {
            NotificationViewModel(
                get(),
            )
        }
        viewModel {
            MoodViewModel(
                get(),
                get(),
            )
        }
        viewModel {
            AnalyticsViewModel(
                get(),
                get(),
                get(),
                get(),
                get(),
            )
        }
    }