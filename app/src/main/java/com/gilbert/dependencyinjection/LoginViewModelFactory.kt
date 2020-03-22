package com.gilbert.dependencyinjection

interface Factory {
    fun <T> create(claszz: Class<T>): T
}

@Suppress("UNCHECKED_CAST")
class LoginViewModelFactory(private val userRepository: UserRepository): Factory {
    override fun <T> create(claszz: Class<T>): T {
        return LoginViewModel(userRepository) as T
    }
}

