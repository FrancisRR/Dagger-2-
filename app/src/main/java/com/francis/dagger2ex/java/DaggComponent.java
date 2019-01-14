package com.francis.dagger2ex.java;

import dagger.Component;

@Component
public interface DaggComponent {
    TextUtils getTextUtils();

    void inject(SecondActivity context);
}
