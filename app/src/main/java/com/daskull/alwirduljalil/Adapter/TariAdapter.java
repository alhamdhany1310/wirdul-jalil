package com.daskull.auradulmaraqiyah.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Tari;
import com.daskull.auradulmaraqiyah.model.Waqi;

import java.util.ArrayList;

public class TariAdapter  extends RecyclerView.Adapter<TariAdapter.MyViewHolder> {
    private ArrayList<Tari> taris;
    private Context mContext;

    public TariAdapter(ArrayList<Tari> taris, Context mContext) {
        this.taris = taris;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public TariAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tari_item, parent, false);


        return new TariAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TariAdapter.MyViewHolder holder, int position) {
        holder.tari_ayat.setText(taris.get(position).getAyat());
        holder.tari_arti.setText(taris.get(position).getArtinya());

    }

    @Override
    public int getItemCount() {
        return taris.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tari_ayat, tari_arti;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tari_ayat = itemView.findViewById(R.id.ayat_tari);
            tari_arti = itemView.findViewById(R.id.artinya_tari);
        }
    }
}