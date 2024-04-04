//package com.example.imad
//
//import android.annotation.SuppressLint
//import android.os.Bundle
//import android.widget.Button
//import android.widget.EditText
//import android.widget.TextView
//import androidx.appcompat.app.AppCompatActivity
////import androidx.appcompat.app.AppCompatActivity
////import android.os.Bundle
//
//class MainActivity : AppCompatActivity() {
//    @SuppressLint("MissingInflatedId")
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
////class MainActivity : AppCompatActivity() {
////    override fun onCreate(savedInstanceState: Bundle?) {
////        super.onCreate(savedInstanceState)
////        setContentView(R.layout.activity_main)
//    }
//}
////import android.os.Bundle
////import android.widget.Button
////import android.widget.EditText
////import android.widget.TextView
////import androidx.appcompat.app.AppCompatActivity
//
//class MainActivity : AppCompatActivity() {
//    private late init var ageInput: EditText
//    private lateinit var generateButton: Button
//    private lateinit var clearButton: Button
//    private late init var resultView: TextView
//
//    private val historicalAges = mapOf(
//        "Albert Einstein" to 76,
//        "Leonardo da Vinci" to 67,
//        "Isaac Newton" to 84
//        // Add more historical figures and their ages at death as needed
//    )
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        ageInput = findViewById(R.id.numberText)
//        generateButton = findViewById(R.id.Generatebutton)
//        clearButton = findViewById(R.id.clearButton)
//        resultView = findViewById(R.id.resultView)
//
//        generateButton.setOnClickListener {
//            generateHistory()
//        }
//
//        clearButton.setOnClickListener {
//            resultView.text = ""
//        }
//    }
//
//    private fun generateHistory() {
//        val ageStr = ageInput.text.toString()
//        if (ageStr.isNotEmpty()) {
//            val age = ageStr.toInt()
//            val matchedFigures = StringBuilder()
//
//            for ((figure, figureAge) in historicalAges) {
//                if (figureAge == age) {
//                    matchedFigures.append("$figure passed away at the age of $age\n")
//                }
//            }
//
//            if (matchedFigures.isNotEmpty()) {
//                resultView.text = matchedFigures.toString()
//            } else {
//                resultView.text = "No historical figures found who passed away at age $age"
//            }
//        }
//    }
//}

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

        val generateButton = findViewById<Button>(R.id.Generatebutton)
        val clearButton = findViewById<Button>(R.id.clearButton)
        val ageText = findViewById<EditText>(R.id.numberText)
        val resultView = findViewById<TextView>(R.id.resultView)

        generateButton.setOnClickListener {
            val userAge = ageText.text.toString().toIntOrNull()
            if (userAge in 20..100) {
                if (userAge != null) {
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

                    val matches = famousFigures.filter { it.value == userAge }
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

//
//import android.annotation.SuppressLint
//import android.os.Bundle
//import android.widget.Button
//import android.widget.EditText
//import android.widget.TextView
//import androidx.appcompat.app.AppCompatActivity
//
//class MainActivity : AppCompatActivity() {
//    private lateinit var ageInput: EditText
//    private lateinit var generateButton: Button
//    private lateinit var clearButton: Button
//    private lateinit var resultView: TextView
//
//    private val historicalAges = mapOf(
//        "Albert Einstein" to 76,
//        "Leonardo da Vinci" to 67,
//        "Isaac Newton" to 84
//        // Add more historical figures and their ages at death as needed
//    )
//
//    @SuppressLint("MissingInflatedId")
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        ageInput = findViewById(R.id.numberText)
//        generateButton = findViewById(R.id.Generatebutton)
//        clearButton = findViewById(R.id.clearButton)
//        resultView = findViewById(R.id.resultView)
//
//        generateButton.setOnClickListener {
//            generateHistory()
//        }
//
//        clearButton.setOnClickListener {
//            resultView.text = ""
//        }
//    }
//
//    @SuppressLint("SetTextI18n")
//    private fun generateHistory() {
//        val ageStr = ageInput.text.toString()
//        if (ageStr.isNotEmpty()) {
//            val age = ageStr.toInt()
//            val matchedFigures = StringBuilder()
//
//            for ((figure, figureAge) in historicalAges) {
//                if (figureAge == age) {
//                    matchedFigures.append("$figure passed away at the age of $age\n")
//                }
//            }
//
//            if (matchedFigures.isNotEmpty()) {
//                resultView.text = matchedFigures.toString()
//            } else {
//                resultView.text = "No historical figures found who passed away at age $age"
//            }
//        }
//    }
//}



