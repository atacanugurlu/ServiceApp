package com.example.serviceapp

import android.app.Application
import com.example.serviceapp.di.AppComponent
import com.example.serviceapp.di.DaggerAppComponent
import com.example.serviceapp.di.DbModule
import com.example.serviceapp.di.NetModule

class MainApp : Application() {

    companion object {
        lateinit var instance: MainApp
            private set
    }

    lateinit var appComponent: AppComponent
        private set

   override fun onCreate() {
       super.onCreate()
       instance = this
       initComponent()
   }

  private fun initComponent() {
       appComponent = DaggerAppComponent.builder()
           .build()
       appComponent.inject(this)


   }


}



