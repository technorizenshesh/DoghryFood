package com.doghryfood.adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.doghryfood.Model.DiscoversModel;
import com.doghryfood.R;

import java.util.ArrayList;

/**
 * A custom adapter to use with the RecyclerView widget.
 */
public class NearByRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    int pos = 0;
    private Context mContext;
    private ArrayList<DiscoversModel> modelList;
    private OnItemClickListener mItemClickListener;
    private Fragment fragment;
    boolean isLike=true;

    public NearByRecyclerViewAdapter(Context context, ArrayList<DiscoversModel> modelList, Fragment fragment) {
        this.mContext = context;
        this.modelList = modelList;
        this.fragment = fragment;
    }

    public void updateList(ArrayList<DiscoversModel> modelList) {
        this.modelList = modelList;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
       // View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_favr, viewGroup, false);
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_near_by, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        //Here you can fill your row view
        if (holder instanceof ViewHolder) {
            final DiscoversModel model = getItem(position);
            final ViewHolder genericViewHolder = (ViewHolder) holder;

          //  genericViewHolder.img_res.setImageResource(model.getImg());

        }

    }


    @Override
    public int getItemCount() {

        return modelList.size();
    }

    public void SetOnItemClickListener(final OnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }

    private DiscoversModel getItem(int position) {
        return modelList.get(position);
    }


    public interface OnItemClickListener {

        void onItemClick(View view, int position, DiscoversModel model);

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView img_res;


        public ViewHolder(final View itemView) {
            super(itemView);

      //    this.img_res=itemView.findViewById(R.id.img_res);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mItemClickListener.onItemClick(itemView, getAdapterPosition(), modelList.get(getAdapterPosition()));
                }
            });
        }
    }

}

