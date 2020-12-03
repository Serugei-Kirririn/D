package com.example.myapplication;

import android.os.Bundle;
import android.telecom.Call;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;


public class MainActivity extends AppCompatActivity {
 TextInputEditText username, password;
 Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loghol);

        username = findViewById(R.id.edUsername);
        password = findViewById(R.id.edPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(password.getText().toString)){
                    Toast.makeText(MainActivity.this,  "Username / Password Requaidred", Toast.LENGTH_LONG ).show();
                }

            }
            else{
                login();

            }
        });


    }
    public void login(){
        LoginRequest loginRequest = new LoginRequest();
        LoginRequest.setUsername(username.getText(),toString());
        LoginRequest.setPassword(password.getText(),toString());

        Call<LoginResponse> LoginResponceCall = ApiClient.getUserService().userLogin(LoginRequest);
        LoginResponceCall.enqueue(new Call.Callback<LoginResponse>(){

        }

    }
}