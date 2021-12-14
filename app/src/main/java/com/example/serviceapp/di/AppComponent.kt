package com.example.serviceapp.di

import android.app.Application
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        NetModule::class,
        DbModule::class,
        ViewModelModule::class
    ]
)

interface AppComponent {
    fun inject(application: Application)

}