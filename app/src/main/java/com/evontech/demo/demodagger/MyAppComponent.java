package com.evontech.demo.demodagger;

import dagger.Component;

@Component(modules = {MyAppModule.class})
public interface MyAppComponent {
    void inject(MainActivity activity);
}
