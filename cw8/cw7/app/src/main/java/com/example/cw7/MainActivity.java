 package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

 public class MainActivity extends AppCompatActivity {
     ArrayList<Items> itemslist = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listview);

        Items cheese = new Items(" cheese ","tom and jerry",R.drawable.cheese);
        Items chocolate = new Items("chocolate","galaxy",R.drawable.chocolate);
        Items honey = new Items(" honey","mo3geza",R.drawable.honey);
        Items donut = new Items("donut ","dunkin",R.drawable.donut);
        Items fries = new Items("fries ","mcdonalds",R.drawable.fries);
        Items coffee = new Items("hot mocha ","starbucks",R.drawable.coffee);

        itemslist.add(cheese);
        itemslist.add(chocolate);
        itemslist.add(honey);
        itemslist.add(donut);
        itemslist.add(fries);
        itemslist.add(coffee);


        Items_adapter itemsadapter = new Items_adapter(this,0,itemslist);

        listView.setAdapter(itemsadapter);
    }
}