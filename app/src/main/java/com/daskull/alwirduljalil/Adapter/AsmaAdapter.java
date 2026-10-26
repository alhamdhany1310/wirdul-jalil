package com.daskull.auradulmaraqiyah.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Asma;


import java.util.ArrayList;

public class AsmaAdapter  extends RecyclerView.Adapter<AsmaAdapter.MyViewHolder> {
    private ArrayList<Asma> asmas;
    private Context mContext;

    public AsmaAdapter(ArrayList<Asma> asmas, Context mContext) {
        this.asmas = asmas;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public AsmaAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.asma_item, parent, false);


        return new AsmaAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AsmaAdapter.MyViewHolder holder, int position) {
        holder.asma_ayat.setText(asmas.get(position).getAyat());
        holder.asma_arti.setText(asmas.get(position).getArtinya());

    }

    @Override
    public int getItemCount() {
        return asmas.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView asma_ayat, asma_arti;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            asma_ayat = itemView.findViewById(R.id.ayat_asma);
            asma_arti = itemView.findViewById(R.id.artinya_asma);
        }
    }
}
