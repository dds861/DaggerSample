package com.dd.daggersample.models

import dagger.Module

@Module
class NetworkUtils {
    fun getUserData(user: User): User {
        return User(name = user.name)
    }


}