package com.example.android.islamicquizzer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int scorePoint = 0;
    int totalPoint = 125;
    int numberOfQuizLeft = 5;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
     * Brings on quiz one on click.
     * */

    public void quizOne(View view) {
        //        quiz 1 comes up
        TextView quizOneDisplay = (TextView) findViewById(R.id.quiz_one);
        quizOneDisplay.setVisibility(View.VISIBLE);
        RadioGroup quizOneOptionsDisplay = (RadioGroup) findViewById(R.id.quiz_one_options);
        quizOneOptionsDisplay.setVisibility(View.VISIBLE);

        LinearLayout hideStartBar = (LinearLayout) findViewById(R.id.start_bar);
        hideStartBar.setVisibility(View.GONE);
    }

    public void solveQuizOne(View view) {
        TextView quizOneDisplay = (TextView) findViewById(R.id.quiz_one);
        RadioGroup quizOneOptions = (RadioGroup) findViewById(R.id.quiz_one_options);
        int answerForQuizOne = quizOneOptions.getCheckedRadioButtonId();

        if (answerForQuizOne == R.id.quiz_one_option_a) {
            scoreCalculator(25);
            quizCounter();
            Toast.makeText(this, "Ma sha'a Allah! You're very correct! " + numberOfQuizLeft + " more to go!", Toast.LENGTH_SHORT).show();
            quizOneDisplay.setVisibility(View.GONE);
            quizOneOptions.setVisibility(View.GONE);
            Button toQuizTwoButton = (Button) findViewById(R.id.go_to_quiz_two);
            toQuizTwoButton.setVisibility(View.VISIBLE);

        } else {
            scoreCalculator(0);
            quizCounter();
            Toast.makeText(this, "SubhaanAllah! You're wrong! " + numberOfQuizLeft + " more to go!", Toast.LENGTH_SHORT).show();
            quizOneDisplay.setVisibility(View.GONE);
            quizOneOptions.setVisibility(View.GONE);
            Button toQuizTwoButton = (Button) findViewById(R.id.go_to_quiz_two);
            toQuizTwoButton.setVisibility(View.VISIBLE);
        }
    }

    /*
     * Brings on quiz two on click.
     * */
    public void quizTwo(View view) {
        //        quiz 2 comes up
        Button toQuizTwoButton = (Button) findViewById(R.id.go_to_quiz_two);
        toQuizTwoButton.setVisibility(View.GONE);
        TextView quizTwoDisplay = (TextView) findViewById(R.id.quiz_two);
        quizTwoDisplay.setVisibility(View.VISIBLE);
        RadioGroup quizTwoOptionsDisplay = (RadioGroup) findViewById(R.id.quiz_two_options);
        quizTwoOptionsDisplay.setVisibility(View.VISIBLE);
    }

    public void solveQuizTwo(View view) {
        TextView quizTwoDisplay = (TextView) findViewById(R.id.quiz_two);
        RadioGroup quizTwoOptions = (RadioGroup) findViewById(R.id.quiz_two_options);
        int answerForQuizTwo = quizTwoOptions.getCheckedRadioButtonId();

        if (answerForQuizTwo == R.id.quiz_two_option_c) {
            scoreCalculator(25);
            quizCounter();
            Toast.makeText(this, "Ma sha'a Allah! You're very correct! " + numberOfQuizLeft + " more to go!", Toast.LENGTH_SHORT).show();
            quizTwoDisplay.setVisibility(View.GONE);
            quizTwoOptions.setVisibility(View.GONE);
            Button toQuizThreeButton = (Button) findViewById(R.id.go_to_quiz_three);
            toQuizThreeButton.setVisibility(View.VISIBLE);

        } else {
            scoreCalculator(0);
            quizCounter();
            Toast.makeText(this, "SubhaanAllah! You're wrong! " + numberOfQuizLeft + " more to go!", Toast.LENGTH_SHORT).show();
            quizTwoDisplay.setVisibility(View.GONE);
            quizTwoOptions.setVisibility(View.GONE);
            Button toQuizThreeButton = (Button) findViewById(R.id.go_to_quiz_three);
            toQuizThreeButton.setVisibility(View.VISIBLE);
        }
    }

    /*
     * Brings on quiz three on click.
     * */

    public void quizThree(View view) {
        //        quiz 3 comes up
        Button toQuizThreeButton = (Button) findViewById(R.id.go_to_quiz_three);
        toQuizThreeButton.setVisibility(View.GONE);
        TextView quizThreeDisplay = (TextView) findViewById(R.id.quiz_three);
        quizThreeDisplay.setVisibility(View.VISIBLE);
        RadioGroup quizThreeOptionsDisplay = (RadioGroup) findViewById(R.id.quiz_three_options);
        quizThreeOptionsDisplay.setVisibility(View.VISIBLE);
    }

    public void solveQuizThree(View view) {
        TextView quizThreeDisplay = (TextView) findViewById(R.id.quiz_three);
        RadioGroup quizThreeOptions = (RadioGroup) findViewById(R.id.quiz_three_options);
        int answerForQuizThree = quizThreeOptions.getCheckedRadioButtonId();

        if (answerForQuizThree == R.id.quiz_three_option_b) {
            scoreCalculator(25);
            quizCounter();
            Toast.makeText(this, "Ma sha'a Allah! You're very correct! " + numberOfQuizLeft + " more to go!", Toast.LENGTH_SHORT).show();
            quizThreeDisplay.setVisibility(View.GONE);
            quizThreeOptions.setVisibility(View.GONE);
            Button toQuizFourButton = (Button) findViewById(R.id.go_to_quiz_four);
            toQuizFourButton.setVisibility(View.VISIBLE);

        } else {
            scoreCalculator(0);
            quizCounter();
            Toast.makeText(this, "SubhaanAllah! You're wrong! " + numberOfQuizLeft + " more to go!", Toast.LENGTH_SHORT).show();
            quizThreeDisplay.setVisibility(View.GONE);
            quizThreeOptions.setVisibility(View.GONE);
            Button toQuizFourButton = (Button) findViewById(R.id.go_to_quiz_four);
            toQuizFourButton.setVisibility(View.VISIBLE);
        }
    }
    /*
     * Brings on quiz four on click.
     * */

    public void quizFour(View view) {
        //        quiz 4 comes up
        Button toQuizFourButton = (Button) findViewById(R.id.go_to_quiz_four);
        toQuizFourButton.setVisibility(View.GONE);
        TextView quizFourDisplay = (TextView) findViewById(R.id.quiz_four);
        quizFourDisplay.setVisibility(View.VISIBLE);
        RadioGroup quizFourOptionsDisplay = (RadioGroup) findViewById(R.id.quiz_four_options);
        quizFourOptionsDisplay.setVisibility(View.VISIBLE);
    }

    public void solveQuizFour(View view) {
        TextView quizFourDisplay = (TextView) findViewById(R.id.quiz_four);
        RadioGroup quizFourOptions = (RadioGroup) findViewById(R.id.quiz_four_options);
        int answerForQuizFour = quizFourOptions.getCheckedRadioButtonId();

        if (answerForQuizFour == R.id.quiz_four_option_c) {
            scoreCalculator(25);
            quizCounter();
            Toast.makeText(this, "Ma sha'a Allah! You're very correct! " + numberOfQuizLeft + " more to go!", Toast.LENGTH_SHORT).show();
            quizFourDisplay.setVisibility(View.GONE);
            quizFourOptions.setVisibility(View.GONE);
            Button toQuizFiveButton = (Button) findViewById(R.id.go_to_quiz_five);
            toQuizFiveButton.setVisibility(View.VISIBLE);

        } else {
            scoreCalculator(0);
            quizCounter();
            Toast.makeText(this, "SubhaanAllah! You're wrong! " + numberOfQuizLeft + " more to go!", Toast.LENGTH_SHORT).show();
            quizFourDisplay.setVisibility(View.GONE);
            quizFourOptions.setVisibility(View.GONE);
            Button toQuizFiveButton = (Button) findViewById(R.id.go_to_quiz_five);
            toQuizFiveButton.setVisibility(View.VISIBLE);
        }
    }

    /* Brings on quiz five*/

    public void quizFive(View view) {
        //        quiz 5 comes up
        Button toQuizFiveButton = (Button) findViewById(R.id.go_to_quiz_five);
        toQuizFiveButton.setVisibility(View.GONE);
        TextView quizFiveDisplay = (TextView) findViewById(R.id.quiz_five);
        quizFiveDisplay.setVisibility(View.VISIBLE);
        RadioGroup quizFiveOptionsDisplay = (RadioGroup) findViewById(R.id.quiz_five_options);
        quizFiveOptionsDisplay.setVisibility(View.VISIBLE);
    }

    public void solveQuizFive(View view) {
        TextView quizFiveDisplay = (TextView) findViewById(R.id.quiz_five);
        RadioGroup quizFiveOptions = (RadioGroup) findViewById(R.id.quiz_five_options);
        int answerForQuizFive = quizFiveOptions.getCheckedRadioButtonId();

        if (answerForQuizFive == R.id.quiz_five_option_a) {
            scoreCalculator(25);
            quizCounter();
            Toast.makeText(this, "Ma sha'a Allah! You're very correct! " + " No more question.", Toast.LENGTH_SHORT).show();
            quizFiveDisplay.setVisibility(View.GONE);
            quizFiveOptions.setVisibility(View.GONE);
            Button printReportCard = (Button) findViewById(R.id.report_card);
            printReportCard.setVisibility(View.VISIBLE);

        } else {
            scoreCalculator(0);
            Toast.makeText(this, "SubhaanAllah! You're wrong! " + " No more question.", Toast.LENGTH_SHORT).show();
            quizFiveDisplay.setVisibility(View.GONE);
            quizFiveOptions.setVisibility(View.GONE);
            Button printReportCard = (Button) findViewById(R.id.report_card);
            printReportCard.setVisibility(View.VISIBLE);
        }
    }


    public void reportCard(View view) {
        Button printReportCard = (Button) findViewById(R.id.report_card);
        printReportCard.setVisibility(View.GONE);

        TextView quizFiveDisplay = (TextView) findViewById(R.id.quiz_five);
        quizFiveDisplay.setVisibility(View.GONE);

        RadioGroup quizFiveOptions = (RadioGroup) findViewById(R.id.quiz_five_options);
        quizFiveOptions.setVisibility(View.GONE);

        TextView summaryReport = (TextView) findViewById(R.id.summary_report);
        summaryReport.setVisibility(View.VISIBLE);

        Button replay = (Button) findViewById(R.id.try_again);
        replay.setVisibility(View.VISIBLE);

        EditText retrievePlayerName = (EditText) findViewById(R.id.player_name_input);
        String playerName = retrievePlayerName.getText().toString();

        summaryReport.setText("Ahsant! Baaraka lLahu fiik, " + playerName + "." + "\nYour score is " + scorePoint + " out of "
                + totalPoint);
    }

    public void reset(View view) {
        LinearLayout hideStartBar = (LinearLayout) findViewById(R.id.start_bar);
        hideStartBar.setVisibility(View.VISIBLE);

        TextView summaryReport = (TextView) findViewById(R.id.summary_report);
        summaryReport.setVisibility(View.GONE);

        Button replay = (Button) findViewById(R.id.try_again);
        replay.setVisibility(View.GONE);
        scorePoint = 0;
        numberOfQuizLeft = 5;

        RadioGroup quizOneOptions = (RadioGroup) findViewById(R.id.quiz_one_options);
        quizOneOptions.clearCheck();

        RadioGroup quizTwoOptions = (RadioGroup) findViewById(R.id.quiz_two_options);
        quizTwoOptions.clearCheck();

        RadioGroup quizThreeOptions = (RadioGroup) findViewById(R.id.quiz_three_options);
        quizThreeOptions.clearCheck();

        RadioGroup quizFourOptions = (RadioGroup) findViewById(R.id.quiz_four_options);
        quizFourOptions.clearCheck();

        RadioGroup quizFiveOptions = (RadioGroup) findViewById(R.id.quiz_five_options);
        quizFiveOptions.clearCheck();
    }

    public int scoreCalculator(int latestScore) {
        scorePoint += latestScore;
        return scorePoint;
    }

    public int quizCounter() {
        numberOfQuizLeft -= 1;
        return numberOfQuizLeft;
    }
}
