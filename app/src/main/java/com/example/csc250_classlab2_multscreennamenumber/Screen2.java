package com.example.csc250_classlab2_multscreennamenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Screen2 extends AppCompatActivity {
    private String name;
    private TextView nameTV;
    private TextView ageTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        this.nameTV = this.findViewById(R.id.nameTV);
        this.name = this.getIntent().getStringExtra("name");
        this.nameTV.setText(this.name);
        this.ageTV = this.findViewById(R.id.ageTV);
        this.ageTV.setText("" + MySingleton.age);


    }

    public void onNextScreenButtonClicked(View v)
    {
        //launch the next screen
        Intent i = new Intent(this, Screen3.class);
        int age = Integer.parseInt(this.ageTV.getText().toString());
        this.startActivity(i);
    }
}