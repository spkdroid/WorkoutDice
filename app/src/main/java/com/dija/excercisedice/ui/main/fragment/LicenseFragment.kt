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

class LicenseFragment : Fragment() {

    companion object {
        fun newInstance() = LicenseFragment()
    }

    private lateinit var viewModel: LicenseViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val aboutPage = AboutPage(activity)
                .isRTL(false)
                .setImage(R.drawable.abs_icon)
            //    .addItem(Element().setTitle("Version 6.2"))
            //    .addItem(adsElement)
                .addGroup("Connect with us")
                .addEmail("elmehdi.sakout@gmail.com")
                .addWebsite("http://medyo.github.io/")
                .addFacebook("the.medy")
                .addTwitter("medyo80")
                .addYoutube("UCdPQtdWIsg7_pi4mrRu46vA")
                .addPlayStore("com.ideashower.readitlater.pro")
                .addInstagram("medyo80")
                .addGitHub("medyo")
              //  .addItem(getCopyRightsElement())
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
