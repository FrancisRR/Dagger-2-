package com.example.daggerex.java;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.example.daggerex.R;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {


    private final String TAG = SecondActivity.class.getSimpleName();
    private TextUtils textUtils;

    @Inject
    UiUtils uiUtils;//Dagger field injection


    @BindView(R.id.btn)
    Button btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        DaggComponent component = DaggerDaggComponent.create();
        textUtils = component.getTextUtils();
        component.inject(this);


    }


    @OnClick(R.id.btn)
    public void onViewClicked() {
        Log.d(TAG, "onCreate: " + textUtils.getString());
        Log.d(TAG, "onCreate: " + uiUtils.getString());
    }
}
