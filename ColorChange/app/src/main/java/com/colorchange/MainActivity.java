package com.colorchange;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.action_image);

    }

    public void redClick(View v) {
        imageView.setColorFilter(Color.RED);
    }

    public void greenClick(View v) {
        imageView.setColorFilter(Color.GREEN);
    }

    public void yellowClick(View v) {
        imageView.setColorFilter(Color.YELLOW);
    }
}
