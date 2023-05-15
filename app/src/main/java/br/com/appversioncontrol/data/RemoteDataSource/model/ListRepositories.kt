package br.com.appversioncontrol.data.RemoteDataSource.model


import RepositoriesInfos
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResultListGitHub(
    @SerialName("incomplete_results")
    val incompleteResults: Boolean,
    @SerialName("items")
    val repositoriesInfos: List<RepositoriesInfos>,
    @SerialName("total_count")
    val totalCount: Int
)