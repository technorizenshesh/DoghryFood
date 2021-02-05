package com.doghryfood.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.doghryfood.Fragment.HomeFragment;
import com.doghryfood.Model.DiscoversModel;
import com.doghryfood.R;
import com.doghryfood.adapters.CardRecyclerViewAdapter;
import com.doghryfood.adapters.FoodTypesRecyclerViewAdapter;

import java.util.ArrayList;

public class PaymentMethod extends AppCompatActivity {

    RecyclerView recycler_card;
    private ArrayList<DiscoversModel> modelArrayList_FoodTypes = new ArrayList<>();
    private CardRecyclerViewAdapter mAdapterFood;
    ImageView img_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method);

        recycler_card =findViewById(R.id.recycler_card);
        img_back =findViewById(R.id.img_back);
        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        setAdapterPayment();
    }

    private void setAdapterPayment() {

        this.modelArrayList_FoodTypes.add(new DiscoversModel("Offer",R.drawable.rest_img));
        this.modelArrayList_FoodTypes.add(new DiscoversModel("Burgers",R.drawable.rest_img));
        this.modelArrayList_FoodTypes.add(new DiscoversModel("Asian",R.drawable.rest_img));
        this.modelArrayList_FoodTypes.add(new DiscoversModel("Pizza",R.drawable.rest_img));
        this.modelArrayList_FoodTypes.add(new DiscoversModel("Ice Cream",R.drawable.rest_img));

        mAdapterFood = new CardRecyclerViewAdapter(PaymentMethod.this,modelArrayList_FoodTypes);
        recycler_card.setHasFixedSize(true);
        // use a linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(PaymentMethod.this, LinearLayoutManager.HORIZONTAL, true);
        layoutManager.setReverseLayout(true);
        recycler_card.setLayoutManager(layoutManager);
        recycler_card.setAdapter(mAdapterFood);

        mAdapterFood.SetOnItemClickListener(new CardRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position, DiscoversModel model) {


            }
        });
    }
}