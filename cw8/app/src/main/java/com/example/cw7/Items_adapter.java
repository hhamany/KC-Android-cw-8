package com.example.cw7;

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

public class Items_adapter extends ArrayAdapter {
    List<Items> phones;

    public Items_adapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        phones=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.xml2,parent,false);

        Items currentphone = phones.get(position);


        TextView name = view.findViewById(R.id.name);
        TextView brand = view.findViewById(R.id.brand);
        ImageView pic = view.findViewById(R.id.imageView2);

        name.setText(currentphone.getName());
        brand.setText(currentphone.getBrand());
        pic.setImageResource(currentphone.getPic());
        return view;

    }
}
