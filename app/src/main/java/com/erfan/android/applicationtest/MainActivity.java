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

    public void fade(View view){

        Log.i("fade function", "fade: pic was pressed");

        ImageView imageView= findViewById(R.id.picView);

        imageView.animate().alpha(0).setDuration(2000);
    }







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

