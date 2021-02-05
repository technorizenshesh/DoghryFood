package com.doghryfood.Fragment;


import android.content.Context;
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
import com.doghryfood.adapters.FavRecyclerViewAdapter;
import com.doghryfood.adapters.FoodTypesRecyclerViewAdapter;
import com.doghryfood.adapters.PapularRecyclerViewAdapter;

import java.util.ArrayList;

public class FavFragment extends Fragment{

    Context mContext;
    RecyclerView recycler_fav;
    View view;
    FavRecyclerViewAdapter madapterFav;
    private ArrayList<DiscoversModel> modelArrayList_papular = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_fav, container, false);

        init();

        setAdapterFav();

        return view;

    }

    private void init() {

        recycler_fav =view.findViewById(R.id.recycler_fav);

    }

    private void setAdapterFav() {

        this.modelArrayList_papular.add(new DiscoversModel("Asian",R.drawable.img_three));
        this.modelArrayList_papular.add(new DiscoversModel("Pizza",R.drawable.img));
        this.modelArrayList_papular.add(new DiscoversModel("Ice Cream",R.drawable.rest_img_two));
        this.modelArrayList_papular.add(new DiscoversModel("Offer",R.drawable.rest_img));
        this.modelArrayList_papular.add(new DiscoversModel("Burgers",R.drawable.img_three));


        madapterFav = new FavRecyclerViewAdapter(getActivity(),modelArrayList_papular, FavFragment.this);
        // use a linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recycler_fav.setLayoutManager(layoutManager);
        recycler_fav.setAdapter(madapterFav);

        madapterFav.SetOnItemClickListener(new FavRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position, DiscoversModel model) {


            }
        });
    }


}