package com.example.ktn_ak01c01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.activity_main.*

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        val player1Name = intent.getStringExtra(FIRST_PLAYER)
        textView.text = "$player1Name's turn"
    }

    fun handleKlik(view: View) {
        var buttons: Array<Button> =
            arrayOf(btnR0C1, btnR0C2, btnR0C3, btnR1C1, btnR1C2, btnR1C3, btnR2C1, btnR2C2, btnR2C3)
        val player1Name = intent.getStringExtra(FIRST_PLAYER)
        val player2Name = intent.getStringExtra(SECOND_PLAYER)
        for (button in buttons) {
            when (view) {
                button -> {
                    if (textView.text == "$player1Name's turn") {
                        textView.text = "$player2Name's turn"
                        button.text = FIRST_PLAYER_ICON
                        button.isEnabled = false
                    } else {
                        textView.text = "$player1Name's turn"
                        button.text = SECOND_PLAYER_ICON
                        button.isEnabled = false
                    }
                }
            }
        }
    }
}