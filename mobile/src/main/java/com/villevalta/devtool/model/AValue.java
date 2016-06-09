package com.villevalta.devtool.model;

/**
 * Created by ville on 09.06.2016.
 */
public abstract class AValue {

    String name;

    public AValue(String name){
        this.name = name;
    }

    public abstract String getValue();

}
