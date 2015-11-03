package com.example.jackherrer.tic_tac_toe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class in_game extends AppCompatActivity implements View.OnClickListener {

    boolean p1_turn = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_game);


        final Button b00 = (Button) findViewById(R.id.b00);
        b00.setOnClickListener(this);
        final Button b01 = (Button) findViewById(R.id.b01);
        b01.setOnClickListener(this);
        final Button b02 = (Button) findViewById(R.id.b02);
        b02.setOnClickListener(this);
        final Button b10 = (Button) findViewById(R.id.b10);
        b10.setOnClickListener(this);
        final Button b11 = (Button) findViewById(R.id.b11);
        b11.setOnClickListener(this);
        final Button b12 = (Button) findViewById(R.id.b12);
        b12.setOnClickListener(this);
        final Button b20 = (Button) findViewById(R.id.b20);
        b20.setOnClickListener(this);
        final Button b21 = (Button) findViewById(R.id.b21);
        b21.setOnClickListener(this);
        final Button b22 = (Button) findViewById(R.id.b22);
        b22.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b00:
                if (p1_turn) {
                    ((Button) findViewById(R.id.b00)).setText("X");
                    p1_turn = !p1_turn;
                } else {
                    ((Button) findViewById(R.id.b00)).setText("O");
                    p1_turn = !p1_turn;
                }

        }
    }
}
