package com.thewizrd.extras

import com.thewizrd.shared_resources.sharedDeps
import com.thewizrd.weathericons.weatherIconsModule

val extrasModule by lazy { ExtrasModule() }

class ExtrasModule internal constructor() {
    var areSubscriptionsSupported: Boolean = false

    fun initialize() {
        weatherIconsModule.initialize()
        sharedDeps.weatherIconsManager.updateIconProvider()
    }

    fun checkPremiumStatus() {}

    fun enableExtras() {}

    fun disableExtras() {}

    fun isEnabled(): Boolean {
        return true
    }

    fun isIconPackSupported(packKey: String?): Boolean {
        return true
    }

    fun isWeatherAPISupported(api: String?): Boolean {
        return true
    }

    fun isPremiumWeatherAPI(api: String?): Boolean {
        return false
    }
}