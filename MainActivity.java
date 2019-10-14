package org.androidtown.mobileproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView joinText =(TextView) findViewById(R.id.joinText);
        Button loginButton =(Button) findViewById(R.id.loginButton);

        final EditText inputID= findViewById(R.id.inputID);
        final EditText inputPW= findViewById(R.id.inputPW);

        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){
                try{
                    BufferedReader br = new BufferedReader(new FileReader(getFilesDir()+(inputID.getText()+".txt")));
                    String readStr = "";
                    String str = null;
                    while(((str = br.readLine()) != null)){
                        readStr += str +"\n";
                    }
                    br.close();

                    if(readStr.substring(0, readStr.length()-1).equals(inputPW.getText()+"")){
                        Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "비밀번호가 틀렸습니다.", Toast.LENGTH_SHORT).show();
                    }
                }catch (FileNotFoundException e){
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "아이디를 찾을 수 없습니다.", Toast.LENGTH_SHORT).show();
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });


        joinText.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), JoinActivity.class);
                startActivity(intent);
            }

        });
    }
}
