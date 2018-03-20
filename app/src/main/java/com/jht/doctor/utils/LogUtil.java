package com.jht.doctor.utils;

import android.util.Log;

import com.jht.doctor.BuildConfig;
import com.jht.doctor.application.CustomerApplication;

public class LogUtil {

    //根据是否debug模式显示log
    private static final String TAG = CustomerApplication.getInstance().getPackageName();

    public static void d(String msg) {
        if (BuildConfig.LOG_DEBUG) {
            Log.d(TAG, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (BuildConfig.LOG_DEBUG) {
            Log.d(tag, msg);
        }
    }

    public static void v(String tag, String msg) {
        if (BuildConfig.LOG_DEBUG) {
            Log.v(tag, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (BuildConfig.LOG_DEBUG) {
            Log.i(tag, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (BuildConfig.LOG_DEBUG) {
            Log.w(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (BuildConfig.LOG_DEBUG) {
            Log.e(tag, msg);
        }
    }

}