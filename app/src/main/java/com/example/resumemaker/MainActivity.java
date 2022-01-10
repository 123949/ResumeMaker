package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText name,email,address,mobileNo,nationality;
    public static Data obj = new Data();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String nameTxt = name.getText().toString().trim();
//                Intent i = new Intent(getApplicationContext(),MainActivity4.class);
//                i.putExtra(MainActivity4.NAME , nameTxt);
//
//            }
//        });

    }
    public  void go(View view){
        Intent i =new Intent(getApplicationContext(),MainActivity2.class);
        btn=findViewById(R.id.button1);

        name= findViewById(R.id.nameText);
        email= findViewById(R.id.emailText);
        address = findViewById(R.id.addressText);
        mobileNo = findViewById(R.id.moblienoText);
        nationality = findViewById(R.id.nationalityText);

        obj.nameVar = name.getText().toString();
        obj.emailVar = email.getText().toString();
        obj.addressVar = address.getText().toString();
        obj.mobileNoVar = mobileNo.getText().toString();
        obj.nationalityVar = nationality.getText().toString();
        startActivity(i);

    }


}