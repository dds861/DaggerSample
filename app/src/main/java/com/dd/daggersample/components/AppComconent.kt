package com.dd.daggersample.components

import com.dd.daggersample.modules.NetworkModule
import com.dd.daggersample.modules.StorageModule
import com.dd.daggersample.ui.MainActivity
import dagger.Component


@Component(modules = [StorageModule::class, NetworkModule::class])
interface AppComponent {
    fun injectMainActivity(mainActivity: MainActivity)
    fun createMailComponent(): MailComponent
}

