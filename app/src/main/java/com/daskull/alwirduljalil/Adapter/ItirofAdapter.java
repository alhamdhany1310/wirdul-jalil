package com.daskull.auradulmaraqiyah.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Itirof;
import com.daskull.auradulmaraqiyah.model.Waqi;

import java.util.ArrayList;

public class ItirofAdapter  extends RecyclerView.Adapter<ItirofAdapter.MyViewHolder> {
    private ArrayList<Itirof> itirofs;
    private Context mContext;

    public ItirofAdapter(ArrayList<Itirof> itirofs, Context mContext) {
        this.itirofs = itirofs;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ItirofAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itirof_item, parent, false);


        return new ItirofAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItirofAdapter.MyViewHolder holder, int position) {
        holder.itirof_ayat.setText(itirofs.get(position).getAyat());
        holder.itirof_arti.setText(itirofs.get(position).getArtinya());

    }

    @Override
    public int getItemCount() {
        return itirofs.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView itirof_ayat, itirof_arti;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            itirof_ayat = itemView.findViewById(R.id.ayat_itirof);
            itirof_arti = itemView.findViewById(R.id.artinya_itirof);
        }
    }
}