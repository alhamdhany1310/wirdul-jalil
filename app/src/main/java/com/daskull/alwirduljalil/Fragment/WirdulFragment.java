package com.daskull.auradulmaraqiyah.Fragment;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Asma;
import com.daskull.auradulmaraqiyah.model.Itirof;
import com.daskull.auradulmaraqiyah.model.Rasul;
import com.daskull.auradulmaraqiyah.model.Tari;


public class WirdulFragment extends Fragment implements AdapterView.OnItemSelectedListener{
    CardView fatihah;
    CardView yasin;
    CardView almulk;
    CardView waqiah;
    CardView ayatqursi;
    CardView asmaul;
    CardView muhtar;
    CardView jama;
    CardView muti;
    CardView nari;
    CardView tari;
    CardView hukiyah;
    CardView subuhu;
    CardView yara;
    CardView rabisu;
    CardView badaryah;
    CardView itirof;
    CardView sabat;
    CardView rasul;
    CardView zul;
    CardView khati;

    public WirdulFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View itemView = inflater.inflate(R.layout.fragment_wirdul, container, false);
        fatihah = itemView.findViewById(R.id.satu);
        yasin = itemView.findViewById(R.id.yasin);
        almulk = itemView.findViewById(R.id.mulk);
        waqiah = itemView.findViewById(R.id.waqiah);
        ayatqursi = itemView.findViewById(R.id.qursi);
        asmaul= itemView.findViewById(R.id.asma);
        muhtar = itemView.findViewById(R.id.muh);
        jama = itemView.findViewById(R.id.jama);
        muti = itemView.findViewById(R.id.muti);
        nari = itemView.findViewById(R.id.nari);
        tari = itemView.findViewById(R.id.Tari);
        hukiyah = itemView.findViewById(R.id.hukiya);
        subuhu = itemView.findViewById(R.id.subuhu);
        yara = itemView.findViewById(R.id.yara);
        rabisu = itemView.findViewById(R.id.rabisu);
        badaryah = itemView.findViewById(R.id.badaryah);
        itirof = itemView.findViewById(R.id.itirof);
        sabat = itemView.findViewById(R.id.sabat);
        rasul = itemView.findViewById(R.id.rasul);
        zul = itemView.findViewById(R.id.zul);
        khati = itemView.findViewById(R.id.khati);

        fatihah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FatihahFragment fatihahFragment = new FatihahFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fatihahFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        yasin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YasinFragment yasinFragment = new YasinFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, yasinFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        almulk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MulkFragment mulkFragment = new MulkFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container,mulkFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        waqiah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WaqiFragment waqiFragment = new WaqiFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, waqiFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        ayatqursi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BismFragment bismFragment = new BismFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, bismFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        asmaul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AsmaFragment asmaFragment = new AsmaFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, asmaFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        muhtar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MuhFragment muhFragment = new MuhFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, muhFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        jama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JamaFragment jamaFragment = new JamaFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, jamaFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        muti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MutiFragment mutiFragment = new MutiFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, mutiFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        nari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NariFragment nariFragment = new NariFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, nariFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        tari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TariFragment tariFragment = new TariFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, tariFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        hukiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HukiyaFragment hukiyaFragment = new HukiyaFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, hukiyaFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        subuhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SubuhuFragment subuhuFragment = new SubuhuFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, subuhuFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        yara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YaraFragment yaraFragment = new YaraFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, yaraFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        rabisu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RabisuFragment rabisuFragment = new RabisuFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, rabisuFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        badaryah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BadaryahFragment badaryahFragment = new BadaryahFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, badaryahFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        itirof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ItirofFragment itirofFragment = new ItirofFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, itirofFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        sabat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SabatFragment sabatFragment = new SabatFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, sabatFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        rasul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RasulFragment rasulFragment = new RasulFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, rasulFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        zul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ZulFragment zulFragment = new ZulFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, zulFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        khati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoaFragment doaFragment = new DoaFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, doaFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });

        return itemView;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}