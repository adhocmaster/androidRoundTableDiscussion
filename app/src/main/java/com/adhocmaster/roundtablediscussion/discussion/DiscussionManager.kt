package com.adhocmaster.roundtablediscussion.discussion

import com.adhocmaster.roundtablediscussion.user.User
import com.pubnub.api.PubNub
import java.lang.Exception

object DiscussionManager {

    fun create( pubnub:PubNub, owner: User, code: String, name: String ): Discussion {

        val channelId = owner.id.toString() + "-" + code;

        try {

            subscribe( pubnub, channelId )
            val discussion = Discussion( channelId, name )

            return discussion

        } catch ( e: Exception ) {

            throw e

        }


    }
    fun subscribe( pubnub:PubNub, channelId: String ) {

        pubnub.subscribe()
                .channels( listOf( channelId ) )
                .execute()
    }

    fun inviteBySMS( invitees: List<User> ) {
        TODO( "Invite users by SMS" )
    }
    fun inviteByEmail( invitees: List<User> ) {
        TODO( "Invite users by Email" )
    }



}