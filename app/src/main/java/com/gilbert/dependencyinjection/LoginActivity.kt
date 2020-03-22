package com.gilbert.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LoginActivity : AppCompatActivity() {

    lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val appContainer = (application as MyApplication).appContainer

        loginViewModel = appContainer.loginViewModelFactory.create(LoginViewModel::class.java)

    }
}
