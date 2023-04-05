package com.example.customadapterlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context ctx;
    String[] items;
    int[] resource;
    LayoutInflater inflater;

//    Constructor of this class to be called in MainActivity.java
    public CustomAdapter(Context ctx, String[] items, int[] resource) {
        this.ctx = ctx;
        this.items = items;
        this.resource = resource;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
//        Without assigning the length of the String, position and getView() method cannot be used -->
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.listview_cell,null);
        TextView listItem = convertView.findViewById(R.id.listItem);
        ImageView listItemImage=convertView.findViewById(R.id.listItemImage);
        listItem.setText(items[position]);
        listItemImage.setImageResource(resource[position]);
        return convertView;
    }
}
