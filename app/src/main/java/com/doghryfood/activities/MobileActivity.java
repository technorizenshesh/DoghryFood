package com.doghryfood.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.doghryfood.R;
import com.doghryfood.databinding.ActivityMobileBinding;
import com.doghryfood.databinding.ActivitySignUpBinding;

public class MobileActivity extends AppCompatActivity {

    Context mContext = MobileActivity.this;
    ActivityMobileBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_mobile);

        init();

    }

    private void init() {

        binding.ivBack.setOnClickListener(v -> {
            finish();
        });

        binding.btConfirm.setOnClickListener(v -> {
            startActivity(new Intent(mContext,VerifyMobileActivity.class));
        });

        binding.txtAnother.setOnClickListener(v -> {
            startActivity(new Intent(mContext,VerifyMobileActivity.class));
        });


    }

}