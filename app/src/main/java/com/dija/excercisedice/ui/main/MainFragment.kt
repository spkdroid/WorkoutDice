package com.dija.excercisedice.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.main_fragment.*
import com.dija.excercisedice.R

class MainFragment : Fragment(), View.OnClickListener {


    override fun onClick(p: View?) {
     //Toast.makeText(context,viewModel.getCount().toString()+p0.toString(),Toast.LENGTH_LONG).show()
    if(p == abs) {
        Toast.makeText(context,viewModel.getCount().toString()+"ABS",Toast.LENGTH_LONG).show()
    } else if( p == legs){
        Toast.makeText(context,viewModel.getCount().toString()+"LEGS",Toast.LENGTH_LONG).show()
    } else if( p == cardio){
        Toast.makeText(context,viewModel.getCount().toString()+"CARDIO",Toast.LENGTH_LONG).show()
    } else if( p == arms){
        Toast.makeText(context,viewModel.getCount().toString()+"ARMS",Toast.LENGTH_LONG).show()
    } else if( p == chest){
        Toast.makeText(context,viewModel.getCount().toString()+"CHEST",Toast.LENGTH_LONG).show()
    } else if( p == back){
        Toast.makeText(context,viewModel.getCount().toString()+"BACK",Toast.LENGTH_LONG).show()
    }

    }

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val view =  inflater.inflate(R.layout.main_fragment, container, false)
        return view;
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel

        abs.setOnClickListener(this)
        legs.setOnClickListener(this)
        cardio.setOnClickListener(this)
        arms.setOnClickListener(this)
        chest.setOnClickListener(this)
        back.setOnClickListener(this)
    }

}
