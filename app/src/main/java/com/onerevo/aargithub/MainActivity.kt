package com.onerevo.aargithub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.onerevo.usersdk.UserSDK

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        UserSDK.getCoreInfo()
    }
}