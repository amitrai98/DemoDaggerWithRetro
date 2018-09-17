package com.evontech.demo.demodagger.mvvm.screens.demo_list.rxexample;

import android.app.Application;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.evontech.demo.demodagger.AppInitials;
import com.evontech.demo.demodagger.R;
import com.evontech.demo.demodagger.databinding.ActivityRxBinding;
import com.evontech.demo.demodagger.utility.Utility;

import javax.inject.Inject;

public class RxActivity extends AppCompatActivity {

    @Inject
    Utility utility;

    ActivityRxBinding activityRxBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppInitials.getContext().getInjector().inject(this);

        activityRxBinding = DataBindingUtil.setContentView(this, R.layout.activity_rx);
        activityRxBinding.setRxvm(new RxVm(utility));
        activityRxBinding.executePendingBindings();
    }
}
