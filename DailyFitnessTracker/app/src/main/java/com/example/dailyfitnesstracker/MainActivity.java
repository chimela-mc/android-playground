package com.example.dailyfitnesstracker;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText steps_input;
    private Button calculate_calories_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        steps_input = findViewById(R.id.steps_input); // Make sure to use the correct ID from your XML layout
        calculate_calories_button = findViewById(R.id.calculate_calories_button); // Make sure to use the correct ID from your XML layout

        calculate_calories_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stepsText = steps_input.getText().toString();

                if (stepsText.isEmpty()) {
                    // Display a toast message if no steps are entered
                    Toast.makeText(MainActivity.this, "Please enter steps", Toast.LENGTH_SHORT).show();
                } else {
                    // Convert the steps text to an integer
                    int steps = Integer.parseInt(stepsText);

                    // Create an Intent to start the CaloriesActivity
                    Intent intent = new Intent(MainActivity.this, CaloriesActivity.class);

                    // Add the integer steps value to the Intent as an extra
                    intent.putExtra("steps", steps);

                    // Start the CaloriesActivity
                    startActivity(intent);
                }
            }
        });
    }
}