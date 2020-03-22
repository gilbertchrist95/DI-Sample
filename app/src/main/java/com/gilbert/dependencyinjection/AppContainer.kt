package com.gilbert.dependencyinjection

import retrofit2.Retrofit

// Container of objects shared across the whole app
class AppContainer {
    private val loginService = Retrofit.Builder()
        .baseUrl("http://github.com")
        .build()
        .create(LoginService::class.java)

    //create dependency
    private val localDataSource = UserLocalDataSource()
    private val remoteDataSource = UserRemoteDataSource(loginService)

    val userRepository = UserRepository(localDataSource, remoteDataSource)

}