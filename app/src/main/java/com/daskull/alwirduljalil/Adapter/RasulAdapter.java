package com.daskull.auradulmaraqiyah.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Rasul;
import com.daskull.auradulmaraqiyah.model.Waqi;

import java.util.ArrayList;

public class RasulAdapter extends RecyclerView.Adapter<RasulAdapter.MyViewHolder> {
    private ArrayList<Rasul> rasuls;
    private Context mContext;

    public RasulAdapter(ArrayList<Rasul> rasuls, Context mContext) {
        this.rasuls = rasuls;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RasulAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rasul_item, parent, false);


        return new RasulAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RasulAdapter.MyViewHolder holder, int position) {
        holder.rasul_ayat.setText(rasuls.get(position).getAyat());
        holder.rasul_arti.setText(rasuls.get(position).getArtinya());

    }

    @Override
    public int getItemCount() {
        return rasuls.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView rasul_ayat, rasul_arti;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            rasul_ayat = itemView.findViewById(R.id.ayat_rasul);
            rasul_arti = itemView.findViewById(R.id.artinya_rasul);
        }
    }
}
