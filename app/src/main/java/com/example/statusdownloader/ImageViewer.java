package com.example.statusdownloader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class ImageViewer extends AppCompatActivity {

    ImageView imageViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_viewer);
        imageViewer = (ImageView) findViewById(R.id.imageview);
        Intent intent = getIntent();
        String pathvideo=intent.getExtras().getString("url");
        Uri imguri = Uri.parse(pathvideo);
        imageViewer.setImageURI(null);
        imageViewer.setImageURI(imguri);

    }
}