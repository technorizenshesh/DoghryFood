package com.doghryfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;

import com.doghryfood.Fragment.FavFragment;
import com.doghryfood.Fragment.HomeFragment;
import com.doghryfood.Fragment.NearByFragment;
import com.doghryfood.Fragment.ProfileFragment;
import com.doghryfood.activities.ForgotPassword;
import com.doghryfood.activities.SignUpActivity;
import com.doghryfood.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        init();

        fragment = new HomeFragment();
        loadFragment(fragment);
    }

    private void init() {

        binding.RRHome.setOnClickListener(v -> {

            fragment = new HomeFragment();
            loadFragment(fragment);

        });

        binding.RRListing.setOnClickListener(v -> {

            fragment = new HomeFragment();
            loadFragment(fragment);

        });

        binding.RRFav.setOnClickListener(v -> {
            fragment = new FavFragment();
            loadFragment(fragment);
        });

        binding.RRLocation.setOnClickListener(v -> {

            fragment = new NearByFragment();
            loadFragment(fragment);
        });

        binding.RRProfile.setOnClickListener(v -> {


            fragment = new ProfileFragment();
            loadFragment(fragment);

        });



    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer, fragment).commit();
    }

}