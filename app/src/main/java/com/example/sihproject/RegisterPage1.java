package com.example.sihproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegisterPage1 extends AppCompatActivity {

    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page1);
        b1 = findViewById(R.id.rvFarmer1);
        b2 = findViewById(R.id.buyer1);
        b3 = findViewById(R.id.transport1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(RegisterPage1.this,TypeFarmer.class);
                startActivity(i1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(RegisterPage1.this,TypeBuyer.class);
                startActivity(i2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RegisterPage1.this, "This page is under development", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
