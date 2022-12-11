package net.simplifiedcoding.di

import dagger.Module
import dagger.Provides
import net.simplifiedcoding.data.network.AuthApi
import net.simplifiedcoding.data.network.RemoteDataSource
import javax.inject.Singleton

@Module
class AppModule(

) {

    @Singleton
    @Provides
    fun provideAuthApi(remoteDataSource: RemoteDataSource) {
        remoteDataSource.buildApi(AuthApi::class.java,)
    }
}