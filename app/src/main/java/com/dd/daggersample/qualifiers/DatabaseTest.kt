package com.dd.daggersample.qualifiers

import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier


@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class DatabaseTest