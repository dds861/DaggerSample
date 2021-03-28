package com.dd.daggersample.components

import android.service.autofill.UserData
import com.dd.daggersample.modules.ExecutorModule
import com.dd.daggersample.modules.UserDataModule
import com.google.common.util.concurrent.ListenableFuture
import dagger.producers.ProductionComponent

@ProductionComponent(modules = [UserDataModule::class, ExecutorModule::class])
interface UserComponent {
    fun getUserData(): ListenableFuture<UserData>
}