package com.example.imad

import androidx.test.core.app.ActivityScenario.launch
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.Matchers.containsString
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Test
    fun testGenerateButton() {
        // Launch the MainActivity
        val scenario = launch(MainActivity::class.java)

        // Type a valid age into the EditText
        onView(withId(R.id.numberText)).perform(typeText("69"))

        // Click on the Generate Button
        onView(withId(R.id.Generatebutton)).perform(click())

        // Check if the result view is displayed with a message
        onView(withId(R.id.resultView)).check(matches(isDisplayed()))
        onView(withId(R.id.resultView)).check(matches(withText(containsString("You are 69 years old."))))

        // Close the activity after the test
        scenario.close()
    }

    @Test
    fun testClearButton() {
        // Launch the MainActivity
        val scenario = launch(MainActivity::class.java)

        // Type some text into the EditText
        onView(withId(R.id.numberText)).perform(typeText("50"))

        // Click on the Clear Button
        onView(withId(R.id.clearButton)).perform(click())

        // Check if the EditText is empty
        onView(withId(R.id.numberText)).check(matches(withText("")))

        // Check if the result view is empty
        onView(withId(R.id.resultView)).check(matches(withText("")))

        // Close the activity after the test
        scenario.close()
    }
}
