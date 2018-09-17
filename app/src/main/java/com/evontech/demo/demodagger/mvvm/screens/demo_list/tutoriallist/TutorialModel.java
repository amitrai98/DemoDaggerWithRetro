package com.evontech.demo.demodagger.mvvm.screens.demo_list.tutoriallist;

import android.content.Context;
import android.content.Intent;
import android.databinding.BaseObservable;


public class TutorialModel extends BaseObservable{
    String tutorialName;

    public TutorialModel(String tutorialName){
        this.tutorialName = tutorialName;
    }

    public String getTutorialName() {
        return tutorialName;
    }

    public void setTutorialName(String tutorialName) {
        this.tutorialName = tutorialName;
    }


}
