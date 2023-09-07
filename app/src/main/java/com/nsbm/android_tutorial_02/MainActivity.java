package com.nsbm.android_tutorial_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "ccsl";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, msg: "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, msg: "onCreate");
    }
}