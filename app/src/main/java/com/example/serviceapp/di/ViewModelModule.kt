package com.example.serviceapp.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.serviceapp.ui.authentication.driver.DriverMainViewModel
import com.example.serviceapp.ui.authentication.login.LoginViewModel
import com.example.serviceapp.ui.authentication.parent.ParentMainViewModel
import com.example.serviceapp.ui.authentication.teacher.TeacherMainViewModel
import com.example.serviceapp.ui.splash.SplashViewModel
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

    @Binds
    @IntoMap
    @ViewModelKey(DriverMainViewModel::class)
    protected abstract fun driverMainViewModel(driverMainViewModel: DriverMainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(TeacherMainViewModel::class)
    protected abstract fun teacherMainViewModel(teacherMainViewModel: TeacherMainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ParentMainViewModel::class)
    protected abstract fun parentMainViewModel(parentMainViewModel: ParentMainViewModel): ViewModel

}

