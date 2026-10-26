package com.daskull.auradulmaraqiyah.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Fatihah;
import com.daskull.auradulmaraqiyah.model.Yasin;

import java.util.ArrayList;

public class FatihahAdafter extends RecyclerView.Adapter<FatihahAdafter.MyViewHolder> {
    private ArrayList<Fatihah> fatihahs;
    private Context mContext;

    public FatihahAdafter(ArrayList<Fatihah> fatihahs, Context mContext) {
        this.fatihahs = fatihahs;
        this.mContext = mContext;
    }
    @NonNull
    @Override
    public FatihahAdafter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fatihah_item,parent,false);


        return new FatihahAdafter.MyViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull FatihahAdafter.MyViewHolder holder, int position) {
        holder.fatihah_ayat.setText(fatihahs.get(position).getAyat());
        holder.fatihah_arti.setText(fatihahs.get(position).getArtinya());

    }

    @Override
    public int getItemCount() {
        return fatihahs.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView fatihah_ayat,fatihah_arti;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            fatihah_ayat = itemView.findViewById(R.id.ayat_fatihah);
            fatihah_arti = itemView.findViewById(R.id.artinya_fatihah);
        }
    }
}
