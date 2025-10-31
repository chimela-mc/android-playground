package com.example.loginscreen;

import android.content.Intent; // Importing Intent for navigation between activities

import android.os.Bundle; // Importing Bundle to handle activity state

import android.view.View; // Importing View to handle UI components
import android.widget.Button; // Importing Button for button UI elements
import android.widget.TextView; // Importing TextView for text UI elements
import android.widget.Toast; // Importing Toast for displaying short messages

import androidx.activity.EdgeToEdge; // Importing Bundle to handle activity state
import androidx.appcompat.app.AppCompatActivity; // Importing AppCompatActivity for compatibility support
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // Call the superclass's onCreate method
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main); // Set the layout for this activity

        // ✅ Keep ViewCompat inside onCreate()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Find the TextView for the registration link and the Login button
        TextView registerLink = findViewById(R.id.login_register_link);
        Button loginButton = findViewById(R.id.login_button);

        // Set an OnClickListener for the registration link
        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the RegisterViewActivity
                Intent intent = new Intent(MainActivity.this, RegisterViewActivity.class);
                startActivity(intent); // Start the registration activity
            }
        });

        // Set an OnClickListener for the Login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a Toast message when the Login button is clicked
                Toast.makeText(MainActivity.this, "User  clicked on login", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

