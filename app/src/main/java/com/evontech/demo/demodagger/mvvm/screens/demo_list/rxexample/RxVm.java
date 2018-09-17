package com.evontech.demo.demodagger.mvvm.screens.demo_list.rxexample;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.Observable;
import android.util.Log;

import com.evontech.demo.demodagger.utility.Utility;

public class RxVm extends BaseObservable {



    Utility utility;
    Observable text_field_state;
    boolean binded = false;
    public LiveData<String> mCurrentName;

    public LiveData<String> getCurrentName() {
        if (mCurrentName == null) {
            mCurrentName = new MutableLiveData<String>();
        }
        return mCurrentName;
    }




    private String name;
    private String TAG = getClass().getSimpleName();


    @Bindable
    public String getName() {
        return this.name;
    }

    public CharSequence getStyledName( String name) {
        // construct styled name here
        return name;
    }
    public RxVm(Utility utility){
        this.utility = utility;
    }

    public void updateView(){
        Log.e(TAG, "injecitng");

    }

}
