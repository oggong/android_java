package com.study.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView number0;
    TextView number1;
    TextView number2;
    TextView number3;
    TextView number4;
    TextView number5;
    TextView number6;
    TextView number7;
    TextView number8;
    TextView number9;
    TextView plus;
    TextView minus;
    TextView equal;
    TextView result;

    Integer first = null;
    Integer second = null;
    String operator;

    String temp = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        setupListeners();

    }

    public void findViews() {
        number0 = findViewById(R.id.number0);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        number3 = findViewById(R.id.number3);
        number4 = findViewById(R.id.number4);
        number5 = findViewById(R.id.number5);
        number6 = findViewById(R.id.number6);
        number7 = findViewById(R.id.number7);
        number8 = findViewById(R.id.number8);
        number9 = findViewById(R.id.number9);

        plus = findViewById(R.id.number_plus);
        minus = findViewById(R.id.number_minus);
        equal = findViewById(R.id.number_equal);
        result = findViewById(R.id.number_result);

    }

    public void setupListeners() {
        number0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "0";
            }
        });
        number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "1";

            }
        });
        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "2";

            }
        });
        number3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "3";

            }
        });
        number4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "4";
            }
        });
        number5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "5";
            }
        });
        number6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "6";
            }
        });
        number7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "7";
            }
        });
        number8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "8";
            }
        });
        number9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "9";
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator == "+") {
                    return;
                }
                if (operator == "-") {
                    operator = "+";
                    return;
                }
                operator = "+";
                if (first != null) {
                    second = Integer.parseInt(temp);
                } else {
                    first = Integer.parseInt(temp);
                }
                temp = "";
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator == "-") {
                    return;
                }
                if (operator == "+") {
                    operator = "-";
                    return;
                }
                operator = "-";
                if (first != null) {
                    second = Integer.parseInt(temp);
                } else {
                    first = Integer.parseInt(temp);
                }
                temp = "";
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first != null) {
                    second = Integer.parseInt(temp);
                } else {
                    first = Integer.parseInt(temp);
                }
                result.setText(String.valueOf(calculate()));
            }
        });
    }

    public int calculate() {
        int result;
        if (operator == "+") {
            result = first + second;
        } else {
            result = first - second;
        }
        first = result;
        operator = "";
        return result;
    }
}
