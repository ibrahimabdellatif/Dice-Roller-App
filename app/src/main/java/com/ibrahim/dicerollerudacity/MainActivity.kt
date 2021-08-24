package com.ibrahim.dicerollerudacity

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var diceRollImageView: ImageView
//    private var diceRollImageView2: ImageView? = null // lateinit keyword make compiler didn't check nullability

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.Roll_button)
        rollButton.setOnClickListener {
            DiceRoll()
        }
        diceRollImageView = findViewById(R.id.iv_dice)
    }

    private fun DiceRoll() {


        var diceList = arrayListOf<Int>()
        diceList.add(R.drawable.dice_1)
        diceList.add(R.drawable.dice_2)
        diceList.add(R.drawable.dice_3)
        diceList.add(R.drawable.dice_4)
        diceList.add(R.drawable.dice_5)
        diceList.add(R.drawable.dice_6)

        diceRollImageView.setImageResource(diceList.random())

    }
}