package com.evontech.demo.demodagger.mvvm.screens.demo_list.tutoriallist;

import android.arch.lifecycle.ViewModel;
import android.databinding.BaseObservable;

public class TutorialListVm extends BaseObservable {

    private TutorialModel tutorialModel;

    public String getTutorialName() {
        return tutorialModel.getTutorialName();
    }

    public void setTutorialName(String tutorialName) {
        this.tutorialModel.setTutorialName(tutorialName);
    }




}
