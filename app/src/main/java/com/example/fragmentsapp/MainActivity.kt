package com.example.fragmentsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentsapp.fragments.CategoryFragment
import com.example.fragmentsapp.fragments.HomeFragment
import com.example.fragmentsapp.fragments.MensajesFragment
import com.example.fragmentsapp.fragments.OpcionesFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavBar : BottomNavigationView
    private var MainActivityTag = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val homeFragment = HomeFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, homeFragment).commit()
        bottomNavBar = findViewById(R.id.bottom_nav_menu)

        bottomNavBar.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.home_menu -> {
                    val homeFragment = HomeFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container, homeFragment).commit()
                }
                R.id.category_menu -> {
                    val categoryFragment = CategoryFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container, categoryFragment).commit()
                }
                R.id.options_menu -> {
                    val optionsFragment = OpcionesFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container, optionsFragment).commit()
                }
                R.id.messages_menu -> {
                    val messagesFragment = MensajesFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container, messagesFragment).commit()
                }
            }
            true
        }
    }
}