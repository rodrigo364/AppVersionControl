package br.com.appversioncontrol.data.repository

import br.com.appversioncontrol.data.RemoteDataSource.model.ResultListGitHub
import br.com.appversioncontrol.data.RemoteDataSource.service.SearchRepositoriesService
import br.com.appversioncontrol.domain.repository.SearchRepositories
import br.com.network.NetworkResult
import br.com.network.handleApi
import javax.inject.Inject

class SearchRepositoriesImpl @Inject constructor(
private val service: SearchRepositoriesService
) : SearchRepositories {
    override suspend fun getSearchRepositories():  NetworkResult<ResultListGitHub> = handleApi { service.getSearchRepositories() }


}