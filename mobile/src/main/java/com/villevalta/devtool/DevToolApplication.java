package com.villevalta.devtool;

import android.app.Application;

/**
 * Created by ville on 09.06.2016.
 */
public class DevToolApplication extends Application {

    private static DevToolApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static DevToolApplication getInstance(){
        return instance;
    }

}
