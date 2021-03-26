package com.dd.daggersample.modules

import dagger.Module

@Module
class MailModule(private val text: String) {
}