package com.example.appit.myapp;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageViewPractice extends AppCompatActivity {

    GridView gridView;
    ImageView iv;
    int[] image_id={R.drawable.image1,R.drawable.image2,R.drawable.image3,
                    R.drawable.image4,R.drawable.image5,R.drawable.image6,
                        R.drawable.image7,R.drawable.image8};
    String[] scale_id={"center","center crop","center inside","matrix",
                            "fit-center","fit-start","fit-end","fit-xy"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        Toolbar toolbar=(Toolbar)findViewById(R.id.image_view_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setIcon(R.drawable.ic_image_view_toolbar);
        getSupportActionBar().setTitle(R.string.image_view_title);
        getSupportActionBar().setSubtitle(R.string.image_view_date);

        CustomGrid adapter=new CustomGrid(ImageViewPractice.this,image_id,scale_id);
        gridView=(GridView)findViewById(R.id.gridView);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               Intent intent=new Intent(ImageViewPractice.this,DisplayGridImage.class);
                intent.putExtra("ImageId",position);
                startActivity(intent);
            }
        });

    }

}
