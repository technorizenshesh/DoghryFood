package com.doghryfood.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import com.doghryfood.R;
import com.doghryfood.databinding.ActivityVerifyMobileBinding;

public class VerifyMobileActivity extends AppCompatActivity {

    Context mContext = VerifyMobileActivity.this;
    ActivityVerifyMobileBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_verify_mobile);

        init();

    }

    private void init() {

        binding.ivBack.setOnClickListener(v -> {
            finish();
        });


        binding.et1.setBackgroundResource(R.drawable.oval_orange);
        binding.et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s != null && s.length() != 0) {
                    binding.et2.requestFocus();
                    binding.et2.setBackgroundResource(R.drawable.oval_orange);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.et2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s != null && s.length() != 0) {
                    binding.et3.requestFocus();
                    binding.et3.setBackgroundResource(R.drawable.oval_orange);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.et3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s != null && s.length() != 0) {
                    binding.et4.requestFocus();
                    binding.et4.setBackgroundResource(R.drawable.oval_orange);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.btConfirm.setOnClickListener(v -> {
            startActivity(new Intent(mContext,LoginActivity.class));
        });

    }

}