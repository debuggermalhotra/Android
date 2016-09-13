package com.android.chetan.andro_calculator;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Creating reference of buttons and EditText(the space where numbers will beoperated

     Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, button_add, button_sub, button_mul, button_div, button10, buttonC, button_equal;

    EditText edt1;


    float mValueOne, mValueTwo;

    boolean mAddition,mSubtract,mMultiplication,mDivison;

//overriding the method onCreate()

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button_add = (Button) findViewById(R.id.button_add);
        button_sub = (Button) findViewById(R.id.button_sub);
        button_mul = (Button) findViewById(R.id.button_mul);
        button_div = (Button) findViewById(R.id.button_div);
        buttonC = (Button) findViewById(R.id.buttonC);
        button_equal = (Button) findViewById(R.id.button_equal);
        edt1 = (EditText) findViewById(R.id.edt1);


            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edt1.setText(edt1.getText()+"1");
                }
            });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                edt1.setText(edt1.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                edt1.setText(edt1.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                edt1.setText(edt1.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                edt1.setText(edt1.getText()+"5");

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                edt1.setText(edt1.getText()+"6");

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                edt1.setText(edt1.getText()+"7");

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                edt1.setText(edt1.getText()+"8");

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                edt1.setText(edt1.getText()+"9");

            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                edt1.setText(edt1.getText()+"0");

            }
        });

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(edt1==null) {
                    edt1.setText("");
                }
                else{
                    mValueOne=Float.parseFloat(edt1.getText()+"");
                    mAddition=true;
                    edt1.setText(null);
                }

            }
        });

        button_sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(edt1==null){
                    edt1.setText(null);
                }
                else
                {
                    mValueOne=Float.parseFloat(edt1.getText()+"");
                    mSubtract=true;
                    edt1.setText(null);
                }
            }
        });

        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt1.getText() + "");
                mMultiplication = true ;
                edt1.setText(null);
            }
        });
        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt1.getText()+"");
                mDivison = true ;
                edt1.setText(null);
            }
        });
        button_equal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mValueTwo=Float.parseFloat(edt1.getText()+"");

                if (mAddition==true){
                    edt1.setText(mValueOne+mValueTwo+"");
                    mAddition=false;
                }
                if(mSubtract==true){
                    edt1.setText(mValueOne-mValueTwo+"");
                    mSubtract=false;
                }
                if(mMultiplication==true){
                    edt1.setText(mValueOne*mValueTwo+"");
                    mMultiplication=false;
                }
                if(mDivison==true) {
                    edt1.setText(mValueOne/mValueTwo+"");
                    mDivison=false;
                }
            }


        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                edt1.setText("");
            }

        });
        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edt1.setText(edt1.getText()+".");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+".");
            }
        });
    }

}
