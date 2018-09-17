package com.evontech.demo.demodagger.dagger.components;

import com.evontech.demo.demodagger.MainActivity;
import com.evontech.demo.demodagger.dagger.modules.MyAppModule;
import com.evontech.demo.demodagger.mvvm.screens.demo_list.rxexample.RxActivity;

import dagger.Component;

@Component(modules = {MyAppModule.class})
public interface MyAppComponent {
    void inject(MainActivity activity);
    void inject (RxActivity activity);
}
