package com.dd.daggersample

import android.app.Application
import com.dd.daggersample.components.AppComponent
import com.dd.daggersample.components.DaggerAppComponent

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }

    companion object {
        private lateinit var appComponent: AppComponent

        fun getAppComponent(): AppComponent {
            return appComponent
        }
    }
}