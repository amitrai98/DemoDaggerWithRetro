package com.evontech.demo.demodagger.utility;

import dagger.Component;
import dagger.Module;

@Module
public class Utility {
    public String getTime(){
        return "i am being updated through dagger";
    }
}
