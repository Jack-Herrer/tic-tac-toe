package com.example.jackherrer.tic_tac_toe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class in_game extends AppCompatActivity implements View.OnClickListener {

    boolean p1_turn = true;
    boolean endgame = false;

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

    // Function to check if there i a winner
    public void checkWin(){
        if(p1_turn){
            if(        (p00.equals("x") && p01.equals("x") && p02.equals("x"))
                    || (p10.equals("x") && p11.equals("x") && p12.equals("x"))
                    || (p20.equals("x") && p21.equals("x") && p22.equals("x"))
                    || (p00.equals("x") && p10.equals("x") && p20.equals("x"))
                    || (p01.equals("x") && p11.equals("x") && p21.equals("x"))
                    || (p02.equals("x") && p12.equals("x") && p22.equals("x"))
                    || (p00.equals("x") && p11.equals("x") && p22.equals("x"))
                    || (p02.equals("x") && p11.equals("x") && p20.equals("x"))
                    ) {
                Toast.makeText(this, R.string.xWin, Toast.LENGTH_LONG).show();
                endgame = true;
            }

        }
        if(!p1_turn){
            if(   (p00.equals("o") && p01.equals("o") && p02.equals("o"))
                    || (p10.equals("o") && p11.equals("o") && p12.equals("o"))
                    || (p20.equals("o") && p21.equals("o") && p22.equals("o"))
                    || (p00.equals("o") && p10.equals("o") && p20.equals("o"))
                    || (p01.equals("o") && p11.equals("o") && p21.equals("o"))
                    || (p02.equals("o") && p12.equals("o") && p22.equals("o"))
                    || (p00.equals("o") && p11.equals("o") && p22.equals("o"))
                    || (p02.equals("o") && p11.equals("o") && p20.equals("o"))
                    ) {
                Toast.makeText(this, R.string.oWin, Toast.LENGTH_LONG).show();
                endgame = true;
            }
        }

    }



    @Override
    public void onClick(View v) {
        if(!endgame){
            switch (v.getId()) {
                case R.id.b00:
                    if (p00 == "?") {
                        if (p1_turn) {
                            ((Button) findViewById(R.id.b00)).setText("X");
                            p00 = "x";
                            checkWin();
                            p1_turn = !p1_turn;
                            break;


                        } else {
                            ((Button) findViewById(R.id.b00)).setText("O");
                            p00 = "o";
                            checkWin();
                            p1_turn = !p1_turn;
                            break;
                        }
                    }
                case R.id.b01:
                    if (p01 == "?") {
                        if (p1_turn) {
                            ((Button) findViewById(R.id.b01)).setText("X");
                            p01 = "x";
                            checkWin();
                            p1_turn = !p1_turn;
                            break;


                        } else {
                            ((Button) findViewById(R.id.b01)).setText("O");
                            p01 = "o";
                            checkWin();
                            p1_turn = !p1_turn;
                            break;
                        }
                    }
                case R.id.b02:
                    if (p02 == "?") {
                        if (p1_turn) {
                            ((Button) findViewById(R.id.b02)).setText("X");
                            p02 = "x";
                            checkWin();
                            p1_turn = !p1_turn;
                            break;


                        } else {
                            ((Button) findViewById(R.id.b02)).setText("O");
                            p02 = "o";
                            checkWin();
                            p1_turn = !p1_turn;
                            break;
                        }
                    }
                case R.id.b10:
                    if (p10 == "?") {
                        if (p1_turn) {
                            ((Button) findViewById(R.id.b10)).setText("X");
                            p10 = "x";
                            checkWin();
                            p1_turn = !p1_turn;
                            break;


                        } else {
                            ((Button) findViewById(R.id.b10)).setText("O");
                            p10 = "o";
                            checkWin();
                            p1_turn = !p1_turn;
                            break;
                        }
                    }
                case R.id.b11:
                    if (p11 == "?") {
                        if (p1_turn) {
                            ((Button) findViewById(R.id.b11)).setText("X");
                            p11 = "x";
                            checkWin();
                            p1_turn = !p1_turn;
                            break;


                        } else {
                            ((Button) findViewById(R.id.b11)).setText("O");
                            p11 = "o";
                            checkWin();
                            p1_turn = !p1_turn;
                            break;
                        }
                    }
                case R.id.b12:
                    if (p12 == "?") {
                        if (p1_turn) {
                            ((Button) findViewById(R.id.b12)).setText("X");
                            p12 = "x";
                            checkWin();
                            p1_turn = !p1_turn;
                            break;


                        } else {
                            ((Button) findViewById(R.id.b12)).setText("O");
                            p12 = "o";
                            checkWin();
                            p1_turn = !p1_turn;
                            break;
                        }
                    }
                case R.id.b20:
                    if (p20 == "?") {
                        if (p1_turn) {
                            ((Button) findViewById(R.id.b20)).setText("X");
                            p20 = "x";
                            checkWin();
                            p1_turn = !p1_turn;
                            break;


                        } else {
                            ((Button) findViewById(R.id.b20)).setText("O");
                            p20 = "o";
                            checkWin();
                            p1_turn = !p1_turn;
                            break;
                        }
                    }
                case R.id.b21:
                    if (p21 == "?") {
                        if (p1_turn) {
                            ((Button) findViewById(R.id.b21)).setText("X");
                            p21 = "x";
                            checkWin();
                            p1_turn = !p1_turn;
                            break;


                        } else {
                            ((Button) findViewById(R.id.b21)).setText("O");
                            p21 = "o";
                            checkWin();
                            p1_turn = !p1_turn;
                            break;
                        }
                    }
                case R.id.b22:
                    if (p22 == "?") {
                        if (p1_turn) {
                            ((Button) findViewById(R.id.b22)).setText("X");
                            p22 = "x";
                            checkWin();
                            p1_turn = !p1_turn;
                            break;


                        } else {
                            ((Button) findViewById(R.id.b22)).setText("O");
                            p22 = "o";
                            checkWin();
                            p1_turn = !p1_turn;
                            break;
                        }
                    }
            }
        }

    }
}
