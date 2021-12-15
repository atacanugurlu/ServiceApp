package com.example.serviceapp.data.model

import com.example.serviceapp.util.network.AuthenticationType

data class User(
    val email:String,
    val id:String,
    val authenticationType: AuthenticationType
)
/*
{
    constructor(authData:FirebaseUserLiveData){
        this.email = authData.email
    }
}

 */