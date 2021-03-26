package com.dd.daggersample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dd.daggersample.App
import com.dd.daggersample.R
import com.dd.daggersample.models.DatabaseHelper
import com.dd.daggersample.modules.MailModule
import com.dd.daggersample.models.NetworkUtils
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

    }
}