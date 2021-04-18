package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<ItemList> list;
    private ItemListApdater mApdater;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list= new ArrayList<ItemList>();
        list.add(new ItemList(R.drawable.giacchuyen1,"Cáp chuyển từ Cổng USB sang PS2...",15,4,69900,39));
        list.add(new ItemList(R.drawable.carbusbtops2,"Cáp chuyển từ Cổng USB sang PS2...",15,4,69900,39));
        list.add(new ItemList(R.drawable.dauchuyendoi,"Cáp chuyển từ Cổng USB sang PS2...",15,4,69900,39));
        list.add(new ItemList(R.drawable.daynguon1,"Cáp chuyển từ Cổng USB sang PS2...",15,4,69900,39));
        list.add(new ItemList(R.drawable.giacchuyen1,"Cáp chuyển từ Cổng USB sang PS2...",15,4,69900,39));
        list.add(new ItemList(R.drawable.giacchuyen1,"Cáp chuyển từ Cổng USB sang PS2...",15,4,69900,39));
        list.add(new ItemList(R.drawable.giacchuyen1,"Cáp chuyển từ Cổng USB sang PS2...",15,4,69900,39));
        list.add(new ItemList(R.drawable.giacchuyen1,"Cáp chuyển từ Cổng USB sang PS2...",15,4,69900,39));


        recyclerView= findViewById(R.id.recyclerView);

        mApdater= new ItemListApdater(this, list);
        recyclerView.setAdapter(mApdater);

//        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
    }
}