package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Assigning xml id to variables.
        Button rollButton = findViewById(R.id.rollbutton);

        final ImageView leftDice = findViewById(R.id.imageleft_dice);

        final ImageView rightDice = findViewById(R.id.imageright_dice);
        // after assigning final the array cannot be changed.
        final int[] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,};


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenrator = new Random();
                int number;
                number = randomNumberGenrator.nextInt(6);
                leftDice.setImageResource(diceArray[number]);
                number = randomNumberGenrator.nextInt(6);
                rightDice.setImageResource(diceArray[number]);
            }
        });

    }
}