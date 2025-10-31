package com.example.dailyfitnesstracker;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CaloriesActivity extends AppCompatActivity {

    // Declare UI elements
    private EditText weight_input;
    private EditText age_input;
    private Button calculate_button;
    private TextView calories_burned;
    private Button back_button; //Declare the Back button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories);


        // Initialize UI elements
        weight_input = findViewById(R.id.weight_input); // Assumed ID for weight EditText
        age_input = findViewById(R.id.age_input); // Assumed ID for age EditText
        calculate_button = findViewById(R.id.calculate_button); // Assumed ID for a calculate button
        calories_burned = findViewById(R.id.calories_burned); // Assumed ID for a TextView to display calories
        back_button = findViewById(R.id.back_button); // Assumed ID for the Back button

        // Retrieve the steps count passed from MainActivity
        int steps = getIntent().getIntExtra("steps", 0);


        // Set up the click listener for the Calculate button
        calculate_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String weightText = weight_input.getText().toString();
                String ageText = age_input.getText().toString();

                // Check if input fields are empty
                if (weightText.isEmpty() || ageText.isEmpty()) {
                    Toast.makeText(CaloriesActivity.this, "Please enter both weight and age", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Convert text to integers
                int weight = Integer.parseInt(weightText);
                int age = Integer.parseInt(ageText);

                // Calculates the number of calories burned by calling the calculateCalories method.
                double calories = calculateCalories(weight, age, steps);

                // Updates the calories_burned TextView to display the calculated calories,
                // rounding the value to the nearest whole number.
                calories_burned.setText("Calories Burned: " + Math.round(calories));
            }
        });

        // Set an OnClickListener for the backButton to handle click events.
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call finish() to close the current activity and return to the MainActivity.
                finish();
            }
        });
    }

    private double calculateCalories(int weight, int age, int steps) {
        // MET value for walking at moderate speed (e.g., 3.5 METs)
        double met = 3.5;
        // Average step length in miles (e.g., 2,000 steps per mile)
        double stepsPerMile = 2000;
        // Convert steps to miles, ensuring floating-point division
        double miles = (double) steps / stepsPerMile;
        // Adjust the MET value based on age (example adjustment, you can refine this)
        double ageFactor = 1 - (age - 20) * 0.001;
        // Calories burned = METs * weight (lbs) * miles * ageFactor
        double caloriesPerMile = met * weight * miles * ageFactor;
        return caloriesPerMile;
    }

}
