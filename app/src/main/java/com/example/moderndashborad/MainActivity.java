package com.example.moderndashborad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  private CardView cardTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardTest=(CardView) findViewById(R.id.cardTest);
        cardTest.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        startActivity(new Intent(MainActivity.this , Example.class));
        finish();
    }
}