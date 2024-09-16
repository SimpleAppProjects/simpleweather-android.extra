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

    fun enablePremiumAccess() {}

    fun enableProAccess() {}

    fun disableExtras() {}

    fun disableProAccess() {}

    fun disablePremiumAccess() {}

    fun isAtLeastProEnabled(): Boolean = isProEnabled() || isPremiumEnabled()

    fun isPremiumEnabled(): Boolean = true

    fun isProEnabled(): Boolean = true

    fun isIconPackSupported(packKey: String?): Boolean = true

    fun isWeatherAPISupported(api: String?): Boolean = true

    fun isPremiumWeatherAPI(api: String?): Boolean = false
}