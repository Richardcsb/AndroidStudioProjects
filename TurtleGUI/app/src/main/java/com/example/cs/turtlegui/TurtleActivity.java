package com.example.cs.turtlegui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class TurtleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turtle);

        Log.i("Activity Lifecycle","onCreate was called");
    }

    public void chooseTurtle(View view) {

        ImageButton turtleImage = (ImageButton)findViewById(R.id.turtleImage);

        if (view.getId() == R.id.miketurtle){
            turtleImage.setImageResource(R.drawable.mike);
        }else if(view.getId() == R.id.donturtle){
            turtleImage.setImageResource(R.drawable.don);
        }else if(view.getId() == R.id.leoturtle){
            turtleImage.setImageResource(R.drawable.leo);
        }else if(view.getId() == R.id.raphturtle){
            turtleImage.setImageResource(R.drawable.raph);
        }
    }

    public void login(View view) {
        Intent intent = new Intent(TurtleActivity.this,sencond_Activity.class);
        startActivity(intent);
    }
}
