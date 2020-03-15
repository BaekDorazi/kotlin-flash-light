package com.baek.flashlight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        flash_switch.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                val intent = Intent(this, TorchService::class.java)
                intent.action = "on"
                startService(intent)
            } else {
                val intent = Intent(this, TorchService::class.java)
                intent.action = "off"
                startService(intent)
            }
        }
    }
}
