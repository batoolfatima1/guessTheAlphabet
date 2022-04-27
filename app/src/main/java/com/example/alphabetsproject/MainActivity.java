package com.example.alphabetsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView alphabet;
    char letter;
    TextView result;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alphabet = findViewById(R.id.randomletter);
        result = findViewById(R.id.result);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.generatebutton);

        String abc= "abcdefghijklmnopqrstuvwxyz";
        Random rd = new Random();
        letter = abc.charAt(rd.nextInt(abc.length()));
        String s=Character.toString(letter);
        alphabet.setText(s);

    }
    char[] grass = {'a','c','e','i','m','n','o','r','s','u','v','w','x','z'};
    char[] root = {'g','j','p','q','y'};
    char[] sky = {'b','d','f','h','k','l','t'};
    public void Generate(View v)
    {
        String abc= "abcdefghijklmnopqrstuvwxyz";
        Random rd = new Random();
        letter = abc.charAt(rd.nextInt(abc.length()));
        String s=Character.toString(letter);
        alphabet.setText(s);
        result.setText("");


        btn1.setClickable(true);
        btn2.setClickable(true);
        btn3.setClickable(true);
    }
    public void GrassButton(View v)
    {
        String check  = alphabet.getText().toString();
        char c = check.charAt(0);
        Boolean contains = false;
        for(int i =0; i<grass.length ; i++)
        {
            if(grass[i] == c)
            {
                contains = true;
            }
        }
        if (contains == true) {
            result.setText("CORRECT");
        }
        else {
            result.setText("INCORRECT");
        }
        btn1.setClickable(false);
        btn2.setClickable(false);
        btn3.setClickable(false);
    }
    public void SkyButton(View v)
    {
        String check  = alphabet.getText().toString();
        char c = check.charAt(0);
        Boolean contains = false;
        for(int i =0; i<sky.length ; i++)
        {
            if(sky[i] == c)
            {
                contains = true;
            }

        }
        if (contains == true) {
            result.setText("CORRECT");
        }
        else {
            result.setText("INCORRECT");
        }
        btn1.setClickable(false);
        btn2.setClickable(false);
        btn3.setClickable(false);
    }
    public void RootButton(View v)
    {
        String check  = alphabet.getText().toString();
        char c = check.charAt(0);
        Boolean contains = false;
        for(int i =0; i<root.length ; i++)
        {
            if(root[i] == c)
            {
                contains = true;
            }

        }
        if (contains == true) {
            result.setText("CORRECT");
        }
        else {
            result.setText("INCORRECT");
        }
        btn1.setClickable(false);
        btn2.setClickable(false);
        btn3.setClickable(false);
    }

}