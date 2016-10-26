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
        int index=bundle.getInt("ImageId");
        ImageView imageView=(ImageView)findViewById(R.id.iV_display_image);

      switch (index){
            case 0:
                imageView.setImageResource(R.drawable.image1);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                break;
            case 1:
                imageView.setImageResource(R.drawable.image2);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                break;
            case 2:
                imageView.setImageResource(R.drawable.image2);
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                break;
            case 3:
                imageView.setImageResource(R.drawable.image3);
                imageView.setScaleType(ImageView.ScaleType.MATRIX);
                break;
            case 4:
                imageView.setImageResource(R.drawable.image4);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                break;
            case 5:
                imageView.setImageResource(R.drawable.image5);
                imageView.setScaleType(ImageView.ScaleType.FIT_START);
                break;
            case 6:
                imageView.setImageResource(R.drawable.image6);
                imageView.setScaleType(ImageView.ScaleType.FIT_END);
                break;
            case 7:
                imageView.setImageResource(R.drawable.image7);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                break;

        }
    }
}
