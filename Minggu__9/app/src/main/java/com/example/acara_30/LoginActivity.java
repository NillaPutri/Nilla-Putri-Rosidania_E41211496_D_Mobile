package com.example.acara_30;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText mViewUser, mViewPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mViewUser = findViewById(R.id.et_emailSignin);
        mViewPassword = findViewById(R.id.et_passwordSignin);
        mViewPassword.setOnEditorActionListener((v, actionId, event)-> {
            if (actionId == EditorInfo.IME_ACTION_DONE || actionId == EditorInfo.IME_NULL) {
            razia();
            return true;
            }
            return false;
        });

        findViewById(R.id.button_signinSignin).setOnClickListener(view -> razia());
        findViewById(R.id.button_signupSignin).setOnClickListener(view -> startActivity(new Intent(getBaseContext(), RegisterActivity.class)));
    };

    @Override
    protected void onStart() {
        super.onStart();
        if (Preferences.getLoggedInStatus(getBaseContext())) {
            startActivity(new Intent(getBaseContext(), MainActivity.class));
            finish();
        }
    }

    private void razia(){
        mViewUser.setError(null);
        mViewPassword.setError(null);
        EditText fokus = null;
        boolean cancel = false;

        String user = mViewUser.getText().toString();
        String password = mViewPassword.getText().toString();

        if (user.isEmpty()) {
            mViewUser.setError("This field is required");
            fokus = mViewUser;
            cancel = true;
        } else if (!cekUser(user)) {
            mViewUser.setError("This Username is not found");
            fokus = mViewUser;
            cancel = true;
        }

        if (password.isEmpty()) {
            mViewPassword.setError("This field is required");
            fokus = mViewPassword;
            cancel = true;
        } else if (!cekPassword(password)) {
            mViewPassword.setError("This password is incorrect");
            fokus = mViewPassword;
            cancel = true;
        }

        if (cancel) fokus.requestFocus();
        else masuk();
    }

    private void masuk(){
        Preferences.setLoggedInUser(getBaseContext(), Preferences.getRegisteredUser(getBaseContext()));
        Preferences.setLoggedInStatus(getBaseContext(), true);
        startActivity(new Intent(getBaseContext(), MainActivity.class));
        finish();
    }
    private boolean cekPassword(String password) {
        return password.equals(Preferences.getRegisteredPass(getBaseContext()));
    }
    private boolean cekUser(String user) {
        return user.equals(Preferences.getRegisteredUser(getBaseContext()));
    }

}