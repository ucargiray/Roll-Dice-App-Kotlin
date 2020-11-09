package com.example.diceappdsc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get ImageView's reference from layout.
        val photo : ImageView = findViewById(R.id.diceImageView)
        photo.setImageResource(R.drawable.dice)

        // Get Button's reference from layout.
        val buttonRoll : Button = findViewById(R.id.rollButton)

        // Give Button a functionality whenever user clicks on it
        buttonRoll.setOnClickListener {
            rollDice()
        }
    }

    // Create a custom dice rolling function.
    fun rollDice(){
        // Create a random number between 1 and 6 including them.
        var randomNumber = (1..6).random()

        // Get TextView's reference from layout.
        val numberTextView : TextView  = findViewById(R.id.numberTextView)
        // Get ImageView's reference from layout.
        val photo : ImageView = findViewById(R.id.diceImageView)

        // Change the ImageView's image resource corresponding to randomNumber's value.
        /*
        if (randomNumber == 1){
            photo.setImageResource(R.drawable.dice1)
        }
        if (randomNumber == 2){
            photo.setImageResource(R.drawable.dice2)
        }
        if (randomNumber == 3){
            photo.setImageResource(R.drawable.dice3)
        }
        if (randomNumber == 4){
            photo.setImageResource(R.drawable.dice4)
        }
        if (randomNumber == 5){
            photo.setImageResource(R.drawable.dice5)
        }
        if (randomNumber == 6){
            photo.setImageResource(R.drawable.dice6)
        }*/

        // YOU CAN EITHER USE "IF" OR "WHEN" CONDITIONS.
        when (randomNumber) {
           1 -> photo.setImageResource(R.drawable.dice1)
            2 -> photo.setImageResource(R.drawable.dice2)
            3 -> photo.setImageResource(R.drawable.dice3)
            4 -> photo.setImageResource(R.drawable.dice4)
            5 -> photo.setImageResource(R.drawable.dice5)
            6 -> photo.setImageResource(R.drawable.dice6)
         }

        // Change TextView's text property with the randomNumber's value.
        numberTextView.text = "${randomNumber} rolled."
    }
}