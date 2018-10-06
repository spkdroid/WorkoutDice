package com.dija.excercisedice.ui.main.viewmodel;

import android.arch.lifecycle.ViewModel;

import java.util.Random;

public class DiceViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    public int generateRepetitionNumber() {
        int repetitionNumbers[]= {4,12,4,6,8,10,12,14};
        return repetitionNumbers[getRandomNumberFrom(0,6)];
    }


    public String getExcersiseType(String Type) {

        if(Type.equalsIgnoreCase("LEGS")) {
            String[] legTypes = {"BICEP CURL LOW", "TRICEP EXTEND", "BICEP CURL HIGH", "LATERAL TRICEP EXTEND", "TRICEP KICK BACK", "BICEP CURL ARM"};
            return legTypes[getRandomNumberFrom(0, 5)];
        } else if(Type.equalsIgnoreCase("CARDIO")){
            String[] cardioTypes = {"BURPEE", "SCISSOR SQUAT", "SQUAT ROW TWIST", "THAI KNEE", "HIGH KNEES", "LUNGE PULL OVER"};
            return cardioTypes[getRandomNumberFrom(0, 5)];
        } else if(Type.equalsIgnoreCase("BACK")) {
            String[] backTypes = {"POWER PULL","ROW", "BACK BRIDGE", "HIGH ROW", "PULL UP", "GOOD MORNING"};
            return backTypes[getRandomNumberFrom(0, 5)];
        } else if(Type.equalsIgnoreCase("ABS")){
            String[] absTypes = {"BODYSAW ELBOWS","AB ROLLOUT(KNEES)", "ATOMIC CRUNCH", "OBLIQUE TWIST", "ATOMIC OBLIQUE CRUNCH", "PIKE(HANDS)"};
            return absTypes[getRandomNumberFrom(0, 5)];
        } else if(Type.equalsIgnoreCase("CHEST")){
            String[] chestTypes = {"CLOCK CHEST PRESS","CHEST PRESS", "CLOCK PUSHUP", "SPIDERMAN PUSHUP", "ATOMIC OBLIQUE CRUNCH", "PIKE(HANDS)"};
            return chestTypes[getRandomNumberFrom(0, 5)];
        } else {
            String[] chestTypes = {"BICEP CURL LOW","BICEP CURL HIGH", "TRICEP EXTENDED", "BICEP CURL 1 ARM", "LATERAL TRICEP EXTENDED", "TRICEP KICK BACK"};
            return chestTypes[getRandomNumberFrom(0, 5)];
        }
    }

    public static int getRandomNumberFrom(int min, int max) {
        Random randInstance = new Random();
        int randomNumber = randInstance.nextInt((max + 1) - min) + min;
        return randomNumber;
    }





}
