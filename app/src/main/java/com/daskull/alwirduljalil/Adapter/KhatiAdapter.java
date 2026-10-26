package com.daskull.auradulmaraqiyah.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Khati;
import com.daskull.auradulmaraqiyah.model.Waqi;

import java.util.ArrayList;

public class KhatiAdapter extends RecyclerView.Adapter<KhatiAdapter.MyViewHolder> {
    private ArrayList<Khati> khatis;
    private Context mContext;

    public KhatiAdapter(ArrayList<Khati> khatis, Context mContext) {
        this.khatis = khatis;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public KhatiAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.khati_item, parent, false);


        return new KhatiAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KhatiAdapter.MyViewHolder holder, int position) {
        holder.khati_ayat.setText(khatis.get(position).getAyat());
        holder.khati_arti.setText(khatis.get(position).getArtinya());

    }

    @Override
    public int getItemCount() {
        return khatis.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView khati_ayat, khati_arti;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            khati_ayat = itemView.findViewById(R.id.ayat_khati);
            khati_arti = itemView.findViewById(R.id.artinya_khati);
        }
    }
}