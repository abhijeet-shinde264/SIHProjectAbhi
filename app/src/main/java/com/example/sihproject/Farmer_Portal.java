package com.example.sihproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Farmer_Portal extends AppCompatActivity {

    Spinner s1;
    Button b1;
    AlertDialog.Builder builder;
    EditText e1,e2,e3,e4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer__portal);
        e1 = findViewById(R.id.editText);
        e2 = findViewById(R.id.editText1);
        e3 = findViewById(R.id.editText2);
        e4 = findViewById(R.id.editText3);
        b1 = findViewById(R.id.submit);
        builder = new AlertDialog.Builder(this);

        //s1 = findViewById(R.id.spinner);
        //ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
              //  R.array.vegetables, android.R.layout.simple_spinner_item);
// Specify th/e layout to use when the list of choices appears
        //a//dapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        //s1.setAdapter(adapter);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setMessage(R.string.dialog_message) .setTitle(R.string.dialog_title);
                builder.setMessage("Do you want to Submit ?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                                Toast.makeText(getApplicationContext(),"you choose yes action for alertbox",
                                        Toast.LENGTH_SHORT).show();
                            }
                        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //  Action for 'NO' Button
                        dialog.cancel();
                        Toast.makeText(getApplicationContext(),"you choose no action for alertbox",
                                Toast.LENGTH_SHORT).show();
                    }});
                AlertDialog alert = builder.create();
                //Setting the title manually
                alert.setTitle("Submit");
                alert.show();
                }
        });
    }

}
