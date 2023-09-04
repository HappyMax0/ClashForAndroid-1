package com.github.kr328.clash

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.github.kr328.clash.design.MainDesign


class ScStartProxyActivity : BaseActivity<MainDesign>() {
    override suspend fun main() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        moveTaskToBack(true)

        if (!clashRunning){
            val broadcastIntent = Intent("com.github.kr328.clash.SERVICE_START")
            sendBroadcast(broadcastIntent)
        }
        else
        {
            val text = R.string.running
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }
        finish()
    }
}