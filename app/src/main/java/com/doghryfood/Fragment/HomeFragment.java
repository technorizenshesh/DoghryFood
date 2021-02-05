package com.doghryfood.Fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.doghryfood.Model.DiscoversModel;
import com.doghryfood.R;
import com.doghryfood.adapters.DisvoverRecyclerViewAdapter;
import com.doghryfood.adapters.FoodTypesRecyclerViewAdapter;
import com.doghryfood.adapters.PapularRecyclerViewAdapter;

import java.util.ArrayList;

public class HomeFragment extends Fragment{

    Context mContext;
    RecyclerView recycler_discover;
    RecyclerView recycler_food_types;
    RecyclerView recycler_papular;
    View view;
    DisvoverRecyclerViewAdapter mAdapter;
    FoodTypesRecyclerViewAdapter mAdapterFood;
    PapularRecyclerViewAdapter mAdapterPapular;
    private ArrayList<DiscoversModel> modelArrayList_discover = new ArrayList<>();
    private ArrayList<DiscoversModel> modelArrayList_FoodTypes = new ArrayList<>();
    private ArrayList<DiscoversModel> modelArrayList_papular = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_home, container, false);

        init();

        setAdapter();
        setAdapterFoodTypes();
        setAdapterPapular();
        return view;

    }

    private void init() {

        recycler_discover =view.findViewById(R.id.recycler_discover);
        recycler_food_types =view.findViewById(R.id.recycler_food_types);
        recycler_papular =view.findViewById(R.id.recycler_papular);
    }

    private void setAdapter() {

       this.modelArrayList_discover.add(new DiscoversModel("John Smith",R.drawable.rest_img));
       this.modelArrayList_discover.add(new DiscoversModel("John Smith",R.drawable.rest_img_two));
       this.modelArrayList_discover.add(new DiscoversModel("John Smith",R.drawable.img_rest));
       this.modelArrayList_discover.add(new DiscoversModel("John Smith",R.drawable.img_three));
       this.modelArrayList_discover.add(new DiscoversModel("John Smith",R.drawable.rest_img));

        mAdapter = new DisvoverRecyclerViewAdapter(getActivity(),modelArrayList_discover,HomeFragment.this);
        recycler_discover.setHasFixedSize(true);
        // use a linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, true);
        layoutManager.setReverseLayout(true);
        recycler_discover.setLayoutManager(layoutManager);
        recycler_discover.setAdapter(mAdapter);

        mAdapter.SetOnItemClickListener(new DisvoverRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position, DiscoversModel model) {


            }
        });
    }

    private void setAdapterFoodTypes() {

       this.modelArrayList_FoodTypes.add(new DiscoversModel("Offer",R.drawable.rest_img));
       this.modelArrayList_FoodTypes.add(new DiscoversModel("Burgers",R.drawable.rest_img));
       this.modelArrayList_FoodTypes.add(new DiscoversModel("Asian",R.drawable.rest_img));
       this.modelArrayList_FoodTypes.add(new DiscoversModel("Pizza",R.drawable.rest_img));
       this.modelArrayList_FoodTypes.add(new DiscoversModel("Ice Cream",R.drawable.rest_img));

        mAdapterFood = new FoodTypesRecyclerViewAdapter(getActivity(),modelArrayList_FoodTypes,HomeFragment.this);
        recycler_food_types.setHasFixedSize(true);
        // use a linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, true);
        layoutManager.setReverseLayout(true);
        recycler_food_types.setLayoutManager(layoutManager);
        recycler_food_types.setAdapter(mAdapterFood);

        mAdapterFood.SetOnItemClickListener(new FoodTypesRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position, DiscoversModel model) {


            }
        });
    }

    private void setAdapterPapular() {

        this.modelArrayList_papular.add(new DiscoversModel("Asian",R.drawable.img_three));
        this.modelArrayList_papular.add(new DiscoversModel("Pizza",R.drawable.img));
        this.modelArrayList_papular.add(new DiscoversModel("Ice Cream",R.drawable.rest_img_two));
        this.modelArrayList_papular.add(new DiscoversModel("Offer",R.drawable.rest_img));
        this.modelArrayList_papular.add(new DiscoversModel("Burgers",R.drawable.img_three));


        mAdapterPapular = new PapularRecyclerViewAdapter(getActivity(),modelArrayList_papular,HomeFragment.this);
        recycler_papular.setHasFixedSize(true);
        // use a linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recycler_papular.setLayoutManager(layoutManager);
        recycler_papular.setAdapter(mAdapterPapular);

        mAdapterPapular.SetOnItemClickListener(new PapularRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position, DiscoversModel model) {


            }
        });
    }


}