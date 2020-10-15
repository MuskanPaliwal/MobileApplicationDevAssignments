package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        Bundle b1=getIntent().getExtras();
        String str=b1.getString("key");
        textView.setText(str);

        //Implement listener for your button so that when you click the
        //button, android will listen to it.

        button1.setOnClickListener(v -> {
            // Perform action on click
            Intent i=new Intent(this,MainActivity.class);
            startActivity(i);

        });
    }
}