package br.com.appversioncontrol.di

import br.com.appversioncontrol.data.RemoteDataSource.service.SearchRepositoriesService
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Singleton
@InstallIn(SingletonComponent::class)
object HttpApiModule {

    @Provides
    @Singleton
    fun providesSearchRepositoriesService(
        retrofit: Retrofit
    ) : SearchRepositoriesService =
        retrofit.create(SearchRepositoriesService::class.java)
}