package com.example.jeansmits.activity;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import model.LZVLeuven;

/**
 * Created by jeansmits on 7/09/15.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private  List<LZVLeuven> listAllTeams;
    Context context;



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.team,parent, false);
        ViewHolder vh= new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textViewT.setText(listAllTeams.get(position).getTeamName());
        holder.textviewSporthal.setText(listAllTeams.get(position).getSportzaal());
        Picasso.with(context).load(listAllTeams.get(position).getImageURL()).into(holder.imageTeam);

    }

    @Override
    public int getItemCount() {
        return listAllTeams.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewT;
        public TextView textviewSporthal;
        public ImageView imageTeam;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewT= (TextView) itemView.findViewById(R.id.teamNaam);
            textviewSporthal= (TextView) itemView.findViewById(R.id.teamSporthal);
            imageTeam= (ImageView) itemView.findViewById(R.id.imgTeam);
        }
    }

    public MyAdapter(List<LZVLeuven> myDataset, Context context){
        listAllTeams=myDataset;
        this.context=context;
    }

}
