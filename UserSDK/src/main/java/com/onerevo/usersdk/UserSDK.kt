package com.onerevo.usersdk

import com.onerevo.core.Core

object UserSDK {

    fun getCoreInfo(): String {
        return Core.getString()
    }
}