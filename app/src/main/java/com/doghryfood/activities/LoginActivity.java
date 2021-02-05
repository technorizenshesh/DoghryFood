package com.doghryfood.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.doghryfood.MainActivity;
import com.doghryfood.R;
import com.doghryfood.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    Context mContext = LoginActivity.this;
    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login);

        init();

    }

    private void init() {

        binding.tvForogtPassword.setOnClickListener(v -> {
            startActivity(new Intent(mContext,ForgotPassword.class));
        });

        binding.btLogin.setOnClickListener(v -> {
            startActivity(new Intent(mContext, MainActivity.class));
        });

        binding.tvSignUp.setOnClickListener(v -> {
            startActivity(new Intent(mContext,SignUpActivity.class));
        });

    }

}