package com.example.imad

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI elements
        val generateButton = findViewById<Button>(R.id.Generatebutton)
        val clearButton = findViewById<Button>(R.id.clearButton)
        val ageText = findViewById<EditText>(R.id.numberText)
        val resultView = findViewById<TextView>(R.id.resultView)

        generateButton.setOnClickListener {
            val userAge = ageText.text.toString().toIntOrNull()

            // Validate user input
            if (userAge in 20..100) {
                if (userAge != null) {

                    // Map of famous figures with their ages
                    val famousFigures = mapOf(
                        "Queen Elizabeth, she was the Queen of England" to 69,
                        "Leonardo da Vinci, he was an Italian Renaissance artist, architect, engineer, and scientist " to 67,
                        "Marie Curie, she was a Physicist and chemist" to 66,
                        "William Shakespeare, he was a Playwright and poet" to 52,
                        "Mahatma Gandhi, he was the Leader of Indian independence movement" to 78,
                        "Queen Njinga Mbandi, she was the Queen of the Kingdom of Ndongo and Matamba" to 81,
                        "Jesus, he was a Religious leader" to 33,
                        "Vincent van Gogh, he was a Painter" to 37,
                        "Amelia Earhart, she was the First female Aviator" to 39,
                        "Ludwig van Beethoven, he  was a Composer" to 56
                    )

                    // Filter famous figures matching user's age
                    val matches = famousFigures.filter { it.value == userAge }

                    // Display matched figures or appropriate message
                    if (matches.isNotEmpty()) {
                        val message = "You are $userAge years old. That's the same age as:\n${matches.keys.joinToString("\n")}"
                        resultView.text = message
                    } else {
                        resultView.text = "No famous figures passed away at age $userAge"
                    }
                } else {
                    resultView.text = "Please enter a valid age"
                }
            } else {
                resultView.text = "The age is out of range. Please enter an age between 20 and 100."
            }
        }

        clearButton.setOnClickListener {
            ageText.text.clear()
            resultView.text = ""
        }
    }
}





