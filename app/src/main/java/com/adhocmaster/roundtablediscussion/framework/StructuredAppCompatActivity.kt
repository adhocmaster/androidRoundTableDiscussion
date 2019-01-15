package com.adhocmaster.roundtablediscussion.framework

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.adhocmaster.roundtablediscussion.R

abstract class StructuredAppCompatActivity: AppCompatActivity(), StructuredActivity {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        processIntents()
        initUIComponents()
        registerEvents()

    }

}