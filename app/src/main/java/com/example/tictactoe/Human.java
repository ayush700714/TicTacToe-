package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Human extends AppCompatActivity {
private int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human);
    }
   public void a1(View view)
   {
       Button bt1 = (Button)findViewById(R.id.a11);
       Button bt2 = (Button)findViewById(R.id.a21);
       Button bt3 = (Button)findViewById(R.id.a31);
       Button bt4 = (Button)findViewById(R.id.a41);
       Button bt5 = (Button)findViewById(R.id.a51);
       Button bt6 = (Button)findViewById(R.id.a61);
       Button bt7 = (Button)findViewById(R.id.a71);
       Button bt8 = (Button)findViewById(R.id.a81);
       Button bt9 = (Button)findViewById(R.id.a91);
       TextView t = (TextView)findViewById(R.id.text);
       if(a==0)
       {
           if(count%2==0)
           {
               bt1.setText("X");
               count++;
               a=1;
               String ch0 = bt1.getText().toString();
               String ch1 = bt2.getText().toString();
               String ch2 = bt3.getText().toString();
               String ch3 = bt4.getText().toString();
               String ch4 = bt7.getText().toString();
               String ch5 = bt5.getText().toString();
               String ch6 = bt9.getText().toString();
               if(ch0.equals(ch1) && ch0.equals(ch2))
               {finish();
                   Intent wins = new Intent(Human.this,Wins.class);
                   wins.putExtra("msg","Player 1 wins");
                   startActivity(wins);
               }
               else if(ch0.equals(ch3) && ch0.equals(ch4))
               {finish();
                   Intent wins = new Intent(Human.this,Wins.class);
                   wins.putExtra("msg","Player 1 wins");
                   startActivity(wins);
               }
               else if(ch0.equals(ch5) && ch0.equals(ch6))
               {finish();
                   Intent wins = new Intent(Human.this,Wins.class);
                   wins.putExtra("msg","Player 1 wins");
                   startActivity(wins);
               }
               else
               {
                   t.setText("Player 2");
               }
           }
           else
           {
               bt1.setText("0");
               count++;
               a=1;
               String ch0 = bt1.getText().toString();
               String ch1 = bt2.getText().toString();
               String ch2 = bt3.getText().toString();
               String ch3 = bt4.getText().toString();
               String ch4 = bt7.getText().toString();
               String ch5 = bt5.getText().toString();
               String ch6 = bt9.getText().toString();
               if(ch0.equals(ch1) && ch0.equals(ch2))
               {finish();
                   Intent wins = new Intent(Human.this,Wins.class);
                   wins.putExtra("msg","Player 2 wins");
                   startActivity(wins);
               }
               else if(ch0.equals(ch3) && ch0.equals(ch4))
               {finish();
                   Intent wins = new Intent(Human.this,Wins.class);
                   wins.putExtra("msg","Player 2 wins");
                   startActivity(wins);
               }
               else if(ch0.equals(ch5) && ch0.equals(ch6))
               {finish();
                   Intent wins = new Intent(Human.this,Wins.class);
                   wins.putExtra("msg","Player 2 wins");
                   startActivity(wins);
               }
               else
               {
                   t.setText("Player 1");
               }
           }

       }
   }
    public void a2(View view)
    {
        Button bt1 = (Button)findViewById(R.id.a11);
        Button bt2 = (Button)findViewById(R.id.a21);
        Button bt3 = (Button)findViewById(R.id.a31);
        Button bt4 = (Button)findViewById(R.id.a41);
        Button bt5 = (Button)findViewById(R.id.a51);
        Button bt6 = (Button)findViewById(R.id.a61);
        Button bt7 = (Button)findViewById(R.id.a71);
        Button bt8 = (Button)findViewById(R.id.a81);
        Button bt9 = (Button)findViewById(R.id.a91);
        TextView t = (TextView)findViewById(R.id.text);
        if(b==0)
        {
            if(count%2==0)
            {
                bt2.setText("X");
                count++;
                b=1;
                String ch0 = bt2.getText().toString();
                String ch1 = bt1.getText().toString();
                String ch2 = bt3.getText().toString();
                String ch3 = bt5.getText().toString();
                String ch4 = bt8.getText().toString();
                if(ch0.equals(ch1) && ch0.equals(ch2))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 1 wins");
                    startActivity(wins);
                }
                else if(ch0.equals(ch3) && ch0.equals(ch4))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 1 wins");
                    startActivity(wins);
                }
                else
                {
                    t.setText("Player 2");
                }
            }
            else
            {
                bt2.setText("0");
                count++;
                b=1;
                String ch0 = bt2.getText().toString();
                String ch1 = bt1.getText().toString();
                String ch2 = bt3.getText().toString();
                String ch3 = bt5.getText().toString();
                String ch4 = bt8.getText().toString();
                if(ch0.equals(ch1) && ch0.equals(ch2))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 2 wins");
                    startActivity(wins);
                }
                else if(ch0.equals(ch3) && ch0.equals(ch4))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 2 wins");
                    startActivity(wins);
                }
                else
                {
                    t.setText("Player 1");
                }
            }

        }
    }
    public void a3(View view)
    {
        Button bt1 = (Button)findViewById(R.id.a11);
        Button bt2 = (Button)findViewById(R.id.a21);
        Button bt3 = (Button)findViewById(R.id.a31);
        Button bt4 = (Button)findViewById(R.id.a41);
        Button bt5 = (Button)findViewById(R.id.a51);
        Button bt6 = (Button)findViewById(R.id.a61);
        Button bt7 = (Button)findViewById(R.id.a71);
        Button bt8 = (Button)findViewById(R.id.a81);
        Button bt9 = (Button)findViewById(R.id.a91);
        TextView t = (TextView)findViewById(R.id.text);
        if(c==0)
        {
            if(count%2==0)
            {
                bt3.setText("X");
                count++;
                c=1;
                String ch0 = bt3.getText().toString();
                String ch1 = bt1.getText().toString();
                String ch2 = bt2.getText().toString();
                String ch3 = bt5.getText().toString();
                String ch4 = bt7.getText().toString();
                String ch5 = bt6.getText().toString();
                String ch6 = bt9.getText().toString();
                if(ch0.equals(ch1) && ch0.equals(ch2))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 1 wins");
                    startActivity(wins);
                }
                else if(ch0.equals(ch3) && ch0.equals(ch4))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 1 wins");
                    startActivity(wins);
                }
                else if(ch0.equals(ch5) && ch0.equals(ch6))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 1 wins");
                    startActivity(wins);
                }
                else
                {
                    t.setText("Player 2");
                }
            }
            else
            {
                bt3.setText("0");
                count++;
                c=1;
                String ch0 = bt3.getText().toString();
                String ch1 = bt1.getText().toString();
                String ch2 = bt2.getText().toString();
                String ch3 = bt5.getText().toString();
                String ch4 = bt7.getText().toString();
                String ch5 = bt6.getText().toString();
                String ch6 = bt9.getText().toString();
                if(ch0.equals(ch1) && ch0.equals(ch2))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 2 wins");
                    startActivity(wins);
                }
                else if(ch0.equals(ch3) && ch0.equals(ch4))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 2 wins");
                    startActivity(wins);
                }
                else if(ch0.equals(ch5) && ch0.equals(ch6))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 2 wins");
                    startActivity(wins);
                }
                else
                {
                    t.setText("Player 1");
                }
            }

        }
    }
    public void a4(View view)
    {
        Button bt1 = (Button)findViewById(R.id.a11);
        Button bt2 = (Button)findViewById(R.id.a21);
        Button bt3 = (Button)findViewById(R.id.a31);
        Button bt4 = (Button)findViewById(R.id.a41);
        Button bt5 = (Button)findViewById(R.id.a51);
        Button bt6 = (Button)findViewById(R.id.a61);
        Button bt7 = (Button)findViewById(R.id.a71);
        Button bt8 = (Button)findViewById(R.id.a81);
        Button bt9 = (Button)findViewById(R.id.a91);
        TextView t = (TextView)findViewById(R.id.text);
        if(d==0)
        {
            if(count%2==0)
            {
                bt4.setText("X");
                count++;
                d=1;
                String ch0 = bt4.getText().toString();
                String ch1 = bt1.getText().toString();
                String ch2 = bt7.getText().toString();
                String ch3 = bt5.getText().toString();
                String ch4 = bt6.getText().toString();
                if(ch0.equals(ch1) && ch0.equals(ch2))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 1 wins");
                    startActivity(wins);
                }
                else if(ch0.equals(ch3) && ch0.equals(ch4))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 1 wins");
                    startActivity(wins);
                }
                else
                {
                    t.setText("Player 2");
                }
            }
            else
            {
                bt4.setText("0");
                count++;
                d=1;
                String ch0 = bt4.getText().toString();
                String ch1 = bt1.getText().toString();
                String ch2 = bt7.getText().toString();
                String ch3 = bt5.getText().toString();
                String ch4 = bt6.getText().toString();
                if(ch0.equals(ch1) && ch0.equals(ch2))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 2 wins");
                    startActivity(wins);
                }
                else if(ch0.equals(ch3) && ch0.equals(ch4))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 2 wins");
                    startActivity(wins);
                }
                else
                {
                    t.setText("Player 1");
                }
            }

        }
    }
    public void a5(View view)
    {
        Button bt1 = (Button)findViewById(R.id.a11);
        Button bt2 = (Button)findViewById(R.id.a21);
        Button bt3 = (Button)findViewById(R.id.a31);
        Button bt4 = (Button)findViewById(R.id.a41);
        Button bt5 = (Button)findViewById(R.id.a51);
        Button bt6 = (Button)findViewById(R.id.a61);
        Button bt7 = (Button)findViewById(R.id.a71);
        Button bt8 = (Button)findViewById(R.id.a81);
        Button bt9 = (Button)findViewById(R.id.a91);
        TextView t = (TextView)findViewById(R.id.text);
        if(e==0)
        {
            if(count%2==0)
            {
                bt5.setText("X");
                count++;
                e=1;
                String ch0 = bt5.getText().toString();
                String ch1 = bt2.getText().toString();
                String ch2 = bt8.getText().toString();
                String ch3 = bt4.getText().toString();
                String ch4 = bt6.getText().toString();
                if(ch0.equals(ch1) && ch0.equals(ch2))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 1 wins");
                    startActivity(wins);
                }
                else if(ch0.equals(ch3) && ch0.equals(ch4))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 1 wins");
                    startActivity(wins);
                }
                else
                {
                    t.setText("Player 2");
                }
            }
            else
            {
                bt5.setText("0");
                count++;
                e=1;
                String ch0 = bt5.getText().toString();
                String ch1 = bt2.getText().toString();
                String ch2 = bt8.getText().toString();
                String ch3 = bt4.getText().toString();
                String ch4 = bt6.getText().toString();
                if(ch0.equals(ch1) && ch0.equals(ch2))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 2 wins");
                    startActivity(wins);
                }
                else if(ch0.equals(ch3) && ch0.equals(ch4))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 2 wins");
                    startActivity(wins);
                }
                else
                {
                    t.setText("Player 1");
                }
            }

        }
    }
    public void a6(View view)
    {
        Button bt1 = (Button)findViewById(R.id.a11);
        Button bt2 = (Button)findViewById(R.id.a21);
        Button bt3 = (Button)findViewById(R.id.a31);
        Button bt4 = (Button)findViewById(R.id.a41);
        Button bt5 = (Button)findViewById(R.id.a51);
        Button bt6 = (Button)findViewById(R.id.a61);
        Button bt7 = (Button)findViewById(R.id.a71);
        Button bt8 = (Button)findViewById(R.id.a81);
        Button bt9 = (Button)findViewById(R.id.a91);
        TextView t = (TextView)findViewById(R.id.text);
        if(f==0)
        {
            if(count%2==0)
            {
                bt6.setText("X");
                count++;
                f=1;
                String ch0 = bt6.getText().toString();
                String ch1 = bt3.getText().toString();
                String ch2 = bt9.getText().toString();
                String ch3 = bt4.getText().toString();
                String ch4 = bt5.getText().toString();
                if(ch0.equals(ch1) && ch0.equals(ch2))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 1 wins");
                    startActivity(wins);
                }
                else if(ch0.equals(ch3) && ch0.equals(ch4))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 1 wins");
                    startActivity(wins);
                }
                else
                {
                    t.setText("Player 2");
                }
            }
            else
            {
                bt6.setText("0");
                count++;
                f=1;
                String ch0 = bt6.getText().toString();
                String ch1 = bt3.getText().toString();
                String ch2 = bt9.getText().toString();
                String ch3 = bt4.getText().toString();
                String ch4 = bt5.getText().toString();
                if(ch0.equals(ch1) && ch0.equals(ch2))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 2 wins");
                    startActivity(wins);
                }
                else if(ch0.equals(ch3) && ch0.equals(ch4))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 2 wins");
                    startActivity(wins);
                }
                else
                {
                    t.setText("Player 1");
                }
            }

        }
    }
    public void a7(View view)
    {
        Button bt1 = (Button)findViewById(R.id.a11);
        Button bt2 = (Button)findViewById(R.id.a21);
        Button bt3 = (Button)findViewById(R.id.a31);
        Button bt4 = (Button)findViewById(R.id.a41);
        Button bt5 = (Button)findViewById(R.id.a51);
        Button bt6 = (Button)findViewById(R.id.a61);
        Button bt7 = (Button)findViewById(R.id.a71);
        Button bt8 = (Button)findViewById(R.id.a81);
        Button bt9 = (Button)findViewById(R.id.a91);
        TextView t = (TextView)findViewById(R.id.text);
        if(g==0)
        {
            if(count%2==0)
            {
                bt7.setText("X");
                count++;
                g=1;
                String ch0 = bt7.getText().toString();
                String ch1 = bt1.getText().toString();
                String ch2 = bt2.getText().toString();
                String ch3 = bt3.getText().toString();
                String ch4 = bt5.getText().toString();
                String ch5 = bt8.getText().toString();
                String ch6 = bt9.getText().toString();
                if(ch0.equals(ch1) && ch0.equals(ch2))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 1 wins");
                    startActivity(wins);
                }
                else if(ch0.equals(ch3) && ch0.equals(ch4))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 1 wins");
                    startActivity(wins);
                }
                else if(ch0.equals(ch5) && ch0.equals(ch6))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 1 wins");
                    startActivity(wins);
                }
                else
                {
                    t.setText("Player 2");
                }
            }
            else
            {
                bt7.setText("0");
                count++;
                g=1;
                String ch0 = bt7.getText().toString();
                String ch1 = bt1.getText().toString();
                String ch2 = bt2.getText().toString();
                String ch3 = bt3.getText().toString();
                String ch4 = bt5.getText().toString();
                String ch5 = bt8.getText().toString();
                String ch6 = bt9.getText().toString();
                if(ch0.equals(ch1) && ch0.equals(ch2))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 2 wins");
                    startActivity(wins);
                }
                else if(ch0.equals(ch3) && ch0.equals(ch4))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 2 wins");
                    startActivity(wins);
                }
                else if(ch0.equals(ch5) && ch0.equals(ch6))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 1 wins");
                    startActivity(wins);
                }
                else
                {
                    t.setText("Player 1");
                }
            }

        }
    }
    public void a8(View view)
    {
        Button bt1 = (Button)findViewById(R.id.a11);
        Button bt2 = (Button)findViewById(R.id.a21);
        Button bt3 = (Button)findViewById(R.id.a31);
        Button bt4 = (Button)findViewById(R.id.a41);
        Button bt5 = (Button)findViewById(R.id.a51);
        Button bt6 = (Button)findViewById(R.id.a61);
        Button bt7 = (Button)findViewById(R.id.a71);
        Button bt8 = (Button)findViewById(R.id.a81);
        Button bt9 = (Button)findViewById(R.id.a91);
        TextView t = (TextView)findViewById(R.id.text);
        if(h==0)
        {
            if(count%2==0)
            {
                bt8.setText("X");
                count++;
                h=1;
                String ch0 = bt8.getText().toString();
                String ch1 = bt2.getText().toString();
                String ch2 = bt5.getText().toString();
                String ch3 = bt7.getText().toString();
                String ch4 = bt9.getText().toString();
                if(ch0.equals(ch1) && ch0.equals(ch2))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 1 wins");
                    startActivity(wins);
                }
                else if(ch0.equals(ch3) && ch0.equals(ch4))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 1 wins");
                    startActivity(wins);
                }
                else
                {
                    t.setText("Player 2");
                }
            }
            else
            {
                bt8.setText("0");
                count++;
                h=1;
                String ch0 = bt8.getText().toString();
                String ch1 = bt2.getText().toString();
                String ch2 = bt5.getText().toString();
                String ch3 = bt7.getText().toString();
                String ch4 = bt9.getText().toString();
                if(ch0.equals(ch1) && ch0.equals(ch2))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 2 wins");
                    startActivity(wins);
                }
                else if(ch0.equals(ch3) && ch0.equals(ch4))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 2 wins");
                    startActivity(wins);
                }
                else
                {
                    t.setText("Player 1");
                }
            }

        }
    }
    public void a9(View view)
    {
        Button bt1 = (Button)findViewById(R.id.a11);
        Button bt2 = (Button)findViewById(R.id.a21);
        Button bt3 = (Button)findViewById(R.id.a31);
        Button bt4 = (Button)findViewById(R.id.a41);
        Button bt5 = (Button)findViewById(R.id.a51);
        Button bt6 = (Button)findViewById(R.id.a61);
        Button bt7 = (Button)findViewById(R.id.a71);
        Button bt8 = (Button)findViewById(R.id.a81);
        Button bt9 = (Button)findViewById(R.id.a91);
        TextView t = (TextView)findViewById(R.id.text);
        if(i==0)
        {
            if(count%2==0)
            {
                bt9.setText("X");
                count++;
                i=1;
                String ch0 = bt9.getText().toString();
                String ch1 = bt1.getText().toString();
                String ch2 = bt5.getText().toString();
                String ch3 = bt3.getText().toString();
                String ch4 = bt6.getText().toString();
                String ch5 = bt7.getText().toString();
                String ch6 = bt8.getText().toString();
                if(ch0.equals(ch1) && ch0.equals(ch2))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 1 wins");
                    startActivity(wins);
                }
                else if(ch0.equals(ch3) && ch0.equals(ch4))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 1 wins");
                    startActivity(wins);
                }
                else if(ch0.equals(ch5) && ch0.equals(ch6))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 1 wins");
                    startActivity(wins);
                }
                else
                {
                    t.setText("Player 2");
                }
            }
            else
            {
                bt9.setText("0");
                count++;
                i=1;
                String ch0 = bt9.getText().toString();
                String ch1 = bt1.getText().toString();
                String ch2 = bt5.getText().toString();
                String ch3 = bt3.getText().toString();
                String ch4 = bt6.getText().toString();
                String ch5 = bt7.getText().toString();
                String ch6 = bt8.getText().toString();
                if(ch0.equals(ch1) && ch0.equals(ch2))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 2 wins");
                    startActivity(wins);
                }
                else if(ch0.equals(ch3) && ch0.equals(ch4))
                {finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 2 wins");
                    startActivity(wins);
                }
                else if(ch0.equals(ch5) && ch0.equals(ch6))
                {
                    finish();
                    Intent wins = new Intent(Human.this,Wins.class);
                    wins.putExtra("msg","Player 1 wins");
                    startActivity(wins);
                }
                else
                {
                    t.setText("Player 1");
                }
            }

        }
    }
    public void restart(View view)
    {
        finish();
        Intent a  = new Intent(Human.this,Human.class);
        startActivity(a);
    }
}
