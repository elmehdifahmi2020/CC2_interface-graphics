package com.elmernissi.myrestufinder.MyAdapter;

import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.elmernissi.myrestufinder.R;
import com.elmernissi.myrestufinder.model.Magasin;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MagasinViewHolder>{
    private List<Magasin>listMagasin;
    public MyAdapter (List<Magasin>listMagasin){
        this.listMagasin=listMagasin;
    }

    @NonNull
    @Override
    public MagasinViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_magasin_item,parent,false);
        return new  MagasinViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MagasinViewHolder holder, int position) {
        Magasin magasin=listMagasin.get(position);
        holder.nomTextView.setText(magasin.getNom());
        holder.adresseTextView.setText(magasin.getAdresse());
        holder.telephoneTextView.setText(magasin.getPhone());
    }


    @Override
    public int getItemCount() {
        return listMagasin.size();
    }

    public static class MagasinViewHolder extends RecyclerView.ViewHolder{
        TextView nomTextView ,adresseTextView ,telephoneTextView;
        public MagasinViewHolder(@NonNull View itemView){
            super(itemView);
            nomTextView=itemView.findViewById(R.id.nomTextView);
            adresseTextView=itemView.findViewById(R.id.adresseTextView);
            telephoneTextView=itemView.findViewById(R.id.telephoneTextView);

        }

    }
}
