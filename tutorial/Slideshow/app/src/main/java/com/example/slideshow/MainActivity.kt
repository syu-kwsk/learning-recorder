package com.example.slideshow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {
    class MyAdapter(fm: FragmentActivity) : FragmentStateAdapter(fm){
        private  val resources = listOf(
            R.drawable.slide00, R.drawable.slide01,
            R.drawable.slide02, R.drawable.slide03,
            R.drawable.slide04, R.drawable.slide05,
            R.drawable.slide06, R.drawable.slide07,
            R.drawable.slide08, R.drawable.slide09
        )

        override fun getItemCount(): Int {
            return resources.size
        }

        override fun createFragment(position: Int): Fragment {
            return ImageFragment.newInstance(resources[position])
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pager.adapter = MyAdapter(this)
        val handler = Handler()
        timer(period = 1000) {
            handler.post {
                pager.currentItem = (pager.currentItem + 1) % 10
            }
        }
    }
}