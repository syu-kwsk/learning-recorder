package com.example.countdown

import android.content.IntentSender
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    inner class MyCountDownTimer(
        millisInFuture: Long,
        countDownInterVal: Long
    ) : CountDownTimer(
            millisInFuture,
            countDownInterVal
        ) {
        var isRunning = false

        override fun onTick(millisUnitlFinished: Long) {
            val minute = millisUnitlFinished / 1000L / 60L
            val second = millisUnitlFinished / 1000L % 60L
            timeText.text = "%1d:%2$02d".format(minute, second)
        }

        override fun onFinish() {
            timeText.text = "0:00"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        timeText.text = "3:00"
        val timer = MyCountDownTimer(3 * 60 * 1000, 100)
        playStop.setOnClickListener {
            timer.isRunning = when (timer.isRunning) {
                true -> {
                    timer.cancel()
                    playStop.setImageResource(
                        R.drawable.ic_baseline_play_arrow_24
                    )
                    false
                }
                false -> {
                    timer.start()
                    playStop.setImageResource(
                        R.drawable.ic_baseline_stop_24
                    )
                    true
                }
            }
        }
    }
}