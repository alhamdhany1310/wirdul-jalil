package com.daskull.auradulmaraqiyah.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Muti;
import com.daskull.auradulmaraqiyah.model.Waqi;

import java.util.ArrayList;

public class MutiAdapater  extends RecyclerView.Adapter<MutiAdapater.MyViewHolder> {
    private ArrayList<Muti> mutis;
    private Context mContext;

    public MutiAdapater(ArrayList<Muti> mutis, Context mContext) {
        this.mutis = mutis;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MutiAdapater.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.muti_item, parent, false);


        return new MutiAdapater.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MutiAdapater.MyViewHolder holder, int position) {
        holder.muti_ayat.setText(mutis.get(position).getAyat());
        holder.muti_arti.setText(mutis.get(position).getArtinya());

    }

    @Override
    public int getItemCount() {
        return mutis.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView muti_ayat, muti_arti;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            muti_ayat = itemView.findViewById(R.id.ayat_muti);
            muti_arti = itemView.findViewById(R.id.artinya_muti);
        }
    }
}
