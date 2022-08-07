package com.example.bodymassindexcalculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bodymassindexcalculator.databinding.ActivityMainBinding
import kotlin.math.roundToInt
import kotlin.math.roundToLong

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // set BG color
        window.decorView.setBackgroundColor(Color.LTGRAY)

        // do app from id elements
        // do view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // making result invisible
        binding.resultTextView.visibility = View.INVISIBLE

        binding.calculateButton.setOnClickListener() {
            // entering weight and height, calculate BMI
            var weight = binding.weightEditText.text.toString().toDouble()
            var height = binding.heightEditText.text.toString().toDouble()
            var bmi = (weight / (height * height))

            // making result visible
            binding.resultTextView.visibility = View.VISIBLE

            // view result BMI
            binding.resultTextView.text = "${String.format("%.2f", bmi)} your BMI"

        }

    }
}