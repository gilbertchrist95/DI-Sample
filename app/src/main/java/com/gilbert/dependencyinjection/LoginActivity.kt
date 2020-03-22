package com.gilbert.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Retrofit

class LoginActivity : AppCompatActivity() {

    lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val userRepository = (application as MyApplication)
            .appContainer
            .userRepository

        loginViewModel = LoginViewModel(userRepository)

    }
}
