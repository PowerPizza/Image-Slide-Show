package com.example.imageslideshow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int [] images = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img6, R.drawable.img7};
    ImageView viewer;
    int indexer = 0;

    public void onClickNext(View view){
        if (indexer == images.length-1){
            Toast t1 = Toast.makeText(getApplicationContext(),  "Its end!", Toast.LENGTH_LONG);
            t1.show();
        }
        else {
            indexer += 1;
        }
        viewer.setBackgroundResource(images[indexer]);
    }

    public void onClickBack(View view){
        if (indexer == 0){
            Toast t1 = Toast.makeText(getApplicationContext(),  "Its end!", Toast.LENGTH_LONG);
            t1.show();
        }
        else {
            indexer -= 1;
        }
        viewer.setBackgroundResource(images[indexer]);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewer = findViewById(R.id.Img_Viewer);
    }
}