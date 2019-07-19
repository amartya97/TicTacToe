package com.roy.apps.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    ImageButton but1,but2;
    int flag = 0;
    int count;
    int turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        but1 = (ImageButton) findViewById(R.id.re1);//Reset button
       // but2 = (ImageButton) findViewById(R.id.sc1);//Score button

        turn = 1;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b1.getText().toString().equals("")){
                    if(turn == 1){
                        turn = 2;
                        b1.setText("X");
                    }
                    else if(turn == 2){
                        turn =1;
                        b1.setText("O");
                    }
                }
                if(b1.isPressed()){
                    count++;
                }
                endGame();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b2.getText().toString().equals("")){
                    if(turn == 1){
                        turn = 2;
                        b2.setText("X");
                    }
                    else if(turn == 2){
                        turn =1;
                        b2.setText("O");
                    }
                }
                if(b2.isPressed()){
                    count++;
                }
                endGame();


            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b3.getText().toString().equals("")){
                    if(turn == 1){
                        turn = 2;
                        b3.setText("X");
                    }
                    else if(turn == 2){
                        turn =1;
                        b3.setText("O");
                    }
                }
                if(b3.isPressed()){
                    count++;
                }
                endGame();


            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b4.getText().toString().equals("")){
                    if(turn == 1){
                        turn = 2;
                        b4.setText("X");
                    }
                    else if(turn == 2){
                        turn =1;
                        b4.setText("O");
                    }
                }
                if(b4.isPressed()){
                    count++;
                }
                endGame();


            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b5.getText().toString().equals("")){
                    if(turn == 1){
                        turn = 2;
                        b5.setText("X");
                    }
                    else if(turn == 2){
                        turn =1;
                        b5.setText("O");
                    }
                }
                if(b5.isPressed()){
                    count++;
                }
                endGame();

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b6.getText().toString().equals("")){
                    if(turn == 1){
                        turn = 2;
                        b6.setText("X");
                    }
                    else if(turn == 2){
                        turn =1;
                        b6.setText("O");
                    }
                }
                if(b6.isPressed()){
                    count++;
                }
                endGame();


            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b7.getText().toString().equals("")){
                    if(turn == 1){
                        turn = 2;
                        b7.setText("X");
                    }
                    else if(turn == 2){
                        turn =1;
                        b7.setText("O");
                    }
                }
                if(b7.isPressed()){
                    count++;
                }
                endGame();


            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b8.getText().toString().equals("")){
                    if(turn == 1){
                        turn = 2;
                        b8.setText("X");
                    }
                    else if(turn == 2){
                        turn =1;
                        b8.setText("O");
                    }
                }
                if(b8.isPressed()){
                    count++;
                }
                endGame();


            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b9.getText().toString().equals("")){
                    if(turn == 1){
                        turn = 2;
                        b9.setText("X");
                    }
                    else if(turn == 2){
                        turn =1;
                        b9.setText("O");
                    }
                }
                if(b9.isPressed()){
                    count++;
                }
                endGame();


            }
        });


    }
    public void endGame() {
        final String a, b, c, d, e, f, g, h, i;
        boolean end = false;

        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();
        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();
        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();


        if (a.equals("X") && b.equals("X") && c.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner is X!", Toast.LENGTH_LONG).show();
            end = true;
            flag++;
            b1.setText("W");
            b2.setText("I");
            b3.setText("N");
            b1.setBackgroundColor(0x00000000);
            b2.setBackgroundColor(0x00000000);
            b3.setBackgroundColor(0x00000000);
        } else if (a.equals("X") && e.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner is X!", Toast.LENGTH_LONG).show();
            end = true;
            flag++;
            b1.setText("W");
            b5.setText("I");
            b9.setText("N");
            b1.setBackgroundColor(0x00000000);
            b5.setBackgroundColor(0x00000000);
            b9.setBackgroundColor(0x00000000);
        } else if (a.equals("X") && d.equals("X") && g.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner is X!", Toast.LENGTH_LONG).show();
            end = true;
            flag++;
            b1.setText("W");
            b4.setText("I");
            b7.setText("N");
            b1.setBackgroundColor(0x00000000);
            b4.setBackgroundColor(0x00000000);
            b7.setBackgroundColor(0x00000000);
        } else if (b.equals("X") && e.equals("X") && h.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner is X!", Toast.LENGTH_LONG).show();
            end = true;
            flag++;
            b2.setText("W");
            b5.setText("I");
            b8.setText("N");
            b2.setBackgroundColor(0x00000000);
            b5.setBackgroundColor(0x00000000);
            b8.setBackgroundColor(0x00000000);
        } else if (c.equals("X") && f.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner is X!", Toast.LENGTH_LONG).show();
            end = true;
            flag++;
            b3.setText("W");
            b6.setText("I");
            b9.setText("N");
            b3.setBackgroundColor(0x00000000);
            b6.setBackgroundColor(0x00000000);
            b9.setBackgroundColor(0x00000000);
        } else if (c.equals("X") && e.equals("X") && g.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner is X!", Toast.LENGTH_LONG).show();
            end = true;
            flag++;
            b3.setText("W");
            b5.setText("I");
            b7.setText("N");
            b3.setBackgroundColor(0x00000000);
            b5.setBackgroundColor(0x00000000);
            b7.setBackgroundColor(0x00000000);
        } else if (d.equals("X") && e.equals("X") && f.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner is X!", Toast.LENGTH_LONG).show();
            end = true;
            flag++;
            b4.setText("W");
            b5.setText("I");
            b6.setText("N");
            b4.setBackgroundColor(0x00000000);
            b5.setBackgroundColor(0x00000000);
            b6.setBackgroundColor(0x00000000);
        } else if (g.equals("X") && h.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner is X!", Toast.LENGTH_LONG).show();
            end = true;
            flag++;
            b7.setText("W");
            b8.setText("I");
            b9.setText("N");
            b7.setBackgroundColor(0x00000000);
            b8.setBackgroundColor(0x00000000);
            b9.setBackgroundColor(0x00000000);
        } else if (a.equals("O") && b.equals("O") && c.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner is O!", Toast.LENGTH_LONG).show();
            end = true;
            flag++;
            b1.setText("W");
            b2.setText("I");
            b3.setText("N");
            b1.setBackgroundColor(0x00000000);
            b2.setBackgroundColor(0x00000000);
            b3.setBackgroundColor(0x00000000);
        } else if (a.equals("O") && e.equals("O") && i.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner is O!", Toast.LENGTH_LONG).show();
            end = true;
            flag++;
            b1.setText("W");
            b5.setText("I");
            b9.setText("N");
            b1.setBackgroundColor(0x00000000);
            b5.setBackgroundColor(0x00000000);
            b9.setBackgroundColor(0x00000000);
        } else if (a.equals("O") && d.equals("O") && g.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner is O!", Toast.LENGTH_LONG).show();
            end = true;
            flag++;
            b1.setText("W");
            b4.setText("I");
            b7.setText("N");
            b1.setBackgroundColor(0x00000000);
            b4.setBackgroundColor(0x00000000);
            b7.setBackgroundColor(0x00000000);
        } else if (b.equals("O") && e.equals("O") && h.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner is O!", Toast.LENGTH_LONG).show();
            end = true;
            flag++;
            b2.setText("W");
            b5.setText("I");
            b8.setText("N");
            b2.setBackgroundColor(0x00000000);
            b5.setBackgroundColor(0x00000000);
            b8.setBackgroundColor(0x00000000);
        } else if (c.equals("O") && f.equals("O") && i.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner is O!", Toast.LENGTH_LONG).show();
            end = true;
            flag++;
            b3.setText("W");
            b6.setText("I");
            b9.setText("N");
            b3.setBackgroundColor(0x00000000);
            b6.setBackgroundColor(0x00000000);
            b9.setBackgroundColor(0x00000000);
        } else if (c.equals("O") && e.equals("O") && g.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner is O!", Toast.LENGTH_LONG).show();
            end = true;
            flag++;
            b3.setText("W");
            b5.setText("I");
            b7.setText("N");
            b3.setBackgroundColor(0x00000000);
            b5.setBackgroundColor(0x00000000);
            b7.setBackgroundColor(0x00000000);
        } else if (d.equals("O") && e.equals("O") && f.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner is O!", Toast.LENGTH_LONG).show();
            end = true;
            flag++;
            b4.setText("W");
            b5.setText("I");
            b6.setText("N");
            b4.setBackgroundColor(0x00000000);
            b5.setBackgroundColor(0x00000000);
            b6.setBackgroundColor(0x00000000);
        } else if (g.equals("O") && h.equals("O") && i.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner is O!", Toast.LENGTH_LONG).show();
            end = true;
            flag++;
            b7.setText("W");
            b8.setText("I");
            b9.setText("N");
            b7.setBackgroundColor(0x00000000);
            b8.setBackgroundColor(0x00000000);
            b9.setBackgroundColor(0x00000000);
        }
        else if(flag==0 && count==9){
            Toast.makeText(MainActivity.this,"Match is Draw",Toast.LENGTH_LONG).show();
            end = true;
        }
        if (end) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
    but1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(getIntent());
        }
    });
   /* but2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),Popup.class);
            startActivity(intent);
        }
    });*/
    }
}
