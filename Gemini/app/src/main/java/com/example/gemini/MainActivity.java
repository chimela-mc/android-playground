package com.example.gemini;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText userInput;
    private Button actionButton;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        userInput = findViewById(R.id.user_input);
        actionButton = findViewById(R.id.action_button);
        resultText = findViewById(R.id.result_text);

        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = userInput.getText().toString();
                // Trim leading/trailing whitespace and split by one or more spaces
                String[] words = text.trim().split("\\s+");
                int wordCount = words.length;

                // Handle the case where the input is empty
                if (text.trim().isEmpty()) {
                    wordCount = 0;
                }

                resultText.setText("Word Count: " + wordCount);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}