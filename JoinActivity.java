package org.androidtown.mobileproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JoinActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
        final EditText editID = (EditText) findViewById(R.id.editID);
        final EditText editPassword = (EditText) findViewById(R.id.editPassword);
        final EditText editName = (EditText) findViewById(R.id.editName);
        final EditText editCallNumber = (EditText) findViewById(R.id.editCallNumber);
        final EditText editAddress= (EditText) findViewById(R.id.editAddress);

        boolean idcheck = false;
        final RadioButton radioButton1 = (RadioButton) findViewById(R.id.radioButton);
        final CheckBox idCheckBox = (CheckBox) findViewById(R.id.idCheckBox);
        final CheckBox passwordCheckBox = (CheckBox) findViewById(R.id.pwCheckBox);

        Button idCheckButton = (Button)findViewById(R.id.checkID);
        idCheckButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try{
                    BufferedReader br = new BufferedReader(new FileReader(getFilesDir()+(editID.getText()+".txt")));
                    Toast.makeText(getApplicationContext(), editID.getText()+"는 이미 있는 아이디입니다.", Toast.LENGTH_SHORT).show();
                    idCheckBox.setChecked(false);
                }catch (FileNotFoundException e){
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "아이디를 사용가능합니다.", Toast.LENGTH_SHORT).show();
                    idCheckBox.setChecked(true);
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });

        editPassword.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // 입력되는 텍스트에 변화가 있을 때
                String password = editPassword.getText()+"";
                //비밀번호 유효성 검사식1 : 숫자와 특수문자가 포함되어야 한다.
                String val_symbol = "([0-9].*[!,@,#,^,&,*,(,)])|([!,@,#,^,&,*,(,)].*[0-9])";
                // 비밀번호 유효성 검사식2 : 영문자 대소문자가 적어도 하나씩은 포함되어야 한다.
                String val_alpha = "([a-z].*[A-Z])|([A-Z].*[a-z])";
                // 정규표현식 컴파일
                Pattern pattern_symbol = Pattern.compile(val_symbol);
                Pattern pattern_alpha = Pattern.compile(val_alpha);

                Matcher matcher_symbol = pattern_symbol.matcher(password);
                Matcher matcher_alpha = pattern_alpha.matcher(password);

                if (matcher_symbol.find() && matcher_alpha.find() && password.length()>=8) {
                    // email과 password로 회원가입 진행
                    passwordCheckBox.setChecked(true);
                }else {
                    passwordCheckBox.setChecked(false);
                }
            }
            @Override
            public void afterTextChanged(Editable arg0) {
                // 입력이 끝났을 때
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // 입력하기 전에
            }
        });


        Button writeButton = (Button)findViewById(R.id.joinButton);
        writeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               if(!idCheckBox.isChecked()){
                    Toast.makeText(getApplicationContext(), "아이디 중복검사를 해주세요.", Toast.LENGTH_SHORT).show();
                }
                if(!passwordCheckBox.isChecked()){
                    Toast.makeText(getApplicationContext(), "비밀번호 조건을 확인해주세요.", Toast.LENGTH_SHORT).show();
                }
                else if(editID.getText().length()==0 || editPassword.getText().length()==0 || editCallNumber.getText().length()==0 ||
                        editName.getText().length()==0 || editAddress.getText().length()==0){
                    Toast.makeText(getApplicationContext(), "모든 정보를 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
               else if(!radioButton1.isChecked()){
                    Toast.makeText(getApplicationContext(), "개인정보약관에 동의해주세요.", Toast.LENGTH_SHORT).show();
                }
                else {
                    try {
                        String idText = editID.getText() + ".txt";
                        BufferedWriter bw = new BufferedWriter(new FileWriter(getFilesDir() + idText, false));
                        bw.write(editPassword.getText() + "");
                        bw.close();
                        Toast.makeText(getApplicationContext(), editID.getText() + "님 환영합니다.", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    } catch (Exception e) {
                        e.printStackTrace();
                        Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }

            }

        });


        Button joinText =(Button) findViewById(R.id.beforeButton);

        joinText.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try{
                    BufferedReader br = new BufferedReader(new FileReader(getFilesDir()+(editID.getText()+".txt")));
                    String readStr = "";
                    String str = null;
                    while(((str = br.readLine()) != null)){
                        readStr += str +"\n";
                    }
                    br.close();

                    Toast.makeText(getApplicationContext(), readStr.substring(0, readStr.length()-1), Toast.LENGTH_SHORT).show();

                }catch (FileNotFoundException e){
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "File not Found", Toast.LENGTH_SHORT).show();
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });


    }
}
