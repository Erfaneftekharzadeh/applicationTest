package com.erfan.android.applicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public void clickFunction(View view){

        /*EditText textView=(EditText) findViewById(R.id.TextField);*/

        Log.i("information", "Button in the main page is pressed: ");

        /*Log.i("user name is:", textView.getText().toString());*/

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
