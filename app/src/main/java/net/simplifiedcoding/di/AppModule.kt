package net.simplifiedcoding.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import net.simplifiedcoding.data.network.AuthApi

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
     fun provideAuthApi() : AuthApi {

     }
}