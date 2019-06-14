package com.example.nba.view.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.nba.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class FullscreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fullscreen)
        Log.d("Main", "Starting")
        val intent = Intent(this, LeaderBoardActivity::class.java).apply {  }

        val job = GlobalScope.launch(Dispatchers.Main) {
            delay(3000)
            startActivity(intent)
        }
    }
}
