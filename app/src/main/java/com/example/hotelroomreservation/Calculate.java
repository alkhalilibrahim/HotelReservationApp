package com.example.hotelroomreservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculate extends AppCompatActivity {
    private static String day;
    Button clear, payment;
    EditText days;
    TextView result, tv2;
   // String day;
   int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        clear= (Button) findViewById(R.id.clear);
        payment= (Button) findViewById(R.id.payment);
        days= (EditText) findViewById(R.id.days);
        result= (TextView) findViewById(R.id.result);
        tv2= (TextView) findViewById(R.id.tv2);
        tv2.setText(" ");

    clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv2.setText("");
                result.setText("");
                days.setText("");
                Toast.makeText(Calculate.this, "Data is clear", Toast.LENGTH_SHORT).show();
            }
        });

        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validateInput()){
                        n= Integer.parseInt(day);
                        int cal= n * 20;
                        String s= String.valueOf(cal);
                        tv2.setText("Cost for single day is: 20 OMR");
                        result.setText("Calculated cost for stay is:" +s+"  OMR");
                }
            }
        });
    }

    private Boolean validateInput(){
        boolean result= false;
        day= days.getText().toString();

        if(day.isEmpty()){
            Toast.makeText(this, "Enter no. of days to stay", Toast.LENGTH_SHORT).show();
        }else {
            result= true;
        }
        return result;
    }


    @Override
    public void onBackPressed() {
        //Display alert message when back button has been pressed
        startActivity(new Intent(Calculate.this, Options.class));
        finish();
    }
}