package com.dd.daggersample

import com.dd.daggersample.models.DatabaseHelper
import com.dd.daggersample.models.NetworkUtils
import com.dd.daggersample.modules.NetworkModule
import com.dd.daggersample.modules.StorageModule
import dagger.Component


@Component(modules = [StorageModule::class, NetworkModule::class])
interface AppComponent {
    fun getNetworkUtils(): NetworkUtils
    fun getDatabaseHelper(): DatabaseHelper
}

