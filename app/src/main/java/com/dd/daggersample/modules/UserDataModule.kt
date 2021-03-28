package com.dd.daggersample.modules

import com.dd.daggersample.models.NetworkUtils
import com.dd.daggersample.models.User
import dagger.producers.ProducerModule
import dagger.producers.Produces


@ProducerModule(includes = [NetworkUtils::class])
class UserDataModule(private val user: User) {

    @Produces
    fun getUserData(networkUtils: NetworkUtils) = networkUtils.getUserData(user)
}

