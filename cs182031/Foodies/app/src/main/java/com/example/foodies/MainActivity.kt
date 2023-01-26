package com.example.foodies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.foodies.fragments.add.Fragment_Add
import com.example.foodies.fragments.list.Fragment_List
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inflateFragment(Fragment_List.newInstance())

        val bottomBar = findViewById<BottomNavigationView>(R.id.bottom_bar)

        bottomBar.setOnItemSelectedListener { menuItem ->

            when (menuItem.itemId) {
                R.id.nav_list -> {
                    inflateFragment(Fragment_List.newInstance())
                }

                R.id.nav_add -> {
                    inflateFragment(Fragment_Add.newInstance())
                }

                R.id.nav_favourites -> {
                    inflateFragment(Fragment_Favourites.newInstance())
                }
            }



            true
        }

    }

    private fun inflateFragment(newInstance: Fragment) {

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, newInstance)
        transaction.commit()

    }
}