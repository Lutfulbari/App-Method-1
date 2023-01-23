package com.lutful.method1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        showToast();
        makeDialog();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast();
            }
        });


    }
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    private void showToast(){

        Toast.makeText(MainActivity.this, "hello", Toast.LENGTH_SHORT).show();
    }

    private void makeDialog(){
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("This is a title")
                .setMessage("Hello")
                .show();
    }
}