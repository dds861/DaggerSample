package com.dd.daggersample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dd.daggersample.App
import com.dd.daggersample.R
import com.dd.daggersample.models.DatabaseHelper
import com.dd.daggersample.models.NetworkUtils
import javax.inject.Inject
import javax.inject.Provider

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var databaseHelper: Provider<DatabaseHelper>

    @Inject
    lateinit var networkUtils: NetworkUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        App.getAppComponent().injectMainActivity(this)

        databaseHelper.get()
    }
}