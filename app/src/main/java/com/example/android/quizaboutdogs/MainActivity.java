package com.example.android.quizaboutdogs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.example.android.quizaboutdogs.R.id.q5a2_radio_button;
import static com.example.android.quizaboutdogs.R.id.q6a1_radio_button;

public class MainActivity extends AppCompatActivity {

    //Create the score variable and initialize it to "0"
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswer (View view) {

        //check the answer for the question 1
        RadioButton question1Answer340 = (RadioButton) findViewById(R.id.q1a2_radio_button);
        // assign boolean value depending on state of the button with the right answer
        boolean isRightAnswerQuestion1 = question1Answer340.isChecked();
        // +1 to the score if the button with the right answer is checked
        if (isRightAnswerQuestion1) {
            score += 1;
        }

        //get the user input in question 2
        EditText question2Answer = (EditText) findViewById(R.id.breed_name);
        //create string variable from the user input
        String breedAnswer = question2Answer.getText().toString();
        //compare user input to the right answer
        if (breedAnswer.equals(getString(R.string.question2Answer1)) || breedAnswer.equals(getString(R.string.question2Answer2)) || breedAnswer.equals(getString(R.string.question2Answer3)) || breedAnswer.equals(getString(R.string.question2Answer4))){
            score += 1;
        }

        //check the answer for the question 3
        RadioButton question3AnswerHunting = (RadioButton) findViewById(R.id.q3a3_radio_button);
        // assign boolean value depending on state of the button with the right answer
        boolean isRightAnswerQuestion3 = question3AnswerHunting.isChecked();
        // +1 to the score if the button with the right answer is checked
        if (isRightAnswerQuestion3) {
            score += 1;
        }

        //check the answers for the question 4
        CheckBox question4AnswerChocolate = (CheckBox) findViewById(R.id.q4a1_checkbox);
        CheckBox question4AnswerCarrots = (CheckBox) findViewById(R.id.q4a2_checkbox);
        CheckBox question4AnswerGrapes = (CheckBox) findViewById(R.id.q4a3_checkbox);
        CheckBox question4AnswerMushrooms = (CheckBox) findViewById(R.id.q4a4_checkbox);
        // assign boolean value depending on state of the checkboxes
        boolean isChocolateQuestion4 = question4AnswerChocolate.isChecked();
        boolean isCarrotsQuestion4 = question4AnswerCarrots.isChecked();
        boolean isGrapesQuestion4 = question4AnswerGrapes.isChecked();
        boolean isMushroomsQuestion4 = question4AnswerMushrooms.isChecked();
        // +1 to the score if the checkboxes with right answers are checked and checkbox with wrong answer is unchecked
        if (isChocolateQuestion4 && isGrapesQuestion4 && isMushroomsQuestion4 && !isCarrotsQuestion4) {
            score += 1;
        }

        //check the answer for the question 5
        RadioButton question5Answer384 = (RadioButton) findViewById(q5a2_radio_button);
        // assign boolean value depending on state of the button with the right answer
        boolean isRightAnswerQuestion5 = question5Answer384.isChecked();
        // +1 to the score if the button with the right answer is checked
        if (isRightAnswerQuestion5) {
            score += 1;
        }

        //check the answer for the question 6
        RadioButton question6AnswerEyesight = (RadioButton) findViewById(q6a1_radio_button);
        // assign boolean value depending on state of the button with the right answer
        boolean isRightAnswerQuestion6 = question6AnswerEyesight.isChecked();
        // +1 to the score if the button with the right answer is checked
        if (isRightAnswerQuestion6) {
            score += 1;
        }

        //create toast message with the results of the quiz
        if (score >= 5){
            Toast.makeText(this, "Congratulations! You got " + score + " out of 6 points! You know everything about the dogs", Toast.LENGTH_LONG).show();
        } else if (score >=3){
            Toast.makeText(this, "Well done. You got " + score + " out of 6 points! You know quite a lot about the dogs", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "You got " + score + " out of 6 points! Better read more about the dogs :)", Toast.LENGTH_LONG).show();
        }
        score = 0;
    }
}
