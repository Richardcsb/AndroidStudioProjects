package com.example.forcelogout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void logoutOnClick(View view) {
        Intent intent = new Intent("com.example.broadcastbestpractice.FORCE_OFFLINE");
        sendBroadcast(intent);
    }
}
