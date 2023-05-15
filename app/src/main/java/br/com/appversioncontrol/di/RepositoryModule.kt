package br.com.appversioncontrol.di

import br.com.appversioncontrol.data.repository.SearchRepositoriesImpl
import br.com.appversioncontrol.domain.repository.SearchRepositories
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Singleton
    @Binds
    fun bindsSearchRepositories(
        searchRepositories: SearchRepositoriesImpl
    ) : SearchRepositories
}