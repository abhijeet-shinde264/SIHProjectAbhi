package com.example.sihproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.theartofdev.edmodo.cropper.CropImage;
import com.theartofdev.edmodo.cropper.CropImageView;

public class Register extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6,e7,e8;
    Button b1,b2;
    ImageView i1;
    FirebaseAuth mauth;
    DatabaseReference databaseReference;
    RegisterOne registerOne;
    private Uri imgUrl;

    private StorageReference mStorageRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        e1 = findViewById(R.id.fname);
        e2 = findViewById(R.id.lname);
        e3 = findViewById(R.id.pnumber);
        e4 = findViewById(R.id.faddress);
        e5 = findViewById(R.id.email);
        e6 = findViewById(R.id.password);
        e7 = findViewById(R.id.frameradhar);
        e8 = findViewById(R.id.framercrop);
        b1 = findViewById(R.id.imagefarmer);
        b2 = findViewById(R.id.fregister);
        i1 = findViewById(R.id.imageView);
        registerOne = new RegisterOne();
        databaseReference = FirebaseDatabase.getInstance().getReference().child("Farmer");
        mStorageRef = FirebaseStorage.getInstance().getReference("Farmers image");
        databaseReference = FirebaseDatabase.getInstance().getReference("Farmers image");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CropImage.activity()
                        .setGuidelines(CropImageView.Guidelines.ON)
                        .setMinCropResultSize(512,512)
                        .setAspectRatio(1,1)
                        .start(Register.this);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((e1.getText().toString().isEmpty())||(e2.getText().toString().isEmpty())||(e3.getText().toString().isEmpty())
                        ||(e4.getText().toString().isEmpty())||(e7.getText().toString().isEmpty())||(e6.getText().toString().isEmpty())
                        ||(e8.getText().toString().isEmpty()))
                {
                    Toast.makeText(getApplicationContext(), "please insert the data", Toast.LENGTH_SHORT).show();
                    //e6.setError("Password must be of 6 characters");
                }
                else if (!((e1.getText().toString().isEmpty())||(e2.getText().toString().isEmpty())||(e3.getText().toString().isEmpty())||
                        (e4.getText().toString().isEmpty())||(e5.getText().toString().isEmpty())||(e6.getText().toString().isEmpty())||
                        (e7.getText().toString().isEmpty())||(e8.getText().toString().isEmpty()))&&(e6.getText().toString().length()<6)){
                    e6.setError("Password must be of 6 characters");
                }
                else{
                    registerOne.setFname(e1.getText().toString().trim());
                    registerOne.setLname(e2.getText().toString().trim());
                    registerOne.setFpno(e3.getText().toString().trim());
                    registerOne.setFaddress(e4.getText().toString().trim());
                    registerOne.setFemail(e5.getText().toString().trim());
                    registerOne.setFaadh(e7.getText().toString().trim());
                    registerOne.setFcrop(e8.getText().toString().trim());
                    databaseReference.push().setValue(registerOne);
                    Toast.makeText(getApplicationContext(), "Account has been created", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Register.this,TypeFarmer.class);
                    startActivity(intent);
                    finish();
                }
                //Intent intent = new Intent(Register.this,TypeFarmer.class);
                //tartActivity(intent);
                //finish();
            }
        });
    }
}
