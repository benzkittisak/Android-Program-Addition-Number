package com.bbgun.programadditionnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText num1 ;
    private EditText num2 ;

    private Button btnCal ;

    private TextView resultSum;

    private TextView minValue;
    private TextView maxValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.editNum1);
        num2 = (EditText) findViewById(R.id.editNum2);

        btnCal = (Button) findViewById(R.id.btnCal);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text1 = num1.getText().toString();
                String text2 = num2.getText().toString();



                if(text1.matches("")){
                    Toast.makeText(MainActivity.this , "Number 1 is Empty" , Toast.LENGTH_LONG).show();
                    return;
                }

                if(text2.matches("")){
                    Toast.makeText(MainActivity.this , "Number 2 is Empty" , Toast.LENGTH_LONG).show();
                    return;
                }

                int number1 = Integer.parseInt(text1);
                int number2 = Integer.parseInt(text2);

                resultSumCal(number1 , number2);
                calMinNumber(number1 , number2);
                calMaxNumber(number1 , number2);

            }
        });
    }

    private void resultSumCal(int number1 , int number2){
        resultSum = (TextView) findViewById(R.id.resultSum);

        resultSum.append(Integer.toString(number1 + number2));
    }

    private void  calMinNumber(int number1 , int number2){
        minValue = (TextView) findViewById(R.id.minValue);

        int min = Math.min(number1 , number2) ;


        minValue.append(Integer.toString(min));
    }

    private void  calMaxNumber(int number1 , int number2){
        maxValue = (TextView) findViewById(R.id.maxValue);

        int max = Math.max(number1 , number2) ;

        maxValue.append(Integer.toString(max));
    }
}