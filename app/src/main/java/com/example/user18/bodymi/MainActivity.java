package com.example.user18.bodymi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   private EditText heigth;
   private RadioButton first;
   private RadioButton second;
   private RadioButton third;
   private RadioButton forth;
    private RadioButton fifth;
private double dblHeight,dblWeight,bmi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heigth = (EditText) findViewById(R.id.height);
        first = (RadioButton) findViewById(R.id.first);
        second = (RadioButton) findViewById(R.id.second);
        third = (RadioButton) findViewById(R.id.third);
        forth = (RadioButton) findViewById(R.id.fourth);
        fifth = (RadioButton) findViewById(R.id.fifth);

    }

    public void OnClick(View view)
    {
        dblHeight = Double.parseDouble(heigth.getText().toString());


        if(first.isChecked()){
            dblWeight =50;
        }
        else if(second.isChecked()){
            dblWeight =65;
        }
        else if(third.isChecked()){
            dblWeight =75;
        }
        else if(forth.isChecked()){
            dblWeight =85;
        }
        else if(fifth.isChecked()){
            dblWeight =100;
        }
        bmi = calcBMI(dblHeight,dblWeight);

        Toast.makeText(MainActivity.this,"Your BMI is "+ bmi,Toast.LENGTH_LONG).show();
    }



    public double calcBMI(double height, double weight){
        double BMI;

         BMI = weight / (height * height);

        return BMI;
    }

}
