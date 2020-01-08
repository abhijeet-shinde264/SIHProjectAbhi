package com.example.sihproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterPage extends AppCompatActivity {

    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
        b1 = findViewById(R.id.farmer);
        b2 = findViewById(R.id.buyer);
        b3 = findViewById(R.id.transport);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(RegisterPage.this,Register.class);
                startActivity(i1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(RegisterPage.this,Buyer_Register.class);
                startActivity(i2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(RegisterPage.this,Transport_Register.class);
                startActivity(i3);
            }
        });
    }
}
