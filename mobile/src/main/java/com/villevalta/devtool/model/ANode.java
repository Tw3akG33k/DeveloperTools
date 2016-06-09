package com.villevalta.devtool.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by ville on 09.06.2016.
 */
public abstract class ANode {

    String name;
    protected ArrayList<AValue> values = new ArrayList<>();
    protected ArrayList<ANode> members = new ArrayList<>();

    public ANode(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        String result = "\""+name+"\"" + ":{";

        for (int i = 0; i < values.size(); i++) {
            result += values.get(i).toString();
            if(i < values.size() - 1) result += ",";
        }

        for (int i = 0; i < members.size(); i++) {
            result += members.get(i).toString();
            if(i < members.size() - 1) result += ",";
        }


        result += "}";
        return result;
    }

    public JSONObject toJson() throws JSONException {
        return new JSONObject(this.toString());
    }

}
