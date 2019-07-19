package com.roy.apps.tictactoe;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class First extends AppCompatActivity {
    ImageButton b1, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        b1 = (ImageButton) findViewById(R.id.bt1);
        b2 = (ImageButton) findViewById(R.id.bt2);
        b3 = (ImageButton) findViewById(R.id.bt3);
    }
    public void but1(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        b1.setBackgroundColor(0xffffffff);
        startActivity(intent);

    }
    public void but2(View view) {
        Intent intent = new Intent(getApplicationContext(), About.class);
        b2.setBackgroundColor(0xffffffff);
        startActivity(intent);
    }
    public void but3(View view) {
        b3.setBackgroundColor(0xffffffff);
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
