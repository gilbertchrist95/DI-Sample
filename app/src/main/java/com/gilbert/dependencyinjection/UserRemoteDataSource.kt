package com.gilbert.dependencyinjection

import retrofit2.Call
import retrofit2.http.GET

class UserRemoteDataSource(val loginService: LoginService) {

}

interface LoginService{
    @GET("user")
    fun isAuthentice(): Call<Boolean>
}