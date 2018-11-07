package com.practice.lavender.practiceapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.practice.lavender.practiceapp.MainActivity.Companion.TOTAL_COUNT
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class SecondActivity : AppCompatActivity() {

    var randomUpperBound : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        randomUpperBound = intent.getIntExtra(TOTAL_COUNT, 10)
        val randomNumberInstructions = random_number_instruction;
        randomNumberInstructions.text = getString(R.string.random_number_instruction, randomUpperBound)
        randomized_number.setOnClickListener { _ -> showRandomNumber() }
    }

    private fun showRandomNumber() {
        val random = Random()
        randomized_number.text = random.nextInt(randomUpperBound + 1).toString()
    }
}
