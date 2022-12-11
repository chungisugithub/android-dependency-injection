package net.simplifiedcoding.di

import dagger.Component
import dagger.android.AndroidInjectionModule
import net.simplifiedcoding.MyApplication

@Component(modules = [
    AndroidInjectionModule::class,
    LoginFragmentModule::class,
    AppModule::class
])
interface AppComponent {
    fun inject(application: MyApplication)
}