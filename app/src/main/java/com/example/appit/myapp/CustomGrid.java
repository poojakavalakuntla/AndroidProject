package com.example.appit.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomGrid extends BaseAdapter {

    private Context context;
    private String[] scale_id;
    private int[] image_id;

    public CustomGrid(Context c,int[] image,String[] scale) {
        this.context = c;
        this.scale_id = scale;
        this.image_id = image;
    }

    @Override
    public int getCount() {
        return scale_id.length;
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
        View view;
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView==null){

            view=new View(context);
            view=inflater.inflate(R.layout.custom_grid_view,null);
            ImageView imageView=(ImageView)view.findViewById(R.id.grid_image);
            TextView textView=(TextView)view.findViewById(R.id.grid_text);

            imageView.setImageResource(image_id[position]);
            textView.setText(scale_id[position]);
        }
        else {
            view=(View)convertView;
        }
        return view;
    }
}
