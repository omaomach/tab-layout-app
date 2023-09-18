package com.omao.tablayoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.omao.tablayoutapp.adapter.ViewPagerAdapter

class MainActivity : AppCompatActivity() {

    val tabsArray = arrayOf("Games", "Movies","Books")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager: ViewPager2 = findViewById(R.id.view_pager)
        val tabLayout: TabLayout = findViewById(R.id.tab_layout)

        val my_adapter = ViewPagerAdapter(
            supportFragmentManager,
            lifecycle
        )

        viewPager.adapter = my_adapter

        // Connecting the viewpager with tab layout
        TabLayoutMediator(tabLayout, viewPager) {
            tab, position -> tab.text = tabsArray[position]
        }.attach()

    }
}