package com.evontech.demo.demodagger;

import android.Manifest;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.app.runtimepermission.PermissionHandler;
import com.app.runtimepermission.PermissionListener;
import com.evontech.demo.demodagger.utility.Utility;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private TextView textView = null;
    private Button button = null;

    @Inject
    Utility utility;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppInitials.getContext().getInjector().inject(this);

        Log.e(TAG, "" + Build.VERSION.SDK_INT);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doSomething();
            }
        });
    }

    private void doSomething(){
        Log.e(TAG, "time from utility "+utility.getTime());
        textView.setText(utility.getTime());

        PermissionHandler.getAllPermissions(this, new PermissionListener() {
            @Override
            public void onGranted(String message) {
                Log.e(TAG, message);
            }

            @Override
            public void onError(String errorMessage) {
                Log.e(TAG, errorMessage);
            }

            @Override
            public void onRejected(String message) {
                Log.e(TAG, message);
            }
        });


    }
}
