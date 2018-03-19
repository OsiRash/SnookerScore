package com.example.oaamarasheed.snookerscore;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //hid the keyboard after click anywher in the layout
        enterYourNameOne = (EditText) findViewById(R.id.player_one);
        enterYourNameOne.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    hideKeyboard(v);
                }
            }
        });
        enterYourNameTow = (EditText) findViewById(R.id.player_tow);
        enterYourNameTow.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    hideKeyboard(v);
                }
            }
        });
    }

    public EditText enterYourNameOne;
    public EditText enterYourNameTow;
    int playerOnePoints;
    int playerTowPoints;

    //Player one Buttuns
    public void addOnePlayerOne(View view) {
        playerOnePoints ++;
        displyPlayerOnePoints(playerOnePoints);
    }

    public void addTowPlayerOne(View view) {
        playerOnePoints +=2;
        displyPlayerOnePoints(playerOnePoints);
    }

    public void addThreePlayerOne(View view) {
        playerOnePoints +=3;
        displyPlayerOnePoints(playerOnePoints);

    }

    public void addFourPlayerOne(View view) {
        playerOnePoints +=4;
        displyPlayerOnePoints(playerOnePoints);
    }

    public void addFivePlayerOne(View view) {
        playerOnePoints +=5;
        displyPlayerOnePoints(playerOnePoints);
    }

    public void addSixPlayerOne(View view) {
        playerOnePoints +=6;
        displyPlayerOnePoints(playerOnePoints);
    }

    public void addSevenPlayerOne(View view) {
        playerOnePoints +=7;
        displyPlayerOnePoints(playerOnePoints);
    }

    //Player tow Buttuns
    public void addOnePlayerTow(View view) {
        playerTowPoints ++;
        displyPlayerTowPoints(playerTowPoints);
    }

    public void addTowPlayerTow(View view) {
        playerTowPoints +=2;
        displyPlayerTowPoints(playerTowPoints);
    }

    public void addThreePlayerTow(View view) {
        playerTowPoints +=3;
        displyPlayerTowPoints(playerTowPoints);

    }

    public void addFourPlayerTow(View view) {
        playerTowPoints +=4;
        displyPlayerTowPoints(playerTowPoints);
    }

    public void addFivePlayerTow(View view) {
        playerTowPoints +=5;
        displyPlayerTowPoints(playerTowPoints);
    }

    public void addSixPlayerTow(View view) {
        playerTowPoints +=6;
        displyPlayerTowPoints(playerTowPoints);
    }

    public void addSevenPlayerTow(View view) {
        playerTowPoints +=7;
        displyPlayerTowPoints(playerTowPoints);
    }

    //this will rest the names and the score of the app
    public void rest(View View){
    playerOnePoints=0;
    playerTowPoints=0;
    displyPlayerOnePoints(playerOnePoints);
    displyPlayerTowPoints(playerTowPoints);
    displyPlayerOneName();
    displyPlayerTowName();
    }

    //a method to hide the softkeyboard
    public void hideKeyboard(View v) {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(enterYourNameOne.getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(enterYourNameTow.getWindowToken(), 0);
    }

    //displays player one points
    public void displyPlayerOnePoints(int points){
        TextView scoreView = (TextView) findViewById(R.id.player_one_points);
        scoreView.setText(String.valueOf(points));

    }

    //displays player 2 points
    public void displyPlayerTowPoints(int points){
        TextView scoreView = (TextView) findViewById(R.id.player_tow_points);
        scoreView.setText(String.valueOf(points));

    }

    //rest the name of player one Editbox
    public void displyPlayerOneName( ){
        EditText player1 = (EditText) findViewById(R.id.player_one);
        player1.setText("");
    }

    //rest the name of player 2 editbox
    public void displyPlayerTowName( ){
        EditText player2 = (EditText) findViewById(R.id.player_tow);
        player2.setText("");

    }
}
