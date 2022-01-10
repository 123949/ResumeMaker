package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
//    public static final  String NAME = "NAME";
    TextView name,email,address,mobileNo,nationality;
    TextView bachYear,bachName,bachPer,interYear,interName,interPer,highYear,highName,highPer;
    TextView keyskill,project,certificate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

//        =======================
//        This is for activity 1
//            =====================

        name= findViewById(R.id.name);
        name.setText(MainActivity.obj.nameVar);

        email = findViewById(R.id.email);
        email.setText(MainActivity.obj.emailVar);

        address = findViewById(R.id.address);
        address.setText(MainActivity.obj.addressVar);

        mobileNo = findViewById(R.id.mobileNo);
        mobileNo.setText(MainActivity.obj.mobileNoVar);

        nationality = findViewById(R.id.nationality);
        nationality.setText(MainActivity.obj.nationalityVar);


//        =============================
//         this is for activity 2
//            ==========================

        bachYear = findViewById(R.id.bachYear);
        bachYear.setText(MainActivity.obj.BachYearVar);
        bachName = findViewById(R.id.bachNameSchool);
        bachName.setText(MainActivity.obj.BachSchoolNameVar);
        bachPer = findViewById(R.id.bachpercentage);
        bachPer.setText(MainActivity.obj.BachPercentageVar);

        interName=findViewById(R.id.interNameSchool);
        interName.setText(MainActivity.obj.InterSchoolNameVar);
        interPer = findViewById(R.id.interPercentage);
        interPer.setText(MainActivity.obj.InterPercentageVar);
        interYear = findViewById(R.id.interYear);
        interYear.setText(MainActivity.obj.InterYearVar);

        highYear = findViewById(R.id.highYear);
        highYear.setText(MainActivity.obj.HighYearVar);
        highName = findViewById(R.id.highNameSchool);
        highName.setText(MainActivity.obj.HighSchoolNameVar);
        highPer = findViewById(R.id.highPercentage);
        highPer.setText(MainActivity.obj.HighPercentageVar);

//        ===============================
//        this is for activity 4
//            ============================

        keyskill = findViewById(R.id.skill);
        keyskill.setText(MainActivity.obj.KeySkillsVar);

        project = findViewById(R.id.project);
        project.setText(MainActivity.obj.ProjectVar);

        certificate = findViewById(R.id.certificate);
        certificate.setText(MainActivity.obj.CertificateVar);



    }
}