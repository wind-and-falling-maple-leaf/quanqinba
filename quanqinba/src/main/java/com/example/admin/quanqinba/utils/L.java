package com.example.admin.quanqinba.utils;

import android.util.Log;

import com.example.admin.quanqinba.BuildConfig;

import java.util.Objects;

/**
 * Created by Admin on 2019/5/28.
 * author:柯炜
 */


public class L {
    private static final String TAG = "hyman";
private  static boolean sDebug = BuildConfig.DEBUG;
    public static void d(String msg ,Objects...args){
        if (!sDebug){
            return;
        }
        Log.d(TAG,String.format(msg,args));
    }
}
