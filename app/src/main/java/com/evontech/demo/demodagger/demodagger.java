package com.evontech.demo.demodagger;

import android.app.Application;

public class demodagger extends Application {
    static MyAppComponent component;
    static demodagger context;
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
    public static demodagger getContext(){
        return  context;
    }
}
