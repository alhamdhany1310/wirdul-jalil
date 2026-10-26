package com.daskull.auradulmaraqiyah.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Nari;
import com.daskull.auradulmaraqiyah.model.Waqi;

import java.util.ArrayList;

public class NariAdapter  extends RecyclerView.Adapter<NariAdapter.MyViewHolder> {
    private ArrayList<Nari> naris;
    private Context mContext;

    public NariAdapter(ArrayList<Nari> naris, Context mContext) {
        this.naris = naris;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public NariAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.nari_item, parent, false);


        return new NariAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NariAdapter.MyViewHolder holder, int position) {
        holder.nari_ayat.setText(naris.get(position).getAyat());
        holder.nari_arti.setText(naris.get(position).getArtinya());

    }

    @Override
    public int getItemCount() {
        return naris.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView nari_ayat, nari_arti;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nari_ayat = itemView.findViewById(R.id.ayat_nari);
            nari_arti = itemView.findViewById(R.id.artinya_nari);
        }
    }
}
