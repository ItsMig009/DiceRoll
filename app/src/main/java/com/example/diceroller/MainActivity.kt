package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

// AppCompatActivity makes you app available the largest number of devices and users possible.
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // inflates and draws layout to the screen.
        /*2. Use findViewById to get a reference to the button and
        * assign it to an immutable variable called rollButton:*/
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = getString(R.string.replace)
        /*3. Set the OnClickListener for the button:*/
        rollButton.setOnClickListener{
            /*4. Make the Toast:*/
            //Toast.makeText(this, "Button Clicked!",Toast.LENGTH_SHORT).show()
            /*2. Remove the Toast and create a method called rollDice:*/
            rollDice()
        }
    }

    private fun rollDice() {
        // Create a random number form 1 to 6
        /*3. Write have the rollDice method to get a random number between 1 and 6:*/
        val randomInt = Random.nextInt(6) + 1
        /*4. Use findViewById to get a reference to the TextView and assign it to an immutable variable called resultText:*/
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }
}