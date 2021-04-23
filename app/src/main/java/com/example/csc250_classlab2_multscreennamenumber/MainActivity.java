package com.example.csc250_classlab2_multscreennamenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    private EditText nameET;
    private EditText ageET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.nameET = this.findViewById(R.id.nameET);
        this.ageET = this.findViewById(R.id.ageET);

    }

    public void onGoToNextScreenButtonClicked(View v)
    {
        //launch the next screen

        Intent i = new Intent(this, Screen2.class);
        int age = Integer.parseInt(this.ageET.getText().toString());
        i.putExtra("name", this.nameET.getText().toString());
        MySingleton.age = age;
        this.startActivity(i);
    }
}