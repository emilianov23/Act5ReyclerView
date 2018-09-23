package com.example.emiliano.act5reyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<persona>listusuario;
    RecyclerView recyclerusuario;
    RecyclerView.adapter Adapte;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listusuario = new ArrayList<persona>();
        getllenar();


        recyclerusuario = findViewById(R.id.recyclerID);
        adapte = new AdapterRecycler(listusuario);
        RecycleView.LayoutManager Manager = new LinearLayout(getApplicationContext());
        recyclerusuario.setLayoutManager(Manager);
        recyclerusuario.setItemAnimator(new DefaultItemAnimator());
        recyclerusuario.setadapter(Adapte);
    }

    private void llenar(){
        listusuario.add(new persona("Emiliano","Vargas","19"));
        listusuario.add(new persona("Fernando","Vargas","15"));
        listusuario.add(new persona("Adelas","Hernandez","40"));
        listusuario.add(new persona("Mario","Vargas","43"));
    }
}
