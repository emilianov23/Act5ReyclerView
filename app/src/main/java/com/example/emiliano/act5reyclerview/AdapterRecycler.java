package com.example.emiliano.act5reyclerview;

import android.widget.TextView;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecycler extends RecyclerView.Adapter<AdapterRecycler.ViewHolderData> {
    private ArrayList<persona>listusuario;
    public TextView nom;
    public TextView apellido;
    public TextView edad;


    public AdapterRecyclerViewUser(ArrayList<persona> userList) {
        this.listusuario = userList;
    }



    @Override
    public int getItemCount() {
        try{
            return listusuario.size();
        }
        catch (Exception e){
            return 0;
        }
}
