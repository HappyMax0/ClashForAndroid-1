package com.github.kr328.clash

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.github.kr328.clash.design.MainDesign
import com.github.kr328.clash.util.stopClashService

class ScStopProxyActivity : BaseActivity<MainDesign>() {
    override suspend fun main() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        moveTaskToBack(true)

        if (clashRunning){
            val broadcastIntent = Intent("com.github.kr328.clash.SERVICE_STOP")
            sendBroadcast(broadcastIntent)
        }
        else
        {
            val text = R.string.stopped
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }

        finish()
    }
}