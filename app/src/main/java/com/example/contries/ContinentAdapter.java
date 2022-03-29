package com.example.contries;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ContinentViewHolder> {
    ArrayList<Continents> continents = new ArrayList();
    private ClickListener listener;

    public ContinentAdapter(ArrayList<Continents> continents, ClickListener listener) {
        this.continents = continents;
        this.listener= listener;
    }

    @NonNull
    @Override

    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.bind(continents.get(position));
        listener.click(position);
    }

    @Override
    public int getItemCount() {
        return continents.size();
    }

    class ContinentViewHolder extends RecyclerView.ViewHolder {
        private TextView nameContinent;
        private ImageView flag;

        public ContinentViewHolder(@NonNull View itemView) {
            super(itemView);
            nameContinent = itemView.findViewById(R.id.continentName);
            flag = itemView.findViewById(R.id.flag);
        }


        void bind(Continents continents) {
            this.flag.setImageResource(continents.getFlag());
            this.nameContinent.setText(continents.getCountryName());
        }
    }
}
