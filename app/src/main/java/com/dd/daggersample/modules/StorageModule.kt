package com.dd.daggersample.modules

import com.dd.daggersample.models.DatabaseHelper
import com.dd.daggersample.qualifiers.DatabaseProd
import com.dd.daggersample.qualifiers.DatabaseTest
import dagger.Module
import dagger.Provides
import javax.inject.Named


@Module
class StorageModule {

    @DatabaseProd
    @Provides
    fun provideDatabaseHelper(): DatabaseHelper {
        return DatabaseHelper()
    }

    @DatabaseTest
    @Provides
    fun provideDatabaseHelper2(): DatabaseHelper {
        return DatabaseHelper()
    }
}