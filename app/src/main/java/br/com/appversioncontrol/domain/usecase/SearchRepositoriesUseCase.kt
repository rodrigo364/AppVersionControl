package br.com.appversioncontrol.domain.usecase

import br.com.appversioncontrol.data.RemoteDataSource.model.ResultListGitHub
import br.com.appversioncontrol.domain.repository.SearchRepositories
import br.com.network.NetworkResult
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class SearchRepositoriesUseCase @Inject constructor(
    private val searchRepositories: SearchRepositories
) {

operator fun invoke() = flow {

        when(val response = searchRepositories.getSearchRepositories()) {
        is NetworkResult.Success -> { emit(response.data)}
        is NetworkResult.Error -> { emit("${response.code} - ${response.message}")}
        is NetworkResult.Exception -> { emit("${response.e.message}")}
    }
}
}