package com.example.sihproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3;
    EditText e1,e2;
    TextView t1;
    ProgressDialog PD;
    private FirebaseAuth firebaseAuth;
    //FirebaseUser user;
    private FirebaseAuth.AuthStateListener authStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firebaseAuth = FirebaseAuth.getInstance();
        e1 = findViewById(R.id.email);
        e2 = findViewById(R.id.password);
        b1 = findViewById(R.id.signin);
        b2 = findViewById(R.id.signphon);
        b3 = findViewById(R.id.signup);
        t1 = findViewById(R.id.forgot22);
        PD = new ProgressDialog(this);
        PD.setMessage("Loading...");
        PD.setCancelable(true);
        PD.setCanceledOnTouchOutside(false);
        authStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    Toast.makeText(MainActivity.this, "Welcome Back ", Toast.LENGTH_SHORT).show();
                    Intent I = new Intent(MainActivity.this, RegisterPage1.class);
                    startActivity(I);
                    finish();
                } else {
                    Toast.makeText(MainActivity.this, "Login to continue", Toast.LENGTH_SHORT).show();
                }
            }
        };
        t1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(MainActivity.this,ForgetPassword.class);
                startActivity(i1);
            }
        });
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().isEmpty() || e2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Pl enter the details",Toast.LENGTH_LONG).show();
                }
                else if (!(e1.getText().toString().isEmpty() && e2.getText().toString().isEmpty())){

                    PD.show();
                    firebaseAuth.signInWithEmailAndPassword(e1.getText().toString(), e2.getText().toString())
                            .addOnCompleteListener(MainActivity.this, new OnCompleteListener() {
                                @Override
                                public void onComplete(@NonNull Task task) {
                                    if (!task.isSuccessful()) {
                                        Toast.makeText(MainActivity.this, "Not sucessfull", Toast.LENGTH_SHORT).show();
                                    } else {
                                        Intent i1 = new Intent(MainActivity.this, RegisterPage1.class);
                                        startActivity(i1);
                                        finish();
                                    }
                                    PD.dismiss();
                                }
                            });
                    //PD.dismiss();
                }
                else {
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(MainActivity.this,RegisterPhone.class);
                startActivity(i1);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(MainActivity.this,RegisterPage.class);
                startActivity(i2);
                finish();
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        firebaseAuth.addAuthStateListener(authStateListener);
    }
}
