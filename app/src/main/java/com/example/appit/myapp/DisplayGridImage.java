package com.example.appit.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ViewGroup;
import android.widget.ImageView;

public class DisplayGridImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_grid_image);

        Bundle bundle=getIntent().getExtras();
        int index=bundle.getInt("Image");
        ImageView imageView=(ImageView)findViewById(R.id.iV_display_image);
        imageView.setImageResource(index);

      /*  switch (index){
            case 0:
                imageView.setImageResource(R.drawable.image1);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setLayoutParams(new Toolbar.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                imageView.setPadding(8,8,8,8);
                break;
            case 1:
                imageView.setImageResource(image_id[1]);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setLayoutParams(new Toolbar.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                imageView.setPadding(8,8,8,8);
                break;
            case 2:
                imageView.setImageResource(image_id[2]);
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView.setLayoutParams(new Toolbar.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                imageView.setPadding(8,8,8,8);
                break;
            case 3:
                imageView.setImageResource(image_id[3]);
                imageView.setScaleType(ImageView.ScaleType.MATRIX);
                imageView.setLayoutParams(new Toolbar.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                imageView.setPadding(8,8,8,8);
                break;
            case 4:
                imageView.setImageResource(image_id[4]);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new Toolbar.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                imageView.setPadding(8,8,8,8);
                break;
            case 5:
                imageView.setImageResource(image_id[5]);
                imageView.setScaleType(ImageView.ScaleType.FIT_START);
                imageView.setLayoutParams(new Toolbar.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                imageView.setPadding(8,8,8,8);
                break;
            case 6:
                imageView.setImageResource(image_id[6]);
                imageView.setScaleType(ImageView.ScaleType.FIT_END);
                imageView.setLayoutParams(new Toolbar.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                imageView.setPadding(8,8,8,8);
                break;
            case 7:
                imageView.setImageResource(image_id[7]);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setLayoutParams(new Toolbar.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                imageView.setPadding(8,8,8,8);
                break;

        }*/
    }
}
