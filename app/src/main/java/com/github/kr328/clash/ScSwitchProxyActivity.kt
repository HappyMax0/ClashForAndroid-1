package com.github.kr328.clash

import android.os.Bundle
import com.github.kr328.clash.design.MainDesign
import com.github.kr328.clash.util.startClashService
import com.github.kr328.clash.util.stopClashService


class ScSwitchProxyActivity : BaseActivity<MainDesign>() {
    override suspend fun main() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if(!clashRunning){
            this.startClashService()
        }
        else{
            this.stopClashService()
        }

        //moveTaskToBack(true)

        finish()
    }
}