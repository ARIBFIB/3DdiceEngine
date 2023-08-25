package com.example.a3ddicengine;

import android.opengl.EGLConfig;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.opengles.GL10;


public class MyGLRenderer implements GLSurfaceView.Renderer {

    public void onSurfaceCreated(GL10 gl, EGLConfig config){




        ///.......... coding performing OpenGl es initilatization , such as enabling feat users

        //loading textures and shadows

    }

    @Override
    public void onSurfaceCreated(GL10 gl, javax.microedition.khronos.egl.EGLConfig config) {

    }


    public void onSurfaceChanged(GL10 gl, int width , int height){
        // .... code on the viewport and projection matrix based on the new surface size



        ////.............coding
    }


    public void onDrawFrame(GL10 gl){

        //clear the screen and setup the model-view-projection matrix

        //Issue draw calls to render your 3D model

    }
}
