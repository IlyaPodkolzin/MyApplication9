package com.example.myapplication9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText t1, t2;
    public TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Action (View v){
        t1 = findViewById(R.id.text1);
        t2 = findViewById(R.id.text2);
        ans = findViewById(R.id.answer);

        String s1 = t1.getText().toString();
        String s2 = t2.getText().toString();

        String abc [] = {s1, s2};

        boolean flag = true;
        for (String i: abc) {
            try {
                double check = Double.parseDouble(i);
            }
            catch (NumberFormatException nfe) {
                flag = false;
            }
        }

        if (flag) {
            double n1 = Double.parseDouble(s1);
            double n2 = Double.parseDouble(s2);
            double res;

            switch (v.getId()) {
                case (R.id.plus):
                    res = n1 + n2;
                    break;
                case (R.id.minus):
                    res = n1 - n2;
                    break;
                case (R.id.multiple):
                    res = n1 * n2;
                    break;
                case (R.id.divide):
                    res = n1 / n2;
                    break;
                default:
                    res = 0;
            }

            ans.setText((int) res);
        }
    }
}