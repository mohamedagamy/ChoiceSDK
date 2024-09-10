package com.bluesource.choicesdk_app1

import android.app.Application
import at.bluesource.choicesdk.core.ChoiceSdk
import at.bluesource.choicesdk.core.MobileService

class ChoiceSdkApp : Application() {
    override fun onCreate() {
        super.onCreate()

        ChoiceSdk.init(this, listOf(MobileService.HMS))
    }
}