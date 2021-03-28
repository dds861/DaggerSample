package com.dd.daggersample.ui

import android.os.Bundle
import android.service.autofill.UserData
import androidx.appcompat.app.AppCompatActivity
import com.dd.daggersample.App
import com.dd.daggersample.R
import com.dd.daggersample.components.UserComponent
import com.dd.daggersample.models.DatabaseHelper
import com.dd.daggersample.models.NetworkUtils
import com.dd.daggersample.models.User
import com.dd.daggersample.modules.MailModule
import com.dd.daggersample.modules.UserDataModule
import com.google.common.util.concurrent.FutureCallback
import com.google.common.util.concurrent.Futures
import com.google.common.util.concurrent.ListenableFuture
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var databaseHelper: DatabaseHelper

    @Inject
    lateinit var networkUtils: NetworkUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        App.getAppComponent().injectMainActivity(this)

        App.getAppComponent().createMailComponent(MailModule("text"))


        val user = User()
        val userComponent: UserComponent =
            DaggerUserComponent.builder().userDataModule(UserDataModule(user)).build()

        val listenableFutureUserData: ListenableFuture<UserData> = userComponent.getUserData()

        Futures.addCallback(listenableFutureUserData, object : FutureCallback<UserData?> {
            override fun onSuccess(result: UserData?) {}
            override fun onFailure(t: Throwable) {}
        })

    }
}