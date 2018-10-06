package com.dija.excercisedice.ui.main.fragment

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.dija.excercisedice.R
import com.dija.excercisedice.ui.main.viewmodel.LicenseViewModel
import mehdi.sakout.aboutpage.AboutPage
import mehdi.sakout.aboutpage.Element
import android.widget.Toast
import com.dija.excercisedice.MainActivity
import android.view.Gravity
import java.util.*


class LicenseFragment : Fragment() {

    companion object {
        fun newInstance() = LicenseFragment()
    }

    private lateinit var viewModel: LicenseViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {




        val aboutPage = AboutPage(activity)
                .isRTL(false)
                .setDescription(getString(R.string.message))
                .setImage(R.drawable.abs_icon)
                .addItem(Element().setTitle("Version 1.0"))
                .addGroup("Connect with us")
                .addEmail("vrk1990@outlook.com")
                .addPlayStore("com.dija.excercisedice")
                .create()

        return aboutPage;
        //return inflater.inflate(R.layout.model_license_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LicenseViewModel::class.java)
        // TODO: Use the ViewModel
    }



}
