package com.example.myquiz3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView headview;
    TextView entername;
    EditText namevalue;
    Button start;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Identifying with IDs
        headview = findViewById(R.id.HeadView);
        entername = findViewById(R.id.EnterName);
        namevalue = findViewById(R.id.ValueName);

        start = findViewById(R.id.startbutton);


        //pressing start button
        start.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, QuestionActivity.class);
            intent.putExtra("Name", namevalue.getText().toString());
            startActivity(intent);

        });

    }



}

