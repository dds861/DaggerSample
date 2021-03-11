package com.dd.daggersample.modules

import com.dd.daggersample.models.DatabaseHelper
import dagger.Module
import dagger.Provides


@Module
class StorageModule {

    @Provides
    fun provideDatabaseHelper(): DatabaseHelper {
        return DatabaseHelper()
    }
}