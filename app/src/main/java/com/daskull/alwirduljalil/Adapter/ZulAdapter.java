package com.daskull.auradulmaraqiyah.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Waqi;
import com.daskull.auradulmaraqiyah.model.Zul;

import java.util.ArrayList;

public class ZulAdapter extends RecyclerView.Adapter<ZulAdapter.MyViewHolder> {
    private ArrayList<Zul> zuls;
    private Context mContext;

    public ZulAdapter(ArrayList<Zul> zuls, Context mContext) {
        this.zuls = zuls;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ZulAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.zul_item, parent, false);


        return new ZulAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ZulAdapter.MyViewHolder holder, int position) {
        holder.zul_ayat.setText(zuls.get(position).getAyat());
        holder.zul_arti.setText(zuls.get(position).getArtinya());

    }

    @Override
    public int getItemCount() {
        return zuls.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView zul_ayat, zul_arti;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            zul_ayat = itemView.findViewById(R.id.ayat_zul);
            zul_arti = itemView.findViewById(R.id.artinya_zul);
        }
    }
}
