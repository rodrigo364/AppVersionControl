package br.com.appversioncontrol.data.RemoteDataSource.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LicenseItem(
    @SerialName("key")
    val key: String,
    @SerialName("name")
    val name: String,
    @SerialName("node_id")
    val nodeId: String,
    @SerialName("spdx_id")
    val spdxId: String,
    @SerialName("url")
    val url: String
)