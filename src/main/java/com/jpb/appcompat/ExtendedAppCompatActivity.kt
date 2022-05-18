package com.jpb.appcompat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ExtendedAppCompatActivity : AppCompatActivity() {

    private val localeDelegate by lazy {
        LocaleDelegate()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        localeDelegate.onCreate(this)
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        if (localeDelegate.isLocaleChanged) {
            recreate()
        }
    }
}