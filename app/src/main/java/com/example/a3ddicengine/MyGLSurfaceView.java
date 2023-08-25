package com.example.a3ddicengine;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

public class MyGLSurfaceView extends GLSurfaceView {
    public MyGLSurfaceView(Context context) {
        super(context);
        init();
    }

    public MyGLSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        // Set OpenGL ES version and renderer
        setEGLContextClientVersion(2); // Use OpenGL ES 2.0
        setRenderer(new MyGLRenderer());
    }
}
