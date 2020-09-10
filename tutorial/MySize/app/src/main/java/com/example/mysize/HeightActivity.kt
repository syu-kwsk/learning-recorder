package com.example.mysize

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.SeekBar
import android.widget.Spinner
import androidx.core.content.edit
import androidx.preference.PreferenceManager
import kotlinx.android.synthetic.main.activity_height.*

class HeightActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_height)

        spinner.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    val spinner = parent as? Spinner
                    val item = spinner?.selectedItem as? String
                    item?.let {
                        if (it.isNotEmpty()) height.text = it
                    }
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
//                    TODO("not implemented")
                }
            }

        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val heightVal = pref.getInt("HEIGHT", 160)
        height.text = heightVal.toString()
        seekBar.progress = heightVal

        seekBar.setOnSeekBarChangeListener(
            object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(
                    seekBar: SeekBar?,
                    progress: Int,
                    fromUser: Boolean
                ) {
                    height.text = progress.toString()
                }

                override fun onStartTrackingTouch(seekBar: SeekBar?) {
//                    TODO("Not yet implemented")
                }

                override fun onStopTrackingTouch(seekBar: SeekBar?) {
//                    TODO("Not yet implemented")
                }

            }
        )
    }

    override fun onPause() {
        super.onPause()
        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        pref.edit {
            putInt("HEIGHT", height.text.toString().toInt())
        }
    }
}