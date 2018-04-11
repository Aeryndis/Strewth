package com.example.android.strewth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
* This app is a quiz on facts about Australia
*/

public class MainActivity extends AppCompatActivity {

    double score = 0;
    RadioGroup radio_q1, radio_q2, radio_q4, radio_q5, radio_q7, radio_q8, radio_q10;
    CheckBox check_q3_a1, check_q3_a2, check_q3_a3, check_q3_a4, check_q6_a1, check_q6_a2,
            check_q6_a3, check_q6_a4, check_q9_a1, check_q9_a2, check_q9_a3, check_q9_a4;
    EditText q11;
    TextView fact1, fact2, fact3, fact4, fact5, fact6, fact7, fact8, fact9, fact10, fact11;

    String tag = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


     /**
     * This method is called when the 'Tally Me Up' (submit) button is clicked
     *
     * It calculates the score and sets the answers to visible
     */
    public void calculateScore(View view) {
        //        check answers and tally score
            boolean answer1 = ((RadioButton) findViewById(R.id.q1_a3)).isChecked();
            if (answer1) {
                score += 1;
            }
            boolean answer2 = ((RadioButton) findViewById(R.id.q2_a1)).isChecked();
            if (answer2) {
                score += 1;
            }
            boolean answer3a = ((CheckBox) findViewById(R.id.q3_a1)).isChecked();
            boolean answer3b = ((CheckBox) findViewById(R.id.q3_a2)).isChecked();
            boolean answer3c = ((CheckBox) findViewById(R.id.q3_a3)).isChecked();
            boolean answer3d = ((CheckBox) findViewById(R.id.q3_a4)).isChecked();
//            award points only if correct boxes are selected and incorrect boxes are not selected
            if ((!answer3a) & (answer3b) & (answer3c) & (!answer3d)){
                score += 1;
            } else if ((!answer3a) & (!answer3b) & (answer3c) & (!answer3d)){
                score += 0.5;
            } else if ((!answer3a) & (answer3b) & (!answer3c) & (!answer3d)){
                score += 0.5;
            }
            boolean answer4 = ((RadioButton) findViewById(R.id.q4_a4)).isChecked();
            if (answer4) {
                score += 1;
            }
            boolean answer5 = ((RadioButton) findViewById(R.id.q5_a1)).isChecked();
            if (answer5) {
                score += 1;
            }
            boolean answer6a = ((CheckBox) findViewById(R.id.q6_a1)).isChecked();
            boolean answer6b = ((CheckBox) findViewById(R.id.q6_a2)).isChecked();
            boolean answer6c = ((CheckBox) findViewById(R.id.q6_a3)).isChecked();
            boolean answer6d = ((CheckBox) findViewById(R.id.q6_a4)).isChecked();
//            award points only if correct boxes are selected and incorrect boxes are not selected
            if ((answer6a) & (!answer6b) & (answer6c) & (!answer6d)){
                score += 1;
            } else if ((answer6a) & (!answer6b) & (!answer6c) & (!answer6d)){
                score += 0.5;
            } else if ((!answer6a) & (!answer6b) & (answer6c) & (!answer6d)){
                score += 0.5;
            }
            boolean answer7 = ((RadioButton) findViewById(R.id.q7_a3)).isChecked();
            if (answer7) {
                score += 1;
            }
            boolean answer8 = ((RadioButton) findViewById(R.id.q8_a1)).isChecked();
            if (answer8) {
                score += 1;
            }
            boolean answer9a = ((CheckBox) findViewById(R.id.q9_a1)).isChecked();
            boolean answer9b = ((CheckBox) findViewById(R.id.q9_a2)).isChecked();
            boolean answer9c = ((CheckBox) findViewById(R.id.q9_a3)).isChecked();
            boolean answer9d = ((CheckBox) findViewById(R.id.q9_a4)).isChecked();
//            award points only if correct boxes are selected and incorrect boxes are not selected
            if ((!answer9a) & (answer9b) & (!answer9c) & (answer9d)){
                score += 1;
            } else if ((!answer9a) & (answer9b) & (!answer9c) & (!answer9d)){
                score += 0.5;
            } else if ((!answer9a) & (!answer9b) & (!answer9c) & (answer9d)){
                score += 0.5;
            }
            boolean answer10 = ((RadioButton) findViewById(R.id.q10_a2)).isChecked();
            if (answer10) {
                score += 1;
            }
            EditText answer11 = findViewById(R.id.q11_answer);
            String q11Response = answer11.getText().toString();
            if (q11Response.equalsIgnoreCase("Terra Nullius")) {
                score += 5;
            }
            displayScore(score);
//        set the answers to visible
            fact1 = findViewById(R.id.fact_1);
            fact1.setVisibility(View.VISIBLE);
            fact2 = findViewById(R.id.fact_2);
            fact2.setVisibility(View.VISIBLE);
            fact3 = findViewById(R.id.fact_3);
            fact3.setVisibility(View.VISIBLE);
            fact4 = findViewById(R.id.fact_4);
            fact4.setVisibility(View.VISIBLE);
            fact5 = findViewById(R.id.fact_5);
            fact5.setVisibility(View.VISIBLE);
            fact6 = findViewById(R.id.fact_6);
            fact6.setVisibility(View.VISIBLE);
            fact7 = findViewById(R.id.fact_7);
            fact7.setVisibility(View.VISIBLE);
            fact8 = findViewById(R.id.fact_8);
            fact8.setVisibility(View.VISIBLE);
            fact9 = findViewById(R.id.fact_9);
            fact9.setVisibility(View.VISIBLE);
            fact10 = findViewById(R.id.fact_10);
            fact10.setVisibility(View.VISIBLE);
            fact11 = findViewById(R.id.fact_11);
            fact11.setVisibility(View.VISIBLE);
            score = 0;
        }

    /**
     * This method displays the score after it is calculated
     */
    public void displayScore (double score) {
        if (score <= 4) {
            String toastMessage = "Ouch, few snags short of a barbie there mate. \nYour score is: " + score + " out of 15. \nScroll back up for the answers!";
            Toast.makeText(getApplicationContext(),toastMessage,Toast.LENGTH_LONG).show();
        }
        if ((score >= 5) && (score <= 9)) {
            String toastMessage = "Not a bad bash there cobber. \nYour score is: " + score + " out of 15. \nScroll back up for the answers!";
            Toast.makeText(getApplicationContext(),toastMessage,Toast.LENGTH_LONG).show();
        }
        if ((score >=10) && (score <= 12)) {
            String toastMessage = "Crikey, dinky di effort there. \nYour score is: " + score + " out of 15. \nScroll back up for the answers!";
            Toast.makeText(getApplicationContext(),toastMessage,Toast.LENGTH_LONG).show();
        }
        if ((score >=13) && (score <= 14)) {
            String toastMessage = "Stone the flamin\' crows, you almost had it. \nYour score is: " + score + " out of 15. \nScroll back up for the answers!";
            Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_LONG).show();
        }
        if (score == 15) {
            String toastMessage = "No flies on you mate! Well done!. \nYour score is: " + score + " out of 15. \nScroll back up for the answers!";
            Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_LONG).show();
        }
    }


    /**
     * This method is called when the 'Try Again Mate!' (reset) button is clicked
     *
     * It resets all checkboxes and radio buttons to their unchecked states and re-hides the answers
     */
    public void resetQuiz(View view) {
//        reset the radio buttons
        radio_q1 = findViewById(R.id.radio_q1);
        radio_q1.clearCheck();
        radio_q2 = findViewById(R.id.radio_q2);
        radio_q2.clearCheck();
        radio_q4 = findViewById(R.id.radio_q4);
        radio_q4.clearCheck();
        radio_q5 = findViewById(R.id.radio_q5);
        radio_q5.clearCheck();
        radio_q7 = findViewById(R.id.radio_q7);
        radio_q7.clearCheck();
        radio_q8 = findViewById(R.id.radio_q8);
        radio_q8.clearCheck();
        radio_q10 = findViewById(R.id.radio_q10);
        radio_q10.clearCheck();
//        check and reset the checkboxes if they are checked
        check_q3_a1 = findViewById(R.id.q3_a1);
        if (check_q3_a1.isChecked()) {
            check_q3_a1.setChecked(false);
        }
        check_q3_a2 = findViewById(R.id.q3_a2);
        if (check_q3_a2.isChecked()) {
            check_q3_a2.setChecked(false);
        }
        check_q3_a3 = findViewById(R.id.q3_a3);
        if (check_q3_a3.isChecked()) {
            check_q3_a3.setChecked(false);
        }
        check_q3_a4 = findViewById(R.id.q3_a4);
        if (check_q3_a4.isChecked()) {
            check_q3_a4.setChecked(false);
        }
        check_q6_a1 = findViewById(R.id.q6_a1);
        if (check_q6_a1.isChecked()) {
            check_q6_a1.setChecked(false);
        }
        check_q6_a2 = findViewById(R.id.q6_a2);
        if (check_q6_a2.isChecked()) {
            check_q6_a2.setChecked(false);
        }
        check_q6_a3 = findViewById(R.id.q6_a3);
        if (check_q6_a3.isChecked()) {
            check_q6_a3.setChecked(false);
        }
        check_q6_a4 = findViewById(R.id.q6_a4);
        if (check_q6_a4.isChecked()) {
            check_q6_a4.setChecked(false);
        }
        check_q9_a1 = findViewById(R.id.q9_a1);
        if (check_q9_a1.isChecked()) {
            check_q9_a1.setChecked(false);
        }
        check_q9_a2 = findViewById(R.id.q9_a2);
        if (check_q9_a2.isChecked()) {
            check_q9_a2.setChecked(false);
        }
        check_q9_a3 = findViewById(R.id.q9_a3);
        if (check_q9_a3.isChecked()) {
            check_q9_a3.setChecked(false);
        }
        check_q9_a4 = findViewById(R.id.q9_a4);
        if (check_q9_a4.isChecked()) {
            check_q9_a4.setChecked(false);
        }
//        wipe the EditText
        q11 = findViewById(R.id.q11_answer);
        q11.setText(null);
//        reset the answers to gone
        fact1 = findViewById(R.id.fact_1);
        fact1.setVisibility(View.GONE);
        fact2 = findViewById(R.id.fact_2);
        fact2.setVisibility(View.GONE);
        fact3 = findViewById(R.id.fact_3);
        fact3.setVisibility(View.GONE);
        fact4 = findViewById(R.id.fact_4);
        fact4.setVisibility(View.GONE);
        fact5 = findViewById(R.id.fact_5);
        fact5.setVisibility(View.GONE);
        fact6 = findViewById(R.id.fact_6);
        fact6.setVisibility(View.GONE);
        fact7 = findViewById(R.id.fact_7);
        fact7.setVisibility(View.GONE);
        fact8 = findViewById(R.id.fact_8);
        fact8.setVisibility(View.GONE);
        fact9 = findViewById(R.id.fact_9);
        fact9.setVisibility(View.GONE);
        fact10 = findViewById(R.id.fact_10);
        fact10.setVisibility(View.GONE);
        fact11 = findViewById(R.id.fact_11);
        fact11.setVisibility(View.GONE);
    }
}
