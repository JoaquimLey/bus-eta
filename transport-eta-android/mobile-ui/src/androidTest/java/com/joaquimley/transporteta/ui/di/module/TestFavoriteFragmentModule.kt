package com.joaquimley.transporteta.ui.di.module

import com.joaquimley.transporteta.presentation.home.favorite.FavoritesViewModelFactory
import com.joaquimley.transporteta.ui.home.favorite.FavoritesViewModelProvider
import dagger.Module
import dagger.Provides
import org.mockito.Mockito.mock

@Module
class TestFavoriteFragmentModule {

    companion object {
//        @JvmStatic val favoritesViewModelProvider = mock(FavoritesViewModelProvider::class.java)

        @JvmStatic val favoritesViewModelFactory: FavoritesViewModelFactory = mock(FavoritesViewModelFactory::class.java)
    }

    @Provides
    fun provideViewModelProvider(viewModelFactory: FavoritesViewModelFactory): FavoritesViewModelProvider {
        return FavoritesViewModelProvider(viewModelFactory)
    }


    @Provides
    fun provideFavoritesViewModelFactory(): FavoritesViewModelFactory {
        return favoritesViewModelFactory
    }

//    @Provides
//    fun provideFavoritesViewModelProvider(): FavoritesViewModelProvider {
//        return favoritesViewModelProvider
//    }
}