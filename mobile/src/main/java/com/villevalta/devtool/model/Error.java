package com.villevalta.devtool.model;

/**
 * Created by ville on 09.06.2016.
 */
public class Error {

    public static final String NOT_AVAILABLE = "*N/A*";
    public static final String UNKNOWN = "*Unknown*";
    public static final String PERMISSION = "*No permission*";

    public static String notSupportedByAPI(int minApiLevel){
        return "*N/A in API <"+ minApiLevel + "*";
    }

}
