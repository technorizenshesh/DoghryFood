package com.doghryfood.Fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.doghryfood.Model.DiscoversModel;
import com.doghryfood.R;
import com.doghryfood.activities.PaymentMethod;
import com.doghryfood.adapters.DisvoverRecyclerViewAdapter;
import com.doghryfood.adapters.FoodTypesRecyclerViewAdapter;
import com.doghryfood.adapters.PapularRecyclerViewAdapter;

import java.util.ArrayList;

public class ProfileFragment extends Fragment{

    Context mContext;
    View view;

    RelativeLayout relative_profile;
    LinearLayout LL_payment_card;
    RelativeLayout RR_payment_method;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.profie_fragment, container, false);

        init();

        return view;

    }

    private void init() {
        relative_profile = view.findViewById(R.id.relative_profile);
        LL_payment_card = view.findViewById(R.id.LL_payment_card);
        RR_payment_method = view.findViewById(R.id.RR_payment_method);

        relative_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        LL_payment_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getActivity(), PaymentMethod.class);
                startActivity(intent);
            }
        });

        RR_payment_method.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getActivity(), PaymentMethod.class);
                startActivity(intent);
            }
        });
    }


}