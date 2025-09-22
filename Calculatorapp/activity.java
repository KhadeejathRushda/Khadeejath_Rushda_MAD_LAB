package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonzero, buttonone, buttontwo, buttonthree, buttonfour, buttonfive, buttonsix, buttonseven, buttoneight, buttonnine, buttonpoint, buttonplus, buttonminus, buttonmultiplication, buttondivision, buttonequals, buttonclear;
    EditText edit;
    float mvalueone, mvaluetwo;
    boolean plus, minus, multiplication, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonzero = findViewById(R.id.zero);
        buttonone = findViewById(R.id.one);
        buttontwo = findViewById(R.id.two);
        buttonthree = findViewById(R.id.three);
        buttonfour = findViewById(R.id.four);
        buttonfive = findViewById(R.id.five);
        buttonsix = findViewById(R.id.six);
        buttonseven = findViewById(R.id.seven);
        buttoneight = findViewById(R.id.eight);
        buttonnine = findViewById(R.id.nine);
        buttonclear = findViewById(R.id.clear);
        buttonpoint = findViewById(R.id.point);
        buttonplus = findViewById(R.id.plus);
        buttonminus = findViewById(R.id.minus);
        buttonmultiplication = findViewById(R.id.multiplication);
        buttondivision = findViewById(R.id.division);
        buttonequals = findViewById(R.id.equals);
        edit = findViewById(R.id.edit);
        buttonone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText() + "1");
            }
        });
        buttontwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText() + "2");
            }
        });
        buttonthree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit.setText(edit.getText() + "3");
            }
        });
        buttonfour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit.setText(edit.getText() + "4");
            }
        });
        buttonfive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit.setText(edit.getText() + "5");
            }
        });
        buttonsix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit.setText(edit.getText() + "6");
            }
        });
        buttonseven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit.setText(edit.getText() + "7");
            }
        });
        buttoneight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit.setText(edit.getText() + "8");
            }
        });
        buttonnine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit.setText(edit.getText() + "9");
            }
        });
        buttonzero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit.setText(edit.getText() + "0");
            }
        });
        buttonpoint.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit.setText(edit.getText() + ".");
            }
        });
        buttonclear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit.setText("");
            }
        });
        buttonplus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (edit == null) {
                    edit.setText("");
                } else {
                    mvalueone = Float.parseFloat((edit.getText() + " "));
                    plus = true;
                    edit.setText(null);
                }
            }
        });
        buttonminus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (edit == null) {
                    edit.setText("");
                } else {
                    mvalueone = Float.parseFloat((edit.getText() + " "));
                    minus = true;
                    edit.setText(null);
                }
            }
        });
        buttonmultiplication.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (edit == null) {
                    edit.setText("");
                } else {
                    mvalueone = Float.parseFloat((edit.getText() + " "));
                    multiplication = true;
                    edit.setText(null);
                }
            }
        });
        buttondivision.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (edit == null) {
                    edit.setText("");
                } else {
                    mvalueone = Float.parseFloat((edit.getText() + " "));
                    division = true;
                    edit.setText(null);
                }
            }
        });
        buttonequals.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mvaluetwo = Float.parseFloat((edit.getText() + " "));
                if (plus == true) {
                    edit.setText(mvalueone + mvaluetwo + "");
                    plus = false;
                }
                if (minus == true) {
                    edit.setText(mvalueone - mvaluetwo + "");
                    minus = false;
                }
                if (multiplication == true) {
                    edit.setText(mvalueone * mvaluetwo + "");
                    multiplication = false;
                }
                if (division == true) {
                    edit.setText(mvalueone / mvaluetwo + "");
                    division = false;
                }
            }
        });
    }
}
