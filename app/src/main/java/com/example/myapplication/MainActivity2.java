package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final TextView textView=(TextView)findViewById(R.id.textView);
        final Button button1 =  (Button)findViewById(R.id.button2);

        //Implement listener for your button so that when you click the
        //button, android will listen to it.

        button1.setOnClickListener(v -> {
            // Perform action on click
            String[] names = getResources().getStringArray(R.array.name);
            Random rand = new Random();
            int  n = rand.nextInt(names.length -1);
            textView.setText(names[n]);

        });
    }
}