package com.daskull.auradulmaraqiyah.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Hukiya;
import com.daskull.auradulmaraqiyah.model.Waqi;

import java.util.ArrayList;

public class HukiyaAdapter  extends RecyclerView.Adapter<HukiyaAdapter.MyViewHolder> {
    private ArrayList<Hukiya> hukiyas;
    private Context mContext;

    public HukiyaAdapter(ArrayList<Hukiya> hukiyas, Context mContext) {
        this.hukiyas = hukiyas;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public HukiyaAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hukiya_item, parent, false);


        return new HukiyaAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HukiyaAdapter.MyViewHolder holder, int position) {
        holder.hukiya_ayat.setText(hukiyas.get(position).getAyat());
        holder.hukiya_arti.setText(hukiyas.get(position).getArtinya());

    }

    @Override
    public int getItemCount() {
        return hukiyas.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView hukiya_ayat, hukiya_arti;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            hukiya_ayat = itemView.findViewById(R.id.ayat_hukiya);
            hukiya_arti = itemView.findViewById(R.id.artinya_hukiya);
        }
    }
}