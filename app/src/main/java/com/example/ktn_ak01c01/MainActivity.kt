package com.example.ktn_ak01c01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pencet_button.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        when(v){
            pencet_button->toGameActivity()
        }
    }
    fun toGameActivity(){
        val intent = Intent(this,GameActivity::class.java)
        intent.putExtra(FIRST_PLAYER,"${player1.text.toString()}")
        intent.putExtra(SECOND_PLAYER,"${player2.text.toString()}")
        startActivity(intent)
    }
}
