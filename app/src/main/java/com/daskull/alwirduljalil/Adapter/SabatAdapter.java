package com.daskull.auradulmaraqiyah.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Sabat;
import com.daskull.auradulmaraqiyah.model.Waqi;

import java.util.ArrayList;

public class SabatAdapter extends RecyclerView.Adapter<SabatAdapter.MyViewHolder> {
    private ArrayList<Sabat> sabats;
    private Context mContext;

    public SabatAdapter(ArrayList<Sabat> sabats, Context mContext) {
        this.sabats = sabats;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public SabatAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sabat_item, parent, false);


        return new SabatAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SabatAdapter.MyViewHolder holder, int position) {
        holder.sabat_ayat.setText(sabats.get(position).getAyat());
        holder.sabat_arti.setText(sabats.get(position).getArtinya());

    }

    @Override
    public int getItemCount() {
        return sabats.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView sabat_ayat, sabat_arti;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            sabat_ayat = itemView.findViewById(R.id.ayat_sabat);
            sabat_arti = itemView.findViewById(R.id.artinya_sabat);
        }
    }
}