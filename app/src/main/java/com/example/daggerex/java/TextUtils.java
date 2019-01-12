package com.example.daggerex.java;

import android.util.Log;

import javax.inject.Inject;


public class TextUtils {

    private final String TAG = TextUtils.class.getSimpleName();

    @Inject
    TextUtils() {

    }


    public String getString() {
        return "Francis";
    }

    @Inject
    public void printString() {
        Log.d(TAG, "printString: Hello francis");
    }
}
