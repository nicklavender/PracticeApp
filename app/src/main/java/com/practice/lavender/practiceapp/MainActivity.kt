package com.practice.lavender.practiceapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe() {
        // val myToast = Toast.makeText(this, message, duration);
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countClicks() {
        val currentCount = counter.text.toString()
        var count: Int = Integer.parseInt(currentCount)
        count++
        counter.text = count.toString()
    }

    fun randomNumber() {
        val randomIntent = Intent(this, SecondActivity::class.java)
        val count = Integer.parseInt(counter.text.toString())
        randomIntent.putExtra(TOTAL_COUNT, count)
        startActivity(randomIntent)
    }

    companion object {
        const val TOTAL_COUNT = "total_count"
    }
}
