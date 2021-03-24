package com.dd.daggersample.modules

import com.dd.daggersample.models.DatabaseHelper
import dagger.Module
import dagger.Provides
import javax.inject.Named


@Module
class StorageModule {

    @Named("prod")
    @Provides
    fun provideDatabaseHelper(): DatabaseHelper {
        return DatabaseHelper()
    }

    @Named("test")
    @Provides
    fun provideDatabaseHelper2(): DatabaseHelper {
        return DatabaseHelper()
    }
}