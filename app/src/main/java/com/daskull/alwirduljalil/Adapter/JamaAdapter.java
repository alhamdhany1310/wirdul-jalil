package com.daskull.auradulmaraqiyah.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Jama;
import com.daskull.auradulmaraqiyah.model.Waqi;

import java.util.ArrayList;

public class JamaAdapter  extends RecyclerView.Adapter<JamaAdapter.MyViewHolder> {
    private ArrayList<Jama> jamas;
    private Context mContext;

    public JamaAdapter(ArrayList<Jama> jamas, Context mContext) {
        this.jamas = jamas;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public JamaAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.jama_item, parent, false);


        return new JamaAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull JamaAdapter.MyViewHolder holder, int position) {
        holder.jama_ayat.setText(jamas.get(position).getAyat());
        holder.jama_arti.setText(jamas.get(position).getArtinya());

    }

    @Override
    public int getItemCount() {
        return jamas.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView jama_ayat, jama_arti;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            jama_ayat = itemView.findViewById(R.id.ayat_jama);
            jama_arti = itemView.findViewById(R.id.artinya_jama);
        }
    }
}

