package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    Button btn2;
    Button btn3;
    EditText bachYear,bachName,bachPer,interYear,interName,interPer,highYear,highName,highPer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
    }
    public void go(View view){
        bachYear= findViewById(R.id.Year);
        bachName=findViewById(R.id.bachNameSchool);
        bachPer = findViewById(R.id.bachpercentage);
        interYear = findViewById(R.id.bachYear);
        interName = findViewById(R.id.interNameSchool);
        interPer = findViewById(R.id.interPercentage);
        highYear = findViewById(R.id.highYear);
        highName = findViewById(R.id.highNameSchool);
        highPer = findViewById(R.id.highPercentage);

        MainActivity.obj.BachYearVar = bachYear.getText().toString();
        MainActivity.obj.BachSchoolNameVar = bachName.getText().toString();
        MainActivity.obj.BachPercentageVar = bachPer.getText().toString();

        MainActivity.obj.InterYearVar = interYear.getText().toString();
        MainActivity.obj.InterSchoolNameVar = interName.getText().toString();
        MainActivity.obj.InterPercentageVar = interPer.getText().toString();

        MainActivity.obj.HighYearVar = highYear.getText().toString();
        MainActivity.obj.HighSchoolNameVar = highName.getText().toString();
        MainActivity.obj.HighPercentageVar = highPer.getText().toString();
        Intent i = new Intent(getApplicationContext(),MainActivity3.class);
        startActivity(i);
    }
    public void back(View view){
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
    }
}