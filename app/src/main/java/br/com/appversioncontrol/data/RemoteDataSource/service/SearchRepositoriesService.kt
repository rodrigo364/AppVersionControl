package br.com.appversioncontrol.data.RemoteDataSource.service

import br.com.appversioncontrol.data.RemoteDataSource.model.ResultListGitHub
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SearchRepositoriesService {
    @GET
    suspend fun getSearchRepositories(@Query("q") language: String = "language:kotlin",
    @Query("sort") sort: String = "stars", @Query("page") page: Int = 1) : Response<ResultListGitHub>
}