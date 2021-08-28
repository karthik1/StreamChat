package com.example.streamchat1

import android.app.Application
import io.getstream.chat.android.client.ChatClient
import io.getstream.chat.android.livedata.ChatDomain
import javax.inject.Inject

class ChatApplication:Application() {

    @Inject
    lateinit var client: ChatClient

    override fun onCreate() {
        super.onCreate()
        ChatDomain.Builder(client, applicationContext).build()
    }
}