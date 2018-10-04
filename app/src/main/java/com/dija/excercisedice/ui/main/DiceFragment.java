package com.dija.excercisedice.ui.main;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


import com.dija.excercisedice.R;

public class DiceFragment extends Fragment {

    private DiceViewModel mViewModel;
    TextView mDiceTitle;
    TextView mActivityType;
    TextView mDiceNumber;
    Button RollHandler;

    public static DiceFragment newInstance() {
        return new DiceFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dice_fragment, container, false);
        mDiceTitle = v.findViewById(R.id.dicetype);
        mDiceNumber = v.findViewById(R.id.dicenumber);
        mActivityType = v.findViewById(R.id.actiontype);
        RollHandler = v.findViewById(R.id.rolldice);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(DiceViewModel.class);
        // TODO: Use the ViewModel
        Bundle bundle = getArguments();
        final String diceType = bundle.getString("data");
        mDiceTitle.setText(diceType);

        RollHandler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  mDiceNumber.setText(mViewModel.generateRepetitionNumber()+"");
                  mActivityType.setText(mViewModel.getExcersiseType(diceType));
            }
        });

    }
}
