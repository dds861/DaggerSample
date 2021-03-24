package com.dd.daggersample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dd.daggersample.App
import com.dd.daggersample.R
import com.dd.daggersample.models.DatabaseHelper
import com.dd.daggersample.models.NetworkUtils
import com.dd.daggersample.qualifiers.DatabaseProd
import com.dd.daggersample.qualifiers.DatabaseTest
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @DatabaseProd
    @Inject
    lateinit var databaseHelper: DatabaseHelper

    @DatabaseTest
    @Inject
    lateinit var databaseHelper2: DatabaseHelper

    @Inject
    lateinit var networkUtils: NetworkUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        App.getAppComponent().injectMainActivity(this)

    }
}