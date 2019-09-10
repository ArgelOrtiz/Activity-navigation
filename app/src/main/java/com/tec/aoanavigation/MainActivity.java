package com.tec.aoanavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.tec.aoanavigation.Home.HomeActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    protected void initComponents(){
        final TextInputEditText emailTextInputEditTExt    = findViewById(R.id.emailMainTextInputEditTExt);
        final TextInputEditText passwordTextInputEditTExt = findViewById(R.id.passwordMainTextInputEditTExt);
        Button enterButton                          = findViewById(R.id.enterMainButton);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.requireNonNull(emailTextInputEditTExt.getText()).toString().isEmpty()){
                    Snackbar.make(v,"Ingrese su correo",Snackbar.LENGTH_LONG).show();
                    return;
                }

                if (Objects.requireNonNull(passwordTextInputEditTExt.getText()).toString().isEmpty()){
                    Snackbar.make(v,"Ingrese su contraseña",Snackbar.LENGTH_LONG).show();
                    return;
                }

                Intent intent   = new Intent(getApplicationContext(), HomeActivity.class);
                intent.putExtra("email",Objects.requireNonNull(emailTextInputEditTExt.getText()).toString());
                intent.putExtra("password",Objects.requireNonNull(passwordTextInputEditTExt.getText()).toString());

                startActivity(intent);

            }
        });

    }
}
