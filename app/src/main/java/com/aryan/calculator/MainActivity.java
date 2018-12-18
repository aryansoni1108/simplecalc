package com.aryan.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText display;
    Button btx1,btx2,btx3, btx4,btx5,btx6,btx7,btx8,btx9,btx0,btxplus,btxminus,btxequals,btxC,btxDivide,btxMul,btxDot;




    float mValueOne, mValueTwo;
    boolean Addition, mSubtract, Multiplication, Division;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        display = (EditText) findViewById(R.id.display);
        btx0 = (Button) findViewById(R.id.zero_btx_btx);
        btx1 = (Button) findViewById(R.id.one_btx);
        btx2 = (Button) findViewById(R.id.two_btx);
        btx3 = (Button) findViewById(R.id.three_btx);
        btx4 = (Button) findViewById(R.id.four_btx);
        btx5 = (Button) findViewById(R.id.five_btx_btx);
        btx6 = (Button) findViewById(R.id.six_btx);
        btx7 = (Button) findViewById(R.id.seven_btx_btx);
        btx8 = (Button) findViewById(R.id.eight_btx_btx);
        btx9 = (Button) findViewById(R.id.nine_btx_btx);
        btxC = (Button) findViewById(R.id.btxC);
        btxDivide = (Button) findViewById(R.id.btxdivide);
        btxMul = (Button) findViewById(R.id.btxmultiply);
        btxplus = (Button) findViewById(R.id.plus_btx_btx);
        btxminus = (Button) findViewById(R.id.minus_btx);
        btxequals = (Button) findViewById(R.id.equal_btx);
        btxDot = (Button) findViewById(R.id.dot);

        //logging
        Log.e("abc", "onCreate: "+display.getText().toString().length() );


        btx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "1");
            }
        });

        btx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "2");
            }
        });

        btx3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "3");
            }
        });

        btx4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "4");
            }
        });

        btx5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "5");
            }
        });

        btx6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "6");
            }
        });

        btx7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "7");
            }
        });

        btx8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "8");
            }
        });

        btx9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "9");
            }
        });

        btx0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "0");
            }
        });

        btxplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("abc",""+display.getText().toString());

                if(display.getText().toString().length()!=0) {

                    mValueOne = Float.parseFloat(display.getText() + "");
                    Addition = true;
                    display.setText(null);
                }
            }
        });

        btxminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().toString().length()!=0) {
                    mValueOne = Float.parseFloat(display.getText() + "");
                    mSubtract = true;
                    display.setText(null);
                }
            }
        });

        btxMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().toString().length()==0) {
                    Toast.makeText(MainActivity.this, "Choose a number first", Toast.LENGTH_SHORT).show();
                }
                else {
                    mValueOne = Float.parseFloat(display.getText() + "");
                    Multiplication = true;
                    display.setText(null);
                }
            }
        });

        btxDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if(display.getText().toString().length()!=0) {
                    mValueOne = Float.parseFloat(display.getText() + "");


                    Division = true;
                    display.setText(null);
                }

            }
        });

        btxequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().length() != 0) {
                    mValueTwo = Float.parseFloat(display.getText() + "");

                    if (Addition == true) {
                        display.setText(mValueOne + mValueTwo + "");
                        Addition = false;
                    }

                    if (mSubtract == true) {
                        display.setText(mValueOne - mValueTwo + "");
                        mSubtract = false;
                    }

                    if (Multiplication == true) {
                        display.setText(mValueOne * mValueTwo + "");
                        Multiplication = false;
                    }

                    if (Division == true) {
                        display.setText(mValueOne / mValueTwo + "");
                        Division = false;
                    }
                }
            }
        });

        btxC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
            }
        });

        btxDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().length() != 0) {

                    display.setText(display.getText() + ".");
                }
            }
        });




    }

}
