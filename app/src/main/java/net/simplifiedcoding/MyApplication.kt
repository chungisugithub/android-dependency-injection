package net.simplifiedcoding

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.HasAndroidInjector

class MyApplication : Application(), HasAndroidInjector {
    override fun androidInjector(): AndroidInjector<Any> {

    }

}