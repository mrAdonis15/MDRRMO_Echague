package com.MDRRMO_Echague_DataBase;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LOGO_Entrance extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Remove the title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        // Set the activity to full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_logo_entrance);

        // Initialize the TextView
        textView = findViewById(R.id.textView);

        // Set a click listener for the TextView
        textView.setOnClickListener(view -> {
            // Start the new activity
            Intent intent = new Intent(LOGO_Entrance.this, Login.class);
            startActivity(intent);
            finish();
        });
    }
}
