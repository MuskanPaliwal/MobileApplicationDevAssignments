package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1 = (Button) findViewById(R.id.button);

        //Implement listener for your button so that when you click the
        //button, android will listen to it.

        button1.setOnClickListener(v -> moveToActivitypage());
    }

    private void moveToActivitypage(){
        Intent intent=new Intent (this,MainActivity2.class);
        startActivity(intent);
    }

}


