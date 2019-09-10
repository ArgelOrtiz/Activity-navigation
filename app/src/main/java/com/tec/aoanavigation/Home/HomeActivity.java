package com.tec.aoanavigation.Home;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.tec.aoanavigation.R;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initComponents();
    }

    protected void initComponents(){
        TextView emailTextView      = findViewById(R.id.emailHomeTextView);
        TextView passwordTextView   = findViewById(R.id.passwordHomeTextView);
        Intent intent               = getIntent();

        String email    = intent.getStringExtra("email");
        String password = intent.getStringExtra("password");

        emailTextView.setText(email);
        passwordTextView.setText(password);

    }
}
