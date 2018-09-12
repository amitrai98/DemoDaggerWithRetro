package com.evontech.demo.demodagger;


import dagger.Module;
import dagger.Provides;

@Module
public class MyAppModule {
    private final demodagger demodagger;

    public MyAppModule(demodagger demodagger){
        this.demodagger = demodagger;
    }

    @Provides
    demodagger provideApp(){
        return demodagger;
    }

    @Provides Utility provideUtility(){
        return new Utility();
    }

}
