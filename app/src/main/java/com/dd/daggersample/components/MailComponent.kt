package com.dd.daggersample.components

import com.dd.daggersample.modules.MailModule
import dagger.Subcomponent

@Subcomponent(modules = [MailModule::class])
interface MailComponent {


}