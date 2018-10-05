package com.dija.excercisedice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.fragment.NavHostFragment
import android.content.Intent
import android.content.DialogInterface
import android.net.Uri
import android.support.v7.app.AlertDialog




class MainActivity : AppCompatActivity() {

    lateinit var navHost: NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        navHost = supportFragmentManager
                .findFragmentById(R.id.navHost) as NavHostFragment

    }



    override fun onSupportNavigateUp(): Boolean {
        return navHost.navController.navigateUp() || super.onSupportNavigateUp()
    }


}
