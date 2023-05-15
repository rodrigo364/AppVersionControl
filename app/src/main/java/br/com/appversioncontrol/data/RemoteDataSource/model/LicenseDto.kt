package br.com.appversioncontrol.data.RemoteDataSource.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LicenseDto(
    @SerialName("license")
    val licenseItem: LicenseItem
)