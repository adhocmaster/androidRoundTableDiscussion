package com.adhocmaster.roundtablediscussion.pubNub

import android.content.Context
import com.pubnub.api.PubNub
import com.pubnub.api.PNConfiguration
import android.R



object ClientFactory {

    fun createClient(subscribeKey: String, publishKey: String): PubNub {

        val pnConfiguration = PNConfiguration()
        pnConfiguration.subscribeKey = subscribeKey
        pnConfiguration.publishKey = publishKey
        pnConfiguration.isSecure = false

        return PubNub(pnConfiguration)

    }

}