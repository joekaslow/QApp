package example.com.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public QuestionLibrary mQuestionLibrary = new QuestionLibrary();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonPick1;
    private Button mButtonPick2;
    private Button mButtonPick3;
    private Button mButtonPick4;

    private String mAnswer;
    private int mScore=0;
    private int mQuestionNumber=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonPick1 = (Button) findViewById(R.id.pick1);
        mButtonPick2 = (Button) findViewById(R.id.pick2);
        mButtonPick3 = (Button) findViewById(R.id.pick3);
        mButtonPick4 = (Button) findViewById(R.id.pick4);
        updateQuestion();

        // Start A Button Listener for Button1
        mButtonPick1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                // The Logic is
                if (mButtonPick1.getText()== mAnswer)
                {
                    mScore=mScore+1;
                    updateScore(mScore);
                    updateQuestion();
                Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                updateQuestion();
            }
        }
        // End A Button Listener for Button1


    });
        // Start A Button Listener for Button2
        mButtonPick2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                // The Logic is
                if (mButtonPick2.getText()== mAnswer)
                {
                    mScore=mScore+1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
            // End A Button Listener for Button2


        });
        // Start A Button Listener for Button3
        mButtonPick3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                // The Logic is
                if (mButtonPick3.getText()== mAnswer)
                {
                    mScore=mScore+1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
            // End A Button Listener for Button3


        });
        // Start A Button Listener for Button4
        mButtonPick4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                // The Logic is
                if (mButtonPick4.getText()== mAnswer)
                {
                    mScore=mScore+1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
            // End A Button Listener for Button4


        });


    }

     private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonPick1.setText(mQuestionLibrary.getPick1(mQuestionNumber));
        mButtonPick2.setText(mQuestionLibrary.getPick2(mQuestionNumber));
        mButtonPick3.setText(mQuestionLibrary.getPick3(mQuestionNumber));
        mButtonPick4.setText(mQuestionLibrary.getPick4(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswers(mQuestionNumber);
        mQuestionNumber++;
    }
    private void updateScore (int point){
        mScoreView.setText("" + mScore);
    }
}
