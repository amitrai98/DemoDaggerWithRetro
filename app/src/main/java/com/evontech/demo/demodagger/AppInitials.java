package com.evontech.demo.demodagger;

import android.app.Application;

import com.evontech.demo.demodagger.dagger.components.DaggerMyAppComponent;
import com.evontech.demo.demodagger.dagger.components.MyAppComponent;
import com.evontech.demo.demodagger.dagger.modules.MyAppModule;

public class AppInitials extends Application {
    static MyAppComponent component;
    static AppInitials context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        component = DaggerMyAppComponent.builder().myAppModule(new MyAppModule(this)).build();
    }

    /**
     * Gets injector.
     *
     * @return the injector
     */
    public MyAppComponent getInjector() {
        return component;
    }


    /**
     * Get context app initials.
     *
     * @return the app initials
     */
    public static AppInitials getContext(){
        return  context;
    }
}
