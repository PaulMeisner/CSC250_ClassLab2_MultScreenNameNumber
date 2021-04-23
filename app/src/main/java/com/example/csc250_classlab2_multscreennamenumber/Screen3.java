package com.example.csc250_classlab2_multscreennamenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Screen3 extends AppCompatActivity {

    private TextView age1TV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        this.age1TV = this.findViewById(R.id.age1TV);
        this.age1TV.setText("" + MySingleton.age);
    }
}