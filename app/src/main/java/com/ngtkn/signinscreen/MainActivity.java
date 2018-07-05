package com.ngtkn.signinscreen;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText user;
    EditText pass;
    TextInputLayout username;
    TextInputLayout password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.user_text);
        pass = findViewById(R.id.pass_text);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);


    }

    public void signIn(View view){
        if(TextUtils.isEmpty(user.getText())){
            username.setError("Enter a user name");
        }

        if(TextUtils.isEmpty(pass.getText())){
            password.setError("Enter your password");
        }
    }

    public void signUp(View view){
        Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
        startActivity(intent);
    }
}
