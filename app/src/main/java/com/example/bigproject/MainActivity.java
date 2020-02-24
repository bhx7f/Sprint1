package com.example.bigproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText emailEt, passwordEt;
    Button signBt, loginBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailEt = findViewById(R.id.emailEt);
        passwordEt = findViewById(R.id.passwordEt);
        signBt = findViewById(R.id.signBt);
        loginBt = findViewById(R.id.loginBt);

        loginBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email, pass;

                email = emailEt.getText().toString();
                pass = passwordEt.getText().toString();

                if (email.equals("")) {
                    Toast.makeText(MainActivity.this, "Please enter an email", Toast.LENGTH_SHORT).show();
                }
                else if (pass.equals("")){
                    Toast.makeText(MainActivity.this, "Please enter a password", Toast.LENGTH_SHORT).show();
                }
                else {

                }


            }
        });
        signBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SignUp.class));
                finish();

            }
        });

    }
}
