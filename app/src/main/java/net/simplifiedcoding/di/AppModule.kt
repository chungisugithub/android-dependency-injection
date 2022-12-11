package net.simplifiedcoding.di

import android.content.Context
import dagger.Module
import dagger.Provides
import net.simplifiedcoding.data.network.AuthApi
import net.simplifiedcoding.data.network.RemoteDataSource
import javax.inject.Singleton

@Module
class AppModule(
    private val context: Context
) {

    @Singleton
    @Provides
    fun provideAuthApi(remoteDataSource: RemoteDataSource) {
        return remoteDataSource.buildApi(AuthApi::class.java, context)
    }
}