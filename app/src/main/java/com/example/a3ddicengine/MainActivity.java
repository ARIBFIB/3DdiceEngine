package com.example.a3ddicengine;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.a3ddicengine.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private MyGLSurfaceView glSurfaceView;

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setContentView(R.layout.activity_main);

        // Find the custom view by its ID
        glSurfaceView = findViewById(R.id.myGLSurfaceView);
    }

        @Override
        protected void onPause() {
        super.onPause();
        glSurfaceView.onPause();
    }

        @Override
        protected void onResume() {
        super.onResume();
        glSurfaceView.onResume();
    }



}
