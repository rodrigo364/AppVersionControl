package br.com.appversioncontrol.domain.repository

import br.com.appversioncontrol.data.RemoteDataSource.model.ResultListGitHub
import br.com.network.NetworkResult

interface SearchRepositories {
    suspend fun getSearchRepositories() : NetworkResult<ResultListGitHub>
}