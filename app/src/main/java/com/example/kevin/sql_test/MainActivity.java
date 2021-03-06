package com.example.kevin.sql_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText UsernameEt, PasswordEt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UsernameEt = (EditText)findViewById(R.id.username);
        PasswordEt = (EditText)findViewById(R.id.password);
    }


    public void onClickLogin(View view){
        String username = UsernameEt.getText().toString();
        String password = PasswordEt.getText().toString();
        String type = "login";

        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(type, username, password);

    }

}
