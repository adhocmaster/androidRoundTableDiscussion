package com.adhocmaster.roundtablediscussion

import android.os.Bundle
import com.adhocmaster.roundtablediscussion.pubNub.PubNubActivity

class MainActivity : PubNubActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun processIntents() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initUIComponents() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun registerEvents() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
