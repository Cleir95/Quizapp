package com.example.android.physicsquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.Display;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.content.Context;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score=0;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }




        public void submit(View view){


            EditText name = (EditText) findViewById(R.id.name);
            String editName = name.getText().toString();


            RadioButton landBreeze = findViewById(R.id.q1_C);
                if (landBreeze.isChecked()){
                        score++;
                }
            RadioButton seaBreeze = findViewById(R.id.q2_D);
                if (seaBreeze.isChecked()){
                        score++;
                }
            CheckBox breeze = findViewById(R.id.q3_A);
            CheckBox heating = findViewById(R.id.q3_C);

            if (breeze.isChecked() && heating.isChecked()) {
                        score++;
                }
            RadioButton newton = findViewById(R.id.q4_D);
                if (newton.isChecked()){
                        score++;
                }
            RadioButton pascal = findViewById(R.id.q5C);
                if (pascal.isChecked()){
                        score++;
                }
                displayScore(score, editName);
        }

    public void displayScore(int score, String name) {
        String toastMessage = name + " Your result is: " + String.valueOf(score) + " out of 5 points!";
        if (score == 5) {
            Toast.makeText(this, "Congratulation " + name + " your score is 5. Well done!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show();
        }

    }



    public void reset(View view) {

        //clear edit text
        EditText Editname = (EditText) findViewById(R.id.name);
        Editname.getText().clear();

        //clear checked ones

        CheckBox check1 = findViewById(R.id.q3_A);
        if (check1.isChecked()) {
            check1.setChecked(false);
        }
        CheckBox check2 = findViewById(R.id.q3_B);
        if (check2.isChecked()) {
            check2.setChecked(false);
        }
        CheckBox check3 = findViewById(R.id.q3_C);
        if (check3.isChecked()) {
            check3.setChecked(false);
        }
        CheckBox check4 = findViewById(R.id.q3_D);
        if (check4.isChecked()) {
            check4.setChecked(false);
        }


        RadioGroup group1 = findViewById(R.id.radioA);
        group1.clearCheck();

        RadioGroup group2 = findViewById(R.id.radioB);
        group2.clearCheck();

        RadioGroup group3 = findViewById(R.id.radioB);
        group3.clearCheck();

        RadioGroup group4 = findViewById(R.id.radioE);
        group4.clearCheck();

        RadioGroup group5 = findViewById(R.id.radioE);
        group5.clearCheck();


    }





        }
