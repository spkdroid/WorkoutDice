package com.dija.excercisedice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.*
import com.dija.excercisedice.ui.main.MainFragment


class MainActivity : AppCompatActivity() {

    lateinit var navHost: NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
      //  if (savedInstanceState == null) {
        //    supportFragmentManager.beginTransaction()
          //      .replace(R.id.container, MainFragment.newInstance())
           //     .commitNow()
       // }

        navHost = supportFragmentManager
                .findFragmentById(R.id.navHost) as NavHostFragment



    }

    override fun onSupportNavigateUp(): Boolean {
        return navHost.navController.navigateUp() || super.onSupportNavigateUp()
    }


}
