package com.github.kr328.clash

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.github.kr328.clash.util.startClashService

class StartServiceReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        if("com.github.kr328.clash.SERVICE_START".equals(intent.action)){
            context.startClashService()
        }
    }
}