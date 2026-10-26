package com.daskull.auradulmaraqiyah.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Rabisu;
import com.daskull.auradulmaraqiyah.model.Waqi;

import java.util.ArrayList;

public class RabisuAdapter  extends RecyclerView.Adapter<RabisuAdapter.MyViewHolder> {
    private ArrayList<Rabisu> rabisus;
    private Context mContext;

    public RabisuAdapter(ArrayList<Rabisu> rabisus, Context mContext) {
        this.rabisus = rabisus;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RabisuAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rabisu_item, parent, false);


        return new RabisuAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RabisuAdapter.MyViewHolder holder, int position) {
        holder.rabisu_ayat.setText(rabisus.get(position).getAyat());
        holder.rabisu_arti.setText(rabisus.get(position).getArtinya());

    }

    @Override
    public int getItemCount() {
        return rabisus.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView rabisu_ayat, rabisu_arti;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            rabisu_ayat = itemView.findViewById(R.id.ayat_rabisu);
            rabisu_arti = itemView.findViewById(R.id.artinya_rabisu);
        }
    }
}