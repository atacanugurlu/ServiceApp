package com.example.serviceapp.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.serviceapp.feature.authentication.login.LoginViewModel
import com.example.serviceapp.feature.splash.SplashViewModel
import com.example.serviceapp.util.factory.ViewModelFactory
import com.example.serviceapp.util.factory.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
internal abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(SplashViewModel::class)
    protected abstract fun splashViewModel(splashViewModel: SplashViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    protected abstract fun loginViewModel(loginViewModel: LoginViewModel): ViewModel

}

