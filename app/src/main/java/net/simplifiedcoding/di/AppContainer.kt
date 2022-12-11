package net.simplifiedcoding.di

import net.simplifiedcoding.data.UserPreferences
import net.simplifiedcoding.data.network.AuthApi
import net.simplifiedcoding.data.network.RemoteDataSource
import net.simplifiedcoding.data.repository.AuthRepository

class AppContainer {
    val remoteDataSource = RemoteDataSource()
    val api = remoteDataSource.buildApi(AuthApi::class.java, requireContext())
    val preferences = UserPreferences(requireContext())
    val authRepository = AuthRepository(api, preferences)
}