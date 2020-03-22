package com.gilbert.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Retrofit

class LoginActivity : AppCompatActivity() {

    lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginService = Retrofit.Builder()
            .baseUrl("http://github.com")
            .build()
            .create(LoginService::class.java)

        //create dependency
        val localDataSource = UserLocalDataSource()
        val remoteDataSource = UserRemoteDataSource(loginService)

        val userRepository = UserRepository(localDataSource, remoteDataSource)

        loginViewModel = LoginViewModel(userRepository)

    }
}
