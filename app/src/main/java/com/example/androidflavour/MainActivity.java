package com.example.androidflavour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<AndroidFlavour> items=new ArrayList<AndroidFlavour>();

        items.add(new AndroidFlavour("Donut","1.6",R.drawable.pink_donut));
        items.add(new AndroidFlavour("Eclair","2.0-2.1",R.drawable.eclair));
        items.add(new AndroidFlavour("Froyo","2.2-2.2.3",R.drawable.froyo));
        items.add(new AndroidFlavour("Ginger Bread","2.3-2.3.7",R.drawable.ginger_bread));
        items.add(new AndroidFlavour("Honey Comb","3.0-3.2.6",R.drawable.honey_comb));
        items.add(new AndroidFlavour("Ice Scream SandWitch","4.0-4.0.4",R.drawable.ice_cream_sandwitch));
        items.add(new AndroidFlavour("Jelly Bean","4.1-4.3.1",R.drawable.jelly_bean));

        CustomAdapter adapter=new CustomAdapter(this,items);
        ListView listOfItems= (ListView) findViewById(R.id.listview_flavor);
        listOfItems.setAdapter(adapter);
    }
}