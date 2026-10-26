package com.daskull.auradulmaraqiyah.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Badaryah;
import com.daskull.auradulmaraqiyah.model.Waqi;

import java.util.ArrayList;

public class BadaryahAdapter  extends RecyclerView.Adapter<BadaryahAdapter.MyViewHolder> {
    private ArrayList<Badaryah> badaryahs;
    private Context mContext;

    public BadaryahAdapter(ArrayList<Badaryah> badaryahs, Context mContext) {
        this.badaryahs = badaryahs;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public BadaryahAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.badaryah_item, parent, false);


        return new BadaryahAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BadaryahAdapter.MyViewHolder holder, int position) {
        holder.badaryah_ayat.setText(badaryahs.get(position).getAyat());
        holder.badaryah_arti.setText(badaryahs.get(position).getArtinya());

    }

    @Override
    public int getItemCount() {
        return badaryahs.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView badaryah_ayat, badaryah_arti;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            badaryah_ayat = itemView.findViewById(R.id.ayat_badaryah);
            badaryah_arti = itemView.findViewById(R.id.artinya_badaryah);
        }
    }
}