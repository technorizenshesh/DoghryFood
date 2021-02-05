package com.doghryfood.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.doghryfood.R;
import com.doghryfood.databinding.ActivityWelcomeBinding;

public class WelcomeActivity extends AppCompatActivity {

    Context mContext = WelcomeActivity.this;
    ActivityWelcomeBinding binding;
    private MyViewPagerAdapter myViewPagerAdapter;
    int[] layouts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_welcome);

        init();

    }

    private void init() {

        binding.tvNext.setOnClickListener(v -> {
            startActivity(new Intent(mContext,LoginActivity.class));
        });

        binding.getStart.setOnClickListener(v -> {
            startActivity(new Intent(mContext,LoginActivity.class));
        });

        layouts = new int[] {
                R.layout.layout1,
                R.layout.layout2,
                R.layout.layout3,
        };

        // adding bottom dots
        addBottomDots(0);

        myViewPagerAdapter = new MyViewPagerAdapter();
        binding.viewPager.setAdapter(myViewPagerAdapter);
        binding.viewPager.addOnPageChangeListener(viewPagerPageChangeListener);

    }

    //  viewpager change listener
    ViewPager.OnPageChangeListener viewPagerPageChangeListener = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageSelected(int position) {
            if(position == 2) {
                addBottomDots(position);
                binding.layoutDots.setVisibility(View.GONE);
                binding.getStart.setVisibility(View.VISIBLE);
                binding.tvNext.setVisibility(View.GONE);
            } else {
                addBottomDots(position);
                binding.layoutDots.setVisibility(View.VISIBLE);
                binding.getStart.setVisibility(View.GONE);
                binding.tvNext.setVisibility(View.VISIBLE);
            }

        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {

        }

        @Override
        public void onPageScrollStateChanged(int arg0) {

        }

    };

    private void addBottomDots(int currentPage) {

        binding.layoutDots.removeAllViews();

        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(30,30);

        for (int i = 0; i < layouts.length; i++) {

            ImageView imageView = new ImageView(mContext);
            imageView.setLayoutParams(params);
            imageView.setPadding(5,5,5,5);

            if(currentPage == i) {
                imageView.setImageResource(R.drawable.oval_orange);
            } else {
                imageView.setImageResource(R.drawable.oval_gray);
            }

            binding.layoutDots.addView(imageView);

        }

    }

    /**
     * View pager adapter
     */
    public class MyViewPagerAdapter extends PagerAdapter {

        private LayoutInflater layoutInflater;

        public MyViewPagerAdapter() {

        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View view = layoutInflater.inflate(layouts[position], container, false);
            container.addView(view);

            return view;
        }

        @Override
        public int getCount() {
            return layouts.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }


        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            View view = (View) object;
            container.removeView(view);
        }

    }


}