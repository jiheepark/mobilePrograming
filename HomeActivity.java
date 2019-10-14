package org.androidtown.mobileproject;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class HomeActivity extends AppCompatActivity {
    int whereCheck = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final TextView resultText = (TextView) findViewById(R.id.resultText);

        final TextView firstN = (TextView) findViewById(R.id.fristN);
        final TextView secN = (TextView) findViewById(R.id.secN);
        final TextView cal = (TextView) findViewById(R.id.cal);

        Button number1 = (Button)findViewById(R.id.number1);
        Button number2 = (Button)findViewById(R.id.number2);
        Button number3 = (Button)findViewById(R.id.number3);
        Button number4 = (Button)findViewById(R.id.number4);
        Button number5 = (Button)findViewById(R.id.number5);
        Button number6 = (Button)findViewById(R.id.number6);
        Button number7 = (Button)findViewById(R.id.number7);
        Button number8 = (Button)findViewById(R.id.number8);
        Button number9 = (Button)findViewById(R.id.number9);

        Button plusButton = (Button)findViewById(R.id.plus);
        Button minusButton = (Button)findViewById(R.id.min);
        Button multiButton = (Button)findViewById(R.id.multi);
        Button divButton = (Button)findViewById(R.id.div);

        Button resultButton = (Button)findViewById(R.id.resultButton);


        number1.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){

                TextView firstN = (TextView) findViewById(R.id.fristN);
                TextView secN = (TextView) findViewById(R.id.secN);
                TextView cal = (TextView) findViewById(R.id.cal);

                if(whereCheck==1){
                    firstN.setText("1");
                }
                else if(whereCheck==2){

                    secN.setText("1");
                }
                else if(whereCheck==-1){
                    Toast.makeText(getApplicationContext(), "올바른 곳에 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "입력할 창을 선택해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });


        number2.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){

                TextView firstN = (TextView) findViewById(R.id.fristN);
                TextView secN = (TextView) findViewById(R.id.secN);
                TextView cal = (TextView) findViewById(R.id.cal);

                if(whereCheck==1){
                    firstN.setText("2");
                }
                else if(whereCheck==2){

                    secN.setText("2");
                }
                else if(whereCheck==-1){
                    Toast.makeText(getApplicationContext(), "올바른 곳에 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "입력할 창을 선택해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        number3.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){

                TextView firstN = (TextView) findViewById(R.id.fristN);
                TextView secN = (TextView) findViewById(R.id.secN);
                TextView cal = (TextView) findViewById(R.id.cal);

                if(whereCheck==1){
                    firstN.setText("3");
                }
                else if(whereCheck==2){

                    secN.setText("3");
                }
                else if(whereCheck==-1){
                    Toast.makeText(getApplicationContext(), "올바른 곳에 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "입력할 창을 선택해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        number4.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){

                TextView firstN = (TextView) findViewById(R.id.fristN);
                TextView secN = (TextView) findViewById(R.id.secN);
                TextView cal = (TextView) findViewById(R.id.cal);

                if(whereCheck==1){
                    firstN.setText("4");
                }
                else if(whereCheck==2){

                    secN.setText("4");
                }
                else if(whereCheck==-1){
                    Toast.makeText(getApplicationContext(), "올바른 곳에 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "입력할 창을 선택해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        number5.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){

                TextView firstN = (TextView) findViewById(R.id.fristN);
                TextView secN = (TextView) findViewById(R.id.secN);
                TextView cal = (TextView) findViewById(R.id.cal);

                if(whereCheck==1){
                    firstN.setText("5");
                }
                else if(whereCheck==2){

                    secN.setText("5");
                }
                else if(whereCheck==-1){
                    Toast.makeText(getApplicationContext(), "올바른 곳에 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "입력할 창을 선택해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        number6.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){

                TextView firstN = (TextView) findViewById(R.id.fristN);
                TextView secN = (TextView) findViewById(R.id.secN);
                TextView cal = (TextView) findViewById(R.id.cal);

                if(whereCheck==1){
                    firstN.setText("6");
                }
                else if(whereCheck==2){

                    secN.setText("6");
                }
                else if(whereCheck==-1){
                    Toast.makeText(getApplicationContext(), "올바른 곳에 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "입력할 창을 선택해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        number7.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){

                TextView firstN = (TextView) findViewById(R.id.fristN);
                TextView secN = (TextView) findViewById(R.id.secN);
                TextView cal = (TextView) findViewById(R.id.cal);

                if(whereCheck==1){
                    firstN.setText("7");
                }
                else if(whereCheck==2){

                    secN.setText("7");
                }
                else if(whereCheck==-1){
                    Toast.makeText(getApplicationContext(), "올바른 곳에 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "입력할 창을 선택해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        number8.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){

                TextView firstN = (TextView) findViewById(R.id.fristN);
                TextView secN = (TextView) findViewById(R.id.secN);
                TextView cal = (TextView) findViewById(R.id.cal);

                if(whereCheck==1){
                    firstN.setText("8");
                }
                else if(whereCheck==2){

                    secN.setText("8");
                }
                else if(whereCheck==-1){
                    Toast.makeText(getApplicationContext(), "올바른 곳에 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "입력할 창을 선택해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        number9.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){

                TextView firstN = (TextView) findViewById(R.id.fristN);
                TextView secN = (TextView) findViewById(R.id.secN);
                TextView cal = (TextView) findViewById(R.id.cal);

                if(whereCheck==1){
                    firstN.setText("9");
                }
                else if(whereCheck==2){

                    secN.setText("9");
                }
                else if(whereCheck==-1){
                    Toast.makeText(getApplicationContext(), "올바른 곳에 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "입력할 창을 선택해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        plusButton.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){

                TextView firstN = (TextView) findViewById(R.id.fristN);
                TextView secN = (TextView) findViewById(R.id.secN);
                TextView cal = (TextView) findViewById(R.id.cal);

                if(whereCheck==1 || whereCheck ==2){
                    Toast.makeText(getApplicationContext(), "올바른 곳에 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
                else if(whereCheck==-1){
                    cal.setText("+");
                }
                else{
                    Toast.makeText(getApplicationContext(), "입력할 창을 선택해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){

                TextView firstN = (TextView) findViewById(R.id.fristN);
                TextView secN = (TextView) findViewById(R.id.secN);
                TextView cal = (TextView) findViewById(R.id.cal);

                if(whereCheck==1 || whereCheck ==2){
                    Toast.makeText(getApplicationContext(), "올바른 곳에 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
                else if(whereCheck==-1){
                    cal.setText("-");
                }
                else{
                    Toast.makeText(getApplicationContext(), "입력할 창을 선택해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        multiButton.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){

                TextView firstN = (TextView) findViewById(R.id.fristN);
                TextView secN = (TextView) findViewById(R.id.secN);
                TextView cal = (TextView) findViewById(R.id.cal);

                if(whereCheck==1 || whereCheck ==2){
                    Toast.makeText(getApplicationContext(), "올바른 곳에 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
                else if(whereCheck==-1){
                    cal.setText("*");
                }
                else{
                    Toast.makeText(getApplicationContext(), "입력할 창을 선택해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        divButton.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){

                TextView firstN = (TextView) findViewById(R.id.fristN);
                TextView secN = (TextView) findViewById(R.id.secN);
                TextView cal = (TextView) findViewById(R.id.cal);

                if(whereCheck==1 || whereCheck ==2){
                    Toast.makeText(getApplicationContext(), "올바른 곳에 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
                else if(whereCheck==-1){
                    cal.setText("/");
                }
                else{
                    Toast.makeText(getApplicationContext(), "입력할 창을 선택해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        resultButton.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){
                TextView resultText = (TextView) findViewById(R.id.resultText);

                int result = 0;

                if(cal.getText().equals("+"))
                {
                    result = Integer.parseInt(firstN.getText()+"") + Integer.parseInt(secN.getText()+"");
                }
                else if(cal.getText().equals("-"))
                {
                    result = Integer.parseInt(firstN.getText()+"") - Integer.parseInt(secN.getText()+"");
                }else if(cal.getText().equals("*"))
                {
                    result = Integer.parseInt(firstN.getText()+"") * Integer.parseInt(secN.getText()+"");
                }
                else if(cal.getText().equals("/"))
                {
                    result = Integer.parseInt(firstN.getText()+"") / Integer.parseInt(secN.getText()+"");
                }
                else {
                    Toast.makeText(getApplicationContext(), "숫자를 다시한번 확인하세요!!", Toast.LENGTH_SHORT).show();
                }

                resultText.setText(Integer.toString(result));
            }
        });



        firstN.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView firstN = (TextView) findViewById(R.id.fristN);
                whereCheck = 1;
            }
        });

        secN.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){

                TextView secN = (TextView) findViewById(R.id.secN);
                whereCheck = 2;
//                secN.setBackgroundColor(Color.RED);
            }
        });
        cal.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){
                TextView cal = (TextView) findViewById(R.id.cal);
                whereCheck = -1;
//                cal.setBackgroundColor(Color.RED);
            }
        });

    }
}
