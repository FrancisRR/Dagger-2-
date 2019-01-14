package com.francis.dagger2ex.java;

import android.util.Log;

import javax.inject.Inject;

public class UiUtils {


    @Inject
//Dagger constructor injection
    UiUtils() {

    }

    public String getString() {
        return "Hai Francis";
    }

    @Inject//Dagger method injection
    public void printString() {
        Log.d("HHHHH", "printString: Hello francis");
    }
}
