package com.example.contries;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainFragment extends Fragment implements ClickListener {
    ArrayList<Continents> continents;
    ContinentAdapter adapter;
    RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        continents = new ArrayList<>();
        continents.add(new Continents(R.drawable.ic_asia, "Eurasia"));
        continents.add(new Continents(R.drawable.ic_africa, "Africa"));
        continents.add(new Continents(R.drawable.ic_australia, "Australia"));
        continents.add(new Continents(R.drawable.ic_southamerica, "South America"));
        continents.add(new Continents(R.drawable.ic_nourthamerica, "North America"));
        continents.add(new Continents(R.drawable.ic_europe, "Europe"));

        recyclerView=view.findViewById(R.id.recycler);
        adapter = new ContinentAdapter(continents, this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void click(int position) {
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.recycler, new SecondFragment()).addToBackStack(null).commit();
    }
}