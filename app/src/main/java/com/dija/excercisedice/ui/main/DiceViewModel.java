package com.dija.excercisedice.ui.main;

import android.arch.lifecycle.ViewModel;

import java.util.Random;

public class DiceViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    int generateRepetitionNumber() {
        int repetitionNumbers[]= {4,12,4,6,8,10,12,14};
        return repetitionNumbers[getRandomNumberFrom(0,6)];
    }


    public String getExcersiseType(String Type) {
        String[] legTypes = {"BICEP CURL LOW","TRICEP EXTEND","BICEP CURL HIGH","LATERAL TRICEP EXTEND","TRICEP KICK BACK","BICEP CURL ARM"};
        return legTypes[getRandomNumberFrom(0,5)];
    }



    public static int getRandomNumberFrom(int min, int max) {
        Random randInstance = new Random();
        int randomNumber = randInstance.nextInt((max + 1) - min) + min;
        return randomNumber;
    }





}
