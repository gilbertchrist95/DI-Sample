package com.gilbert.dependencyinjection

import android.app.Application

class MyApplication: Application() {

    val appContainer = AppContainer()

}