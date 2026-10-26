package com.daskull.auradulmaraqiyah.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Bism;
import com.daskull.auradulmaraqiyah.model.Waqi;

import java.util.ArrayList;

public class BismAdafter  extends RecyclerView.Adapter<BismAdafter.MyViewHolder> {
    private ArrayList<Bism> bisms;
    private Context mContext;

    public BismAdafter(ArrayList<Bism> bisms, Context mContext) {
        this.bisms = bisms;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public BismAdafter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bism_item, parent, false);


        return new BismAdafter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BismAdafter.MyViewHolder holder, int position) {
        holder.bism_ayat.setText(bisms.get(position).getAyat());
        holder.bism_arti.setText(bisms.get(position).getArtinya());

    }

    @Override
    public int getItemCount() {
        return bisms.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView bism_ayat, bism_arti;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            bism_ayat = itemView.findViewById(R.id.ayat_bis);
            bism_arti = itemView.findViewById(R.id.artinya_bis);
        }
    }
}