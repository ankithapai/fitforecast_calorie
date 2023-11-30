package com.example.fitforecast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class CalorieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calorie)
        val myCalorieView = findViewById<TextView>(R.id.calorieIntake)
        val myCarbsView = findViewById<TextView>(R.id.carbs_split)
        val myProteinView = findViewById<TextView>(R.id.protein_split)
        val myFatView = findViewById<TextView>(R.id.fat_split)
        val exerciseView = findViewById<TextView>(R.id.exerciseSuggestion)
        findViewById<Button>(R.id.bulk).setOnClickListener {
            val randomCalories = Random.nextInt(1200, 2200)
            val calcCarb = (randomCalories * 0.45).toInt()
            val calcProtein = (randomCalories * 0.35).toInt()
            val calcFat = (randomCalories * 0.20).toInt()
            myCalorieView.text = "Calories consumed: $randomCalories"
            myCarbsView.text = "Carbs split: $calcCarb"
            myProteinView.text = "Protein split: $calcProtein"
            myFatView.text = "Fat split: $calcFat"
            exerciseView.text = "Weight 3hours, " +
                    "running 0.5 hours, " +
                    "yoga 0.3 hours"
        }
        findViewById<Button>(R.id.lean).setOnClickListener {
            val randomCalories = Random.nextInt(958, 1500)
            val calcCarb = (randomCalories * 0.35).toInt()
            val calcProtein = (randomCalories * 0.35).toInt()
            val calcFat = (randomCalories * 0.30).toInt()
            myCalorieView.text = "Calories consumed: $randomCalories"
            myCarbsView.text = "Carbs split: $calcCarb"
            myProteinView.text = "Protein split: $calcProtein"
            myFatView.text = "Fat split: $calcFat"
            exerciseView.text = "Weight 0.2 hours, " +
                    "running 1.0 hours, " +
                    "yoga 1.0 hours"
        }
        findViewById<Button>(R.id.maintain).setOnClickListener {
            val randomCalories = Random.nextInt(958, 1700)
            val calcCarb = (randomCalories * 0.45).toInt()
            val calcProtein = (randomCalories * 0.20).toInt()
            val calcFat = (randomCalories * 0.35).toInt()
            myCalorieView.text = "Calories consumed: $randomCalories"
            myCarbsView.text = "Carbs split: $calcCarb"
            myProteinView.text = "Protein split: $calcProtein"
            myFatView.text = "Fat split: $calcFat"
            exerciseView.text = "Weight 1.5 hours, " +
                    "running 0.5 hours, " +
                    "yoga 1.0 hour, " +
                    "walking 1.0 hours"
        }
    }

}