package com.example.fragmenting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmenting.databinding.ActivityMainBinding
import com.example.swipetabs.FirstFragment
import com.example.swipetabs.SecondFragment
import com.example.swipetabs.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ViewPagerAdapter(supportFragmentManager)

        adapter.addFragment(FirstFragment(),"First")
        adapter.addFragment(SecondFragment(),"Second")


        binding.viewPager.adapter = adapter
        binding.tbLayout.setupWithViewPager(binding.viewPager)


    }
}