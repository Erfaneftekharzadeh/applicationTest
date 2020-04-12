package com.erfan.android.applicationtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.ImageViewCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public int counter = 2;

    public void LoginButton(View view) {

        EditText username = findViewById(R.id.usernameInput);
        EditText password = findViewById(R.id.passwordInput);
        Log.i("username is", username.getText().toString());
        Log.i("username is", password.getText().toString());

        Toast.makeText(this, "HI " + username.getText().toString(), Toast.LENGTH_LONG).show();

        ImageView pic = findViewById(R.id.picView);

        if (counter == 2) {
            pic.setImageResource(R.drawable.cat2);
            counter = 1;
            Log.i("counter", new Integer(counter).toString());
        } else if (counter == 1) {
            pic.setImageResource(R.drawable.cat1);
            counter = 2;
            Log.i("counter", new Integer(counter).toString());
        }

        Log.i("counterfinal", new Integer(counter).toString());


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

