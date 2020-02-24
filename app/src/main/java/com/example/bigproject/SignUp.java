package com.example.bigproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    EditText emailBt, passEt, conEt;
    Button createBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        emailBt = findViewById(R.id.emailEt);
        passEt = findViewById(R.id.passEt);
        conEt = findViewById(R.id.conEt);
        createBt = findViewById(R.id.createBt);

        createBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email, pass, con;

                email = emailBt.getText().toString();
                pass = passEt.getText().toString();
                con = conEt.getText().toString();
                if (email.equals("")){
                    Toast.makeText(SignUp.this, "Please enter your email", Toast.LENGTH_SHORT).show();
                }
                else if (pass.equals("")){
                    Toast.makeText(SignUp.this, "Please enter your password", Toast.LENGTH_SHORT).show();
                }
                else if (con.equals("")){
                    Toast.makeText(SignUp.this, "Please re-enter your password", Toast.LENGTH_SHORT).show();
                }
                else if (!con.equals(pass)){
                    Toast.makeText(SignUp.this, "You re-enter a mismatched password", Toast.LENGTH_SHORT).show();
                }
                else {
                }

            }
        });

    }
}
