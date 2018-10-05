package com.dija.excercisedice.ui.main.viewmodel

import android.arch.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    private var count = 1

    fun getCount(): Int {
        return (count++)
    }

}
