package com.ngtkn.signinscreen;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    EditText sUsername;
    EditText sPassword;
    EditText sFullName;
    EditText sConfirm;

    TextInputLayout sUser;
    TextInputLayout sPass;
    TextInputLayout sFull;
    TextInputLayout sConf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        sUsername = findViewById(R.id.signup_username_text);
        sPassword = findViewById(R.id.signup_password_text);
        sFullName = findViewById(R.id.signup_fullname_text);
        sConfirm = findViewById(R.id.signup_confirm_pass_text);

        sUser = findViewById(R.id.signup_username);
        sPass = findViewById(R.id.signup_password);
        sFull = findViewById(R.id.signup_fullname);
        sConf = findViewById(R.id.signup_confirm_pass);
    }


    public void signUpClicked(View view) {

        if(TextUtils.isEmpty(sUsername.getText())){
            sUser.setError("Enter Username");
        }
        if(TextUtils.isEmpty(sPassword.getText())){
            sPass.setError("Enter Password");
        }
        if(TextUtils.isEmpty(sFullName.getText())){
            sFull.setError("Enter Full name");
        }
        if(TextUtils.isEmpty(sConfirm.getText())){
            sConf.setError("Enter password");
        }

        if(sPassword.getText()!=sConfirm.getText()){
            sPass.setError("Passwords do not match");
        }

    }

    public void cancelClicked(View view) {
        Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
