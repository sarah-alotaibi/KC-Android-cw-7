package com.example.myapplication7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemAdapter extends ArrayAdapter {
   List<Items> itemsList;
    public ItemAdapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
        super(context, resource, objects);
        itemsList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,parent,false);
       Items currentItems = itemsList.get(position);

        TextView kuwait = view.findViewById(R.id.itemName);
        TextView itemprice = view.findViewById(R.id.itemPrice);
        ImageView imageView = view.findViewById(R.id.imageView);
        kuwait.setText(currentItems.getItemName());
        itemprice.setText(currentItems.getItemPrice());
        imageView.setImageResource(currentItems.getItemImage());


        return view;

    }
}
