package com.doghryfood.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.doghryfood.R;
import com.doghryfood.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    Context mContext = SignUpActivity.this;
    ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_sign_up);

        init();

    }

    private void init() {

        binding.btSignup.setOnClickListener(v -> {
            startActivity(new Intent(mContext,MobileActivity.class));
        });

        binding.tvLogin.setOnClickListener(v -> {
            startActivity(new Intent(mContext,LoginActivity.class));
        });

    }


}