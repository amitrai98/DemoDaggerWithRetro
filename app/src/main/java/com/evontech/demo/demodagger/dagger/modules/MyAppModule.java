package com.evontech.demo.demodagger.dagger.modules;


import com.evontech.demo.demodagger.utility.Utility;
import com.evontech.demo.demodagger.AppInitials;

import dagger.Module;
import dagger.Provides;

@Module
public class MyAppModule {
    private final AppInitials demodagger;

    public MyAppModule(AppInitials demodagger){
        this.demodagger = demodagger;
    }

    @Provides
    AppInitials provideApp(){
        return demodagger;
    }

    @Provides
    Utility provideUtility(){
        return new Utility();
    }

}
