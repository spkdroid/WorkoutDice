package com.dija.excercisedice.ui.main.fragment

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.dija.excercisedice.R
import com.dija.excercisedice.ui.main.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

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

       abs.setOnClickListener{
           val bundle = Bundle().also { it.putString("data", "abs") }
           Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_diceFragment,bundle)
        }
        legs.setOnClickListener{
            val bundle = Bundle().also { it.putString("data", "legs") }
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_diceFragment,bundle)
        }
        cardio.setOnClickListener{
            val bundle = Bundle().also { it.putString("data", "cardio") }
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_diceFragment,bundle)
        }
        arms.setOnClickListener{
            val bundle = Bundle().also { it.putString("data", "arms") }
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_diceFragment,bundle)
        }
        chest.setOnClickListener{
            val bundle = Bundle().also { it.putString("data", "chest") }
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_diceFragment,bundle)
        }
        back.setOnClickListener{
            val bundle = Bundle().also { it.putString("data", "back") }
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_diceFragment,bundle)
        }
    }

}
