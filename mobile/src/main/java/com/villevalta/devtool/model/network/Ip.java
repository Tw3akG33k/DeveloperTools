package com.villevalta.devtool.model.network;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.format.Formatter;

import com.villevalta.devtool.DevToolApplication;
import com.villevalta.devtool.model.AValue;

/**
 * Created by ville on 09.06.2016.
 */
public class Ip extends AValue{

    public Ip() {
        super("ip");
    }

    @Override
    public String getValue() {
        // todo try catch etc..
        WifiManager wifiMgr = (WifiManager) DevToolApplication.getInstance().getSystemService(Context.WIFI_SERVICE);
        WifiInfo wifiInfo = wifiMgr.getConnectionInfo();
        return Formatter.formatIpAddress(wifiInfo.getIpAddress());
    }

}
