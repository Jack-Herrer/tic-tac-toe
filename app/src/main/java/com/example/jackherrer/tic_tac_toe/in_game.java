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

        // Initialise buttons
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

    public void checkWin(){

    }

    // Initialise positions
    String p00 = "?";
    String p01 = "?";
    String p02 = "?";
    String p10 = "?";
    String p11 = "?";
    String p12 = "?";
    String p20 = "?";
    String p21 = "?";
    String p22 = "?";



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b00:
                if (p00 == "?") {
                    if (p1_turn) {
                        ((Button) findViewById(R.id.b00)).setText("X");
                        p1_turn = !p1_turn;
                        p00 = "x";
                        checkWin();
                        break;


                    } else {
                        ((Button) findViewById(R.id.b00)).setText("O");
                        p1_turn = !p1_turn;
                        p00 = "o";
                        checkWin();
                        break;
                    }
                }
            case R.id.b01:
                if (p01 == "?") {
                    if (p1_turn) {
                        ((Button) findViewById(R.id.b01)).setText("X");
                        p1_turn = !p1_turn;
                        p01 = "x";
                        checkWin();
                        break;


                    } else {
                        ((Button) findViewById(R.id.b01)).setText("O");
                        p1_turn = !p1_turn;
                        p01 = "o";
                        checkWin();
                        break;
                    }
                }
            case R.id.b02:
                if (p02 == "?") {
                    if (p1_turn) {
                        ((Button) findViewById(R.id.b02)).setText("X");
                        p1_turn = !p1_turn;
                        p02 = "x";
                        checkWin();
                        break;


                    } else {
                        ((Button) findViewById(R.id.b02)).setText("O");
                        p1_turn = !p1_turn;
                        p02 = "o";
                        checkWin();
                        break;
                    }
                }
            case R.id.b10:
                if (p10 == "?") {
                    if (p1_turn) {
                        ((Button) findViewById(R.id.b10)).setText("X");
                        p1_turn = !p1_turn;
                        p10 = "x";
                        checkWin();
                        break;


                    } else {
                        ((Button) findViewById(R.id.b10)).setText("O");
                        p1_turn = !p1_turn;
                        p10 = "o";
                        checkWin();
                        break;
                    }
                }
            case R.id.b11:
                if (p11 == "?") {
                    if (p1_turn) {
                        ((Button) findViewById(R.id.b11)).setText("X");
                        p1_turn = !p1_turn;
                        p11 = "x";
                        checkWin();
                        break;


                    } else {
                        ((Button) findViewById(R.id.b11)).setText("O");
                        p1_turn = !p1_turn;
                        p11 = "o";
                        checkWin();
                        break;
                    }
                }
            case R.id.b12:
                if (p12 == "?") {
                    if (p1_turn) {
                        ((Button) findViewById(R.id.b12)).setText("X");
                        p1_turn = !p1_turn;
                        p12 = "x";
                        checkWin();
                        break;


                    } else {
                        ((Button) findViewById(R.id.b12)).setText("O");
                        p1_turn = !p1_turn;
                        p12 = "o";
                        checkWin();
                        break;
                    }
                }
            case R.id.b20:
                if (p20 == "?") {
                    if (p1_turn) {
                        ((Button) findViewById(R.id.b20)).setText("X");
                        p1_turn = !p1_turn;
                        p20 = "x";
                        checkWin();
                        break;


                    } else {
                        ((Button) findViewById(R.id.b20)).setText("O");
                        p1_turn = !p1_turn;
                        p20 = "o";
                        checkWin();
                        break;
                    }
                }
            case R.id.b21:
                if (p21 == "?") {
                    if (p1_turn) {
                        ((Button) findViewById(R.id.b21)).setText("X");
                        p1_turn = !p1_turn;
                        p21 = "x";
                        checkWin();
                        break;


                    } else {
                        ((Button) findViewById(R.id.b21)).setText("O");
                        p1_turn = !p1_turn;
                        p21 = "o";
                        checkWin();
                        break;
                    }
                }
            case R.id.b22:
                if (p22 == "?") {
                    if (p1_turn) {
                        ((Button) findViewById(R.id.b22)).setText("X");
                        p1_turn = !p1_turn;
                        p22 = "x";
                        checkWin();
                        break;


                    } else {
                        ((Button) findViewById(R.id.b22)).setText("O");
                        p1_turn = !p1_turn;
                        p22 = "o";
                        checkWin();
                        break;
                    }
                }
        }

    }
}
