package com.example.pc

import android.annotation.SuppressLint
import android.os.Bundle
import android.content.ContentResolver
//import androidx.support.design.internal.BottomNavigationMenuView
//import androidx.support.design.widget.BottomNavigationView

import android.widget.TextView
import com.example.pc.R
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Context
import androidx.appcompat.app.AppCompatActivity

import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.NavigationUI.setupWithNavController



class MainActivity : AppCompatActivity() {

    //private lateinit var textMessage: TextView
/*
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                //textMessage.setText(R.string.title_home)
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frameLayout, HomeFragment())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notification -> {
                //textMessage.setText(R.string.title_notification)
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frameLayout, NotificationFragment())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_favorite -> {
                //textMessage.setText(R.string.title_favorite)
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frameLayout, FavoriteFragment())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_mypage -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frameLayout, MypageFragment())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
    */

/*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        textMessage = findViewById(R.id.message)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }

*/

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //val navView: BottomNavigationView = findViewById(R.id.nav_view)
        /*
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        //初期表示
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, HomeFragment())
            .commit()
        */
        val navController = findNavController(R.id.nav_host_fragment)
        setupWithNavController(nav_view, navController)
    }


}



