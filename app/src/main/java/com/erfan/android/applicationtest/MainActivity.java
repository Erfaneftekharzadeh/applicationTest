package com.erfan.android.applicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

  public void LoginButton(View view){

      EditText username=findViewById(R.id.usernameInput);
      EditText password=findViewById(R.id.passwordInput);
      Log.i("username is", username.getText().toString());
      Log.i("username is", password.getText().toString());

  }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
