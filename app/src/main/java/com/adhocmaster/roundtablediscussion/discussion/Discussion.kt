package com.adhocmaster.roundtablediscussion.discussion

class Discussion (
    val channelId: String,
    val name: String = "Unnamed discussion"
) {

    val messages: MutableList<Message> = mutableListOf()

}