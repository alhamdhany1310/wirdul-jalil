package com.daskull.auradulmaraqiyah.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Mulk;
import com.daskull.auradulmaraqiyah.model.Waqi;

import java.util.ArrayList;

public class WaqiAdafter extends RecyclerView.Adapter<WaqiAdafter.MyViewHolder> {
    private ArrayList<Waqi> waqis;
    private Context mContext;

    public WaqiAdafter(ArrayList<Waqi> waqis, Context mContext) {
        this.waqis = waqis;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public WaqiAdafter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.waqi_item, parent, false);


        return new WaqiAdafter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WaqiAdafter.MyViewHolder holder, int position) {
        holder.waqi_ayat.setText(waqis.get(position).getAyat());
        holder.waqi_arti.setText(waqis.get(position).getArtinya());

    }

    @Override
    public int getItemCount() {
        return waqis.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView waqi_ayat, waqi_arti;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            waqi_ayat = itemView.findViewById(R.id.ayat_waqi);
            waqi_arti = itemView.findViewById(R.id.artinya_waqi);
        }
    }
}
