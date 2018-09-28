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
import android.widget.Toast;

public class StartActivity extends Activity {

    protected static final String ACTIVITY_NAME = "StartActivity";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Log.i(ACTIVITY_NAME, "In onCreate()");

        Button back = (Button)findViewById(R.id.button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backLoginActivity();
            }
        });

    }
    public void backLoginActivity(){
        Intent intent = new Intent(this,ListItemsActivity.class);
        startActivityForResult(intent,50);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==50){
            Log.i(ACTIVITY_NAME, "Returned to StartActivity.onActivityResult()");

            if(resultCode==Activity.RESULT_OK){
                String messagePassed = data.getStringExtra("Response");
                Toast toast = Toast.makeText(this , messagePassed, Toast.LENGTH_LONG);
                toast.show();
            }
        }


    }
    protected void onStart(){
        super.onStart();
        Log.i(ACTIVITY_NAME, "In onCreate()");


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
