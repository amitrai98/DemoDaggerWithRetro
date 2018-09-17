package com.evontech.demo.demodagger.mvvm.screens.demo_list.rxexample;


import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;

import com.evontech.demo.demodagger.BR;
import com.evontech.demo.demodagger.utility.Utility;

public class RxVm extends BaseObservable {

    private Utility utility;
    private String name;
    private String TAG = getClass().getSimpleName();

    @Bindable
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    RxVm(Utility utility){
        this.utility = utility;
    }

    public void updateView(){
        Log.e(TAG, "injecitng");
        setName(utility.getTime());
    }

}
