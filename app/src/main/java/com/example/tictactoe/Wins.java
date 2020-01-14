package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Wins extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wins);
        Intent a = getIntent();
        String b = a.getStringExtra("msg");
        TextView c =(TextView)findViewById(R.id.wns);
        c.setText(b);
    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        finish();
        Intent a = new Intent(Wins.this,Human.class);
        startActivity(a);
    }
}
