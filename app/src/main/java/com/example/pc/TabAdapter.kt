package com.example.pc

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabAdapter(fm: FragmentManager, private val context: Context): FragmentPagerAdapter(fm){

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> { return Tab1Fragment() }
            else ->  { return Tab2Fragment() }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> { return "tab_01" }
            else ->  { return "tab_02" }
        }
    }

    override fun getCount(): Int {
        return 2
    }
}