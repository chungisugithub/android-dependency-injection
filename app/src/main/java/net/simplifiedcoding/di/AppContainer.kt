package net.simplifiedcoding.di

import android.content.Context
import net.simplifiedcoding.data.UserPreferences
import net.simplifiedcoding.data.network.AuthApi
import net.simplifiedcoding.data.network.RemoteDataSource
import net.simplifiedcoding.data.repository.AuthRepository

class AppContainer(context: Context) {
    val remoteDataSource = RemoteDataSource()
    val api = remoteDataSource.buildApi(AuthApi::class.java, context)
    val preferences = UserPreferences(context)
    val authRepository = AuthRepository(api, preferences)
}