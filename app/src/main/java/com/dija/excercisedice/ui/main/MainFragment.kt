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
import com.dija.excercisedice.R

class MainFragment : Fragment(), View.OnClickListener {


    override fun onClick(p0: View?) {
     Toast.makeText(context,viewModel.getCount().toString(),Toast.LENGTH_LONG).show()
    }

    companion object {
        fun newInstance() = MainFragment()
    }

 //   private var textView:TextView? = null;
//    private var button: Button? = null;

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val view =  inflater.inflate(R.layout.main_fragment, container, false)
      //  textView = view.findViewById(R.id.message)
      //  button = view.findViewById(R.id.button)
        return view;
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
  //      button?.setOnClickListener(this);



    }

}
