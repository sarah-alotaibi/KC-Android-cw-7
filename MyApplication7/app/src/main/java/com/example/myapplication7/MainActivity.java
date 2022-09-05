package com.example.myapplication7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Items> items = new ArrayList<>();


                Items items1 = new Items("cheese",R.drawable.cheese,2.0);
                Items items2 = new Items("chocolate",R.drawable.chocolate,2.0);
                Items items3 = new Items("coffee",R.drawable.coffee,2.0);
                Items items4 = new Items("donut", R.drawable.donut,2.0);
                Items items5 = new Items("fries",R.drawable.fries,2.0);
                Items items6 = new Items("honey",R.drawable.honey,2.0);

                items.add(items1);
                items.add(items2);
                items.add(items3);
                items.add(items4);
                items.add(items5);
                items.add(items6);

                ListView listView = findViewById(R.id.listview);


                ItemAdapter itemsAdapter = new ItemAdapter(this,0,items);
                listView.setAdapter(itemsAdapter);




        }


    }


