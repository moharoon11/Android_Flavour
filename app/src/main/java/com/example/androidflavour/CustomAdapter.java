package com.example.androidflavour;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

class CustomAdapter extends ArrayAdapter<AndroidFlavour> {


    public CustomAdapter(Activity context, ArrayList<AndroidFlavour> details) {
        super(context, 0, details);
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View listItem= convertView;

        if(listItem==null){
            listItem= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        AndroidFlavour currentThing=getItem(position);

        ImageView lollipop=(ImageView) listItem.findViewById(R.id.lollipop_image);
        lollipop.setImageResource(currentThing.getImage());

       TextView modName=(TextView) listItem.findViewById(R.id.mod_name);
       modName.setText(currentThing.getModelName());

       TextView verName=(TextView) listItem.findViewById(R.id.version_name);
       verName.setText(currentThing.getVersionName());



        return listItem;
    }
}
