package com.sqb.diceroller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

import static com.sqb.diceroller.R.id.textView;

public class MainActivity extends AppCompatActivity {

    Button simpleToast;
    TextView resTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleToast = (Button) findViewById(R.id.button);
        simpleToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                rollDice();
                Toast toast = Toast.makeText(getApplicationContext(), "Dice Rolled!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }

    private void rollDice() {
        Dice dice = new Dice();
        Integer dicero = new Integer(dice.roll());
        resTextView= findViewById(R.id.textView);
        resTextView.setText(dicero.toString());
    }
}

    class Dice{
    Random random = new Random();
        public int roll(){
            return random.nextInt(6);
        }

    }