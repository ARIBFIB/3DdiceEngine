package com.example.a3ddicengine.GLSurfaceView;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class MyGLRenderer implements GLSurfaceView.Renderer {
    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        // Perform OpenGL ES initialization
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f); // Set clear color to black
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        // Adjust the viewport and projection matrix
        GLES20.glViewport(0, 0, width, height);
        // Update projection matrix or other configurations
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        // Clear the screen and perform rendering operations
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
        // Render your 3D models
    }
}