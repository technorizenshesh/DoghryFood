package com.doghryfood.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;

import com.doghryfood.R;
import com.doghryfood.databinding.ActivityForgotPasswordBinding;
import com.doghryfood.databinding.ActivityLoginBinding;

public class ForgotPassword extends AppCompatActivity {

    Context mContext = ForgotPassword.this;
    ActivityForgotPasswordBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this,R.layout.activity_forgot_password);

        init();

    }

    private void init() {

        binding.btSubmit.setOnClickListener(v -> {
            finish();
        });

        binding.ivBack.setOnClickListener(v -> {
            finish();
        });

    }


}