package com.example.sihproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Buyer_Register extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6,e7;
    ImageView i1;
    Button b1,b2;
    DatabaseReference databaseReference;
    Buyer_Register1 buyer_register1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer__register);
        e1 = findViewById(R.id.bname);
        e2 = findViewById(R.id.blname);
        e3 = findViewById(R.id.bpnumber);
        e4 = findViewById(R.id.bemail);
        e5 = findViewById(R.id.bpassword);
        e6 = findViewById(R.id.bradhar);
        e7 = findViewById(R.id.bpan);
        i1 = findViewById(R.id.bimageView);
        b1 = findViewById(R.id.imagebuyer);
        b2 = findViewById(R.id.bregister);
        buyer_register1 = new Buyer_Register1();
        databaseReference = FirebaseDatabase.getInstance().getReference().child("Buyer Register");
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((e1.getText().toString().isEmpty())||(e2.getText().toString().isEmpty())||(e3.getText().toString().isEmpty())||
                        (e4.getText().toString().isEmpty())||(e5.getText().toString().isEmpty())||(e6.getText().toString().isEmpty())||
                        (e7.getText().toString().isEmpty())){
                    Toast.makeText(getApplicationContext(), "please insert the data", Toast.LENGTH_SHORT).show();
                }
                else if (!((e1.getText().toString().isEmpty())||(e2.getText().toString().isEmpty())||(e3.getText().toString().isEmpty())||
                        (e4.getText().toString().isEmpty())||(e5.getText().toString().isEmpty())||(e6.getText().toString().isEmpty())||
                        (e7.getText().toString().isEmpty()))&&(e5.getText().toString().length()<6)){
                    e5.setError("Password must be of 6 characters");
                }
                else {
                    buyer_register1.setFname(e1.getText().toString().trim());
                    buyer_register1.setLname(e2.getText().toString().trim());
                    buyer_register1.setPno(e3.getText().toString().trim());
                    buyer_register1.setFemail(e4.getText().toString().trim());
                    buyer_register1.setFaadh(e6.getText().toString().trim());
                    buyer_register1.setFpan(e7.getText().toString().trim());
                    databaseReference.push().setValue(buyer_register1);
                    Toast.makeText(getApplicationContext(), "Account has been created", Toast.LENGTH_SHORT).show();
                }
                Intent intent = new Intent(Buyer_Register.this,TypeBuyer.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
