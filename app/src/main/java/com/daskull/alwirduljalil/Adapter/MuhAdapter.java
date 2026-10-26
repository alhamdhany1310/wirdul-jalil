package com.daskull.auradulmaraqiyah.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Muh;
import com.daskull.auradulmaraqiyah.model.Waqi;

import java.util.ArrayList;

public class MuhAdapter  extends RecyclerView.Adapter<MuhAdapter.MyViewHolder> {
    private ArrayList<Muh> muhs;
    private Context mContext;

    public MuhAdapter(ArrayList<Muh> muhs, Context mContext) {
        this.muhs = muhs;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MuhAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.muh_item, parent, false);


        return new MuhAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MuhAdapter.MyViewHolder holder, int position) {
        holder.muh_ayat.setText(muhs.get(position).getAyat());
        holder.muh_arti.setText(muhs.get(position).getArtinya());

    }

    @Override
    public int getItemCount() {
        return muhs.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView muh_ayat, muh_arti;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            muh_ayat = itemView.findViewById(R.id.ayat_muh);
            muh_arti = itemView.findViewById(R.id.artinya_muh);
        }
    }
}
