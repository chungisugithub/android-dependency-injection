package net.simplifiedcoding.di

import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(modules = [
    AndroidInjectionModule::class,
    LoginFragmentModule::class,
    AppModule::class
])
interface AppComponent {
}