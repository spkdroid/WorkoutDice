package com.dija.excercisedice.ui.main.fragment;

import android.arch.lifecycle.ViewModelProviders;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.dija.excercisedice.R;
import com.dija.excercisedice.ui.main.viewmodel.DiceViewModel;

public class DiceFragment extends Fragment implements View.OnClickListener {

    private DiceViewModel mViewModel;
    TextView mActivityType;
    TextView mDiceNumber;
    Button RollHandler;
    ImageView DiceBackGround;
    ImageView DiceTitleImage;
    private static String diceType;
    private static MediaPlayer mDiceSound;


    public static DiceFragment newInstance() {
        return new DiceFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dice_fragment, container, false);
        mDiceSound= MediaPlayer.create(getActivity(), R.raw.dice);
        mDiceNumber = v.findViewById(R.id.dicenumber);
        mActivityType = v.findViewById(R.id.actiontype);
        RollHandler = v.findViewById(R.id.rolldice);
        DiceBackGround =  v.findViewById(R.id.dicebackground);
        DiceTitleImage = v.findViewById(R.id.dicetitleimage);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(DiceViewModel.class);
        // TODO: Use the ViewModel
        Bundle bundle = getArguments();
        diceType = bundle.getString("data");
        setTitleImage(diceType);
        RollHandler.setOnClickListener(this);
        RollHandler.performClick();
    }

    private void setTitleImage(String diceType) {

        switch (diceType){
            case "abs":
                DiceTitleImage.setImageResource(R.drawable.abs_icon);
                break;
            case "legs":
                DiceTitleImage.setImageResource(R.drawable.legs_icon);
                break;
            case "cardio":
                DiceTitleImage.setImageResource(R.drawable.heart_icon);
                break;
            case "arms":
                DiceTitleImage.setImageResource(R.drawable.arm_icon);
                break;
            case "chest":
                DiceTitleImage.setImageResource(R.drawable.chest_icon);
                break;
            case "back":
                DiceTitleImage.setImageResource(R.drawable.back_icon);
                break;
        }


    }

    @Override
    public void onClick(View view) {
        mDiceNumber.setText(mViewModel.generateRepetitionNumber()+"");
        mActivityType.setText(mViewModel.getExcersiseType(diceType));
        mDiceSound.start();
    }
}
