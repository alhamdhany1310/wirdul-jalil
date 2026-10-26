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
import com.daskull.auradulmaraqiyah.model.Mulk;

import java.util.ArrayList;

public class MulkAdafter extends RecyclerView.Adapter<MulkAdafter.MyViewHolder> {
    private ArrayList<Mulk> mulks;
    private Context mContext;

    public MulkAdafter(ArrayList<Mulk> mulks, Context mContext) {
        this.mulks = mulks;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MulkAdafter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mulk_item, parent, false);


        return new MulkAdafter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MulkAdafter.MyViewHolder holder, int position) {
        holder.mulk_ayat.setText(mulks.get(position).getAyat());
        holder.mulk_arti.setText(mulks.get(position).getArtinya());

    }

    @Override
    public int getItemCount() {
        return mulks.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mulk_ayat, mulk_arti;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mulk_ayat = itemView.findViewById(R.id.ayat_mulk);
            mulk_arti = itemView.findViewById(R.id.artinya_mulk);
        }
    }
}
