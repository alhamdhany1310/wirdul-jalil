package com.daskull.auradulmaraqiyah.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Subuhu;
import com.daskull.auradulmaraqiyah.model.Waqi;

import java.util.ArrayList;

public class SubuhuAdapter  extends RecyclerView.Adapter<SubuhuAdapter.MyViewHolder> {
    private ArrayList<Subuhu> subuhus;
    private Context mContext;

    public SubuhuAdapter(ArrayList<Subuhu> subuhus, Context mContext) {
        this.subuhus = subuhus;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public SubuhuAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.subuhu_item, parent, false);


        return new SubuhuAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubuhuAdapter.MyViewHolder holder, int position) {
        holder.subuhu_ayat.setText(subuhus.get(position).getAyat());
        holder.subuhu_arti.setText(subuhus.get(position).getArtinya());

    }

    @Override
    public int getItemCount() {
        return subuhus.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView subuhu_ayat, subuhu_arti;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            subuhu_ayat = itemView.findViewById(R.id.ayat_subuhu);
            subuhu_arti = itemView.findViewById(R.id.artinya_subuhu);
        }
    }
}
