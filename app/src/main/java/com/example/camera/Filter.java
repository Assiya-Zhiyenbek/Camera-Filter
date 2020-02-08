package com.example.camera;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Bundle;
import android.widget.ImageView;

public class Filter extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        imageView = findViewById(R.id.image);

        Bitmap bitmap = BitmapFactory.decodeFile(getIntent().getStringExtra("image_path"));
        ColorMatrix matrix = new ColorMatrix();
        matrix.setSaturation(0);
        imageView.setImageBitmap(bitmap);
        imageView.setColorFilter(new ColorMatrixColorFilter(matrix));
    }
}
