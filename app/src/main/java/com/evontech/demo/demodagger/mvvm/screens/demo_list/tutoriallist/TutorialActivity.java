package com.evontech.demo.demodagger.mvvm.screens.demo_list.tutoriallist;

import android.arch.lifecycle.LiveData;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.LinearLayout;

import com.evontech.demo.demodagger.R;
import com.evontech.demo.demodagger.databinding.ActivityTutorialBinding;

import java.util.ArrayList;
import java.util.List;

public class TutorialActivity extends AppCompatActivity {

    List<TutorialModel> list = new ArrayList<>();
    ActivityTutorialBinding activityTutorialBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityTutorialBinding = DataBindingUtil.setContentView(this, R.layout.activity_tutorial);
        activityTutorialBinding.setTutorialVm(new TutorialListVm());
        activityTutorialBinding.tutorialRv.setAdapter(new TutorialAdapter(setList()));
        activityTutorialBinding.tutorialRv.setLayoutManager(new LinearLayoutManager(this));
        activityTutorialBinding.executePendingBindings();
    }


    public List<TutorialModel> setList() {
        list.add(new TutorialModel("Dagger"));
        list.add(new TutorialModel("RX"));
        list.add(new TutorialModel("Live Data"));

        return list;
    }
}
