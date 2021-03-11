package com.dd.daggersample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dd.daggersample.App
import com.dd.daggersample.R
import com.dd.daggersample.models.DatabaseHelper
import com.dd.daggersample.models.NetworkUtils

class MainActivity : AppCompatActivity() {

    private lateinit var databaseHelper: DatabaseHelper
    private lateinit var networkUtils: NetworkUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        databaseHelper = App.getAppComponent().getDatabaseHelper()
        networkUtils = App.getAppComponent().getNetworkUtils()

    }
}