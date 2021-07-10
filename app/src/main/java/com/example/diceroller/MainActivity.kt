package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
// androidx - Jetpack compatibility libraries.
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random
// Added Summary
// AppCompatActivity makes you app available the largest number of devices and users possible.
class MainActivity : AppCompatActivity() {
    // Tells compiler it will be initialized before being accessed.
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // inflates and draws layout to the screen.
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = getString(R.string.replace)
        // findViewById executes once, instead of for each rollDice call
        // uses field instead of local variable withing rollDice method
        diceImage = findViewById(R.id.dice_image) // searches view hierarchy
        rollButton.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
        val drawableResource = when (Random.nextInt(6) + 1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // update based on drawable resource result
        diceImage.setImageResource(drawableResource)
    }
}