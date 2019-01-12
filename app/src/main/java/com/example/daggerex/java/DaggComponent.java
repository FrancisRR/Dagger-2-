package com.example.daggerex.java;

import com.example.daggerex.kotlin.MainActivity;
import dagger.Component;

@Component
public interface DaggComponent {
    TextUtils getTextUtils();

    void inject(SecondActivity context);
}
