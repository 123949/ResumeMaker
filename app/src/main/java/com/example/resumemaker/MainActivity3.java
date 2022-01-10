package com.example.resumemaker;

import static com.example.resumemaker.MainActivity.obj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    Button btn5;
    Button btn4;
    private View Btn4;
    EditText skill,project,certificate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);

    }
    public void makeResume(View view){
        Intent i = new Intent(getApplicationContext(),MainActivity4.class);
        skill = findViewById(R.id.skill);
        project = findViewById(R.id.project);
        certificate = findViewById(R.id.certificate);

        obj.KeySkillsVar = skill.getText().toString();
        obj.ProjectVar = project.getText().toString();
        obj.CertificateVar = certificate.getText().toString();


        startActivity(i);
    }
    public void back(View view){
        Intent i = new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(i);
    }
}