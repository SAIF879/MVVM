package com.example.mvvm

import android.app.Application
import com.example.mvvm.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin


class MvvmApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MvvmApplication)
            modules(appModule)
        }
    }
}
