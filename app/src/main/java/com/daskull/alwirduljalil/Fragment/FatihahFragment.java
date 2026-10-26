package com.daskull.auradulmaraqiyah.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.daskull.auradulmaraqiyah.Adapter.FatihahAdafter;
import com.daskull.auradulmaraqiyah.Adapter.YasinAdapter;
import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Fatihah;
import com.daskull.auradulmaraqiyah.model.Yasin;

import java.util.ArrayList;

public class FatihahFragment extends Fragment {

    ArrayList<Fatihah> list;
    RecyclerView fatihahRecycler;
    FatihahAdafter adapter;
    TextView next;

    public FatihahFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View itemView = inflater.inflate(R.layout.fragment_fatihah, container, false);
        list = new ArrayList<Fatihah>();
        fatihahRecycler = itemView.findViewById(R.id.fatihahrecycler);
        next = itemView.findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YasinFragment yasinFragment = new YasinFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container,yasinFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });

        loadData();
        initView();

        return itemView;
    }
    private void initView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        fatihahRecycler.setLayoutManager(linearLayoutManager);
        fatihahRecycler.setHasFixedSize(true);
    }

    private void loadData() {

        list.add(new Fatihah("١﴾. لِسَيِّدِنَا مُحَمَّدٍ صَلَّى اللّٰهُ عَلَيْهِ وَسَلَّمَ وَلِسَائِرِ إِخْوَانِهِ الْأَنْبِيَاءِ وَالْمُرْسَلِيْنَ وَعَلَى آلِهِمْ وَأَصْحَابِهِمُ الْكِرَامِ اَجْمَعِيْنَ. ","الفاتحة"));
        list.add(new Fatihah("٢﴾. لِلْأَئِمَّةِ الْمُجْتَهِدِيْنَ مِنَ الْعُلَمَآءِ الْعَامِلِيْنَ وَالْأَوْلِيَآءِ الْعَارِفِيْنَ وَلِشَيْخِ مَشَايِخِنَا الْكِرَامِ اَجْمَعِيْنَ. ","الفاتحة"));
        list.add(new Fatihah("٣﴾. لِوَالِدِيْنَا وَأُمَّهَاتِنَا وَأَجْدَادِنَا وَجَدَّاتِنَا وَلِإِخْوَانِنَا الَّذِيْنَ سَبَقُوْنَا بِالْإِيْمَانِ وَلِمَنْ لَهُ حَقٌّ عَلَيْنَا وَلِجَمِيْعِ الْمُسْلِمِيْنَ وَالْمُسْلِمَاتِ وَالْمُؤْمِنِيْنَ وَالْمُؤْمِنَاتِ الْأَحْيَاءِ مِنْهُمْ وَالْاَمْوَاتِ.","الفاتحة"));
        list.add(new Fatihah("٤﴾. لِسَلَامَةِ الْمُؤَسَّسَةِ الْمُخْتَارِيَةِ الْإِسْلَامِيَّةِ وَمُؤَسِّسِيْهَا وَجَمَاعَتِهَا وَمَنْ أَحَبَّهَا مِنَ الْآفَاتِ وَالْعَاهَاتِ وَالْأَعْدَاءِ وَالْحُسَّادِ وَالْوَبَاءِ وَالْبَلَاءِ وَالْفِتَنِ وَالْمِحَنِ لَاسِيَّمَا فِي هٰذَا الزَّمَانِ.","الفاتحة"));
        list.add(new Fatihah("٥﴾. خُصُوْصًا لِمَشَيِّخِنَا الشَّيْخ اَلْحَاجْ عَفِيْفُ الدِّيْن عَدْنَانْ.","الفاتحة"));
        list.add(new Fatihah("٦﴾. لِأَشْخَاصِنَا وَلِصَاحِبِ الْوَقْتِ وَرِجَالِ الْغَيْبِ.","الفاتحة"));
       



        // list.add(new Fatihah("",""));


        adapter = new FatihahAdafter(list,getActivity());
        fatihahRecycler.setAdapter(adapter);
    }
}