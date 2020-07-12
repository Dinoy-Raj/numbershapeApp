package com.example.appnumbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    class Number{

        int number;

        public boolean isTriangular(){
            int x = 1;
            int triangularNumber = 1;

            while(number>triangularNumber){
                x++;

                triangularNumber= triangularNumber + x;

            }

            if(number==triangularNumber){

                return true;
            }
            else{
                return false;
            }


        }
        public boolean isSquare(){

            double squareroot = Math.sqrt(number);

            if(squareroot == Math.floor(squareroot)){

                return true;

            }else{

                return false;
            }


        }





    }



    public void testNumber(View View){

        String message;

        Log.i("Info","Button Pressed");

        EditText editText = (EditText) findViewById(R.id.editTextNumberSigned);



        Number myNumber = new Number();

        myNumber.number = Integer.parseInt(editText.getText().toString());

         message = editText.getText().toString() ;

        if( editText.getText().toString().isEmpty()){

            message="error enter something";
        }

        if(myNumber.isSquare() && myNumber.isTriangular()){
            message+="is square and triangular";
        }
        else if(myNumber.isSquare()){
            message+="square but not triangular";
        }else if(myNumber.isTriangular()){
            message+="triangular but not a square";
        }else{
            message+="neither triangular nor square";
        }


        Toast.makeText(this,message,Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}