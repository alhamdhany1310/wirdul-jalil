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
import com.daskull.auradulmaraqiyah.model.Yara;

import java.util.ArrayList;

public class YaraAdapter  extends RecyclerView.Adapter<YaraAdapter.MyViewHolder> {
    private ArrayList<Yara> yaras;
    private Context mContext;

    public YaraAdapter(ArrayList<Yara> yaras, Context mContext) {
        this.yaras = yaras;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public YaraAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.yara_item, parent, false);


        return new YaraAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull YaraAdapter.MyViewHolder holder, int position) {
        holder.yara_ayat.setText(yaras.get(position).getAyat());
        holder.yara_arti.setText(yaras.get(position).getArtinya());

    }

    @Override
    public int getItemCount() {
        return yaras.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView yara_ayat, yara_arti;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            yara_ayat = itemView.findViewById(R.id.ayat_yara);
            yara_arti = itemView.findViewById(R.id.artinya_yara);
        }
    }
}