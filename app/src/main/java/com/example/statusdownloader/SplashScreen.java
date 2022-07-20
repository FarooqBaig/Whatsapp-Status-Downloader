package com.example.statusdownloader;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;

public class SplashScreen extends AppCompatActivity {
    private File storage;
    private String[] storagePaths;

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        //load data here
        storagePaths = StorageUtil.getStorageDirectories(this);

        for (String path : storagePaths) {
            Toast.makeText(this,"It may take a while to load data", Toast.LENGTH_LONG).show();
            storage = new File(path);
            Method.load_Directory_Files(storage);
        }

        Intent intent = new Intent(SplashScreen.this, MainActivity.class);
        startActivity(intent);
    }
}
