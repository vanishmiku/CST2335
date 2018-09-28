package com.example.a54317.androidlab;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity {
    protected static final String ACTIVITY_NAME = "LoginActivity";
    SharedPreferences rF;
    EditText loginEmail;
    String emailName;
    Button loginButton;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Log.i(ACTIVITY_NAME, "In onCreate()");

        loginButton = findViewById(R.id.loginIn);
        loginEmail = findViewById(R.id.loginEditText);
        rF = getSharedPreferences("perenceEmail", Context.MODE_PRIVATE);
        emailName = rF.getString("DefaultEmail", "email@domain.com");
        loginEmail.setText(emailName);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    editor = rF.edit();
                    String userInput = loginEmail.getText().toString();
                    editor.putString("DefaultEmail", userInput);
                    editor.commit();

                    Intent intent = new Intent(LoginActivity.this, StartActivity.class);
                    startActivity(intent);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }



    protected void onStart(){

        super.onStart();
        Log.i(ACTIVITY_NAME, "In onStart()");
    }
    protected void onResume(){
        super.onResume();
        Log.i(ACTIVITY_NAME, "In onResume()");


    }
    protected void onPause(){

        super.onPause();
        Log.i(ACTIVITY_NAME, "In onPause()");
    }
    protected void onStop(){
        super.onStop();
        Log.i(ACTIVITY_NAME, "In onStop()");

    }
    protected void onDestroy(){

        super.onDestroy();
        Log.i(ACTIVITY_NAME, "In onDestroy()");
    }


}
