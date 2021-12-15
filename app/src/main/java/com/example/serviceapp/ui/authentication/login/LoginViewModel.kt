package com.example.serviceapp.ui.authentication.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import com.example.serviceapp.data.model.FirebaseUserLiveData
import com.example.serviceapp.util.network.AuthenticationState
import javax.inject.Inject

class LoginViewModel @Inject constructor(): ViewModel() {


    val authenticationState = FirebaseUserLiveData().map { user ->
        if (user != null) {
            AuthenticationState.AUTHENTICATED
        } else {
            AuthenticationState.UNAUTHENTICATED
        }
    }
}