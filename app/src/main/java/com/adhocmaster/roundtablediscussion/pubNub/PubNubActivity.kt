package com.adhocmaster.roundtablediscussion.pubNub

import com.adhocmaster.roundtablediscussion.R
import com.adhocmaster.roundtablediscussion.framework.StructuredActivity
import com.adhocmaster.roundtablediscussion.framework.StructuredAppCompatActivity
import com.pubnub.api.PubNub

abstract class PubNubActivity: StructuredAppCompatActivity() {

    fun getPubNub(): PubNub {

        return ClientFactory.createClient( getString( R.string.subscribeKey ), getString( R.string.publishKey ) )

    }
}