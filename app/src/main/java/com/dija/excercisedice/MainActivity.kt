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

    override fun onBackPressed() {

        val count = fragmentManager.backStackEntryCount

        if(count ==0) {


            AlertDialog.Builder(this)
                    .setIcon(R.drawable.chest_icon)
                    .setTitle("Exit Application")
                    .setMessage("Are you sure you want to exit this application?")
                    .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which -> System.exit(0) })
                    .setNeutralButton("Rate Us") { dialog, which ->
                        // TODO Auto-generated method stub
                        try {
                            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.dija.excercisedice")))
                        } catch (anfe: android.content.ActivityNotFoundException) {
                            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=com.dija.excercisedice")))
                        }
                    }
                    .setNegativeButton("No", null)
                    .show()


        } else{
            fragmentManager.popBackStack();
        }
        }

    override fun onSupportNavigateUp(): Boolean {
        return navHost.navController.navigateUp() || super.onSupportNavigateUp()
    }


}
