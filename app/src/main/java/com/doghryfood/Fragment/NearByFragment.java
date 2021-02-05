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
import com.doghryfood.adapters.FavRecyclerViewAdapter;
import com.doghryfood.adapters.NearByRecyclerViewAdapter;

import java.util.ArrayList;

public class NearByFragment extends Fragment{

    Context mContext;
    RecyclerView recycler_nearBy;
    View view;
    NearByRecyclerViewAdapter madapterFav;
    private ArrayList<DiscoversModel> modelArrayList_nearBy = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_near_by, container, false);

        init();

        setAdapterNearBy();

        return view;

    }

    private void init() {

        recycler_nearBy =view.findViewById(R.id.recycler_nearBy);

    }

    private void setAdapterNearBy() {

        this.modelArrayList_nearBy.add(new DiscoversModel("Asian",R.drawable.img_three));
        this.modelArrayList_nearBy.add(new DiscoversModel("Pizza",R.drawable.img));
        this.modelArrayList_nearBy.add(new DiscoversModel("Ice Cream",R.drawable.rest_img_two));
        this.modelArrayList_nearBy.add(new DiscoversModel("Offer",R.drawable.rest_img));
        this.modelArrayList_nearBy.add(new DiscoversModel("Burgers",R.drawable.img_three));


        madapterFav = new NearByRecyclerViewAdapter(getActivity(),modelArrayList_nearBy, NearByFragment.this);
        // use a linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recycler_nearBy.setLayoutManager(layoutManager);
        recycler_nearBy.setAdapter(madapterFav);

        madapterFav.SetOnItemClickListener(new NearByRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position, DiscoversModel model) {


            }
        });
    }


}