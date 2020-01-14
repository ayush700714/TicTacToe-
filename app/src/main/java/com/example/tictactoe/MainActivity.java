package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void human(View view)
    {
        Intent a = new Intent(this,Human.class);
        startActivity(a);
    }
    public void computer(View view)
    {
        Intent b = new Intent(this,Computer.class);
        startActivity(b);
    }
}
