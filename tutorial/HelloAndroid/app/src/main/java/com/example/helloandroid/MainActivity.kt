package com.example.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var isTapped: Boolean = false
        tapHere.setOnClickListener{
            if (isTapped) {
                isTapped  = false
                textView.text = "ボタンがタップされました"
            } else {
                isTapped = true
                textView.text = "ちわ！あんどろいど"
            }
        }
    }
}
