package com.example.my_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    public void fruitsOnClick(View view){
        Intent intent = new Intent(secondActivity.this,fruitsActivity.class);
        startActivity(intent);
    }

    public void tobeginOnClick(View view){
        Intent intent = new Intent(secondActivity.this,MainActivity.class);
        startActivity(intent);
    }
    public void recyclerfruitOnClick(View view){
        Intent intent = new Intent(secondActivity.this,FruitAdapterRecycler.class);
        startActivity(intent);
    }

}
