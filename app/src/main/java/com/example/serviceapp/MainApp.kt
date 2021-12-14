package com.example.serviceapp

import android.app.Application
import com.example.serviceapp.di.AppComponent

class MainApp : Application() {

    companion object {
        lateinit var instance: MainApp
            private set
    }

    lateinit var appComponent: AppComponent
        private set
/*
   override fun onCreate() {
       super.onCreate()
       instance = this
       initComponent()
   }

  rivate fun initComponent() {
       appComponent = DaggerAppComponent.builder().netModule(NetModule(this)).dbModule(DbModule(this))
           .build()
       appComponent.inject(this)


   }
    */

}



