package com.awesomesoft.mygame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.InputStream;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/**
 * Created by christopher.ermis on 3/1/2017.
 */

public class Starfield {

    static float squareCoords[] = {
            -1f, 1f, 0.0f,   // top left
            -1f, -1f, 0.0f,   // bottom left
            1f, -1f, 0.0f,   // bottom right
            1f, 1f, 0.0f}; // top right

    private final short drawOrder[] = {0, 1, 2, 0, 2, 3};


    private final String vertexShaderCode =
            "uniform mat4 uMVPMatrix;" +
                    "attribute vec4 vPosition;" +
                    "attribute vec2 TexCoordIn;" +
                    "varying vec2 TexCoordOut;" +
                    "void main() {" +
                    "  gl_Position = uMVPMatrix * vPosition;" +
                    "  TexCoordOut = TexCoordIn;" +
                    "}";

    private final String fragmentShaderCode =
            "precision mediump float;" +
                    "uniform vec4 vColor;" +
                    "uniform sampler2D TexCoordIn;" +
                    "uniform float scroll;" +
                    "varying vec2 TexCoordOut;" +
                    "void main() {" +
                    " gl_FragColor = texture2D(TexCoordIn, vec2(TexCoordOut.x ,TexCoordOut.y + scroll));" +
                    "}";
    private float texture[] = {
            -1f, 1f,
            -1f, -1f,
            1f, -1f,
            1f, 1f,
    };


    private final FloatBuffer vertexBuffer;
    private final ShortBuffer drawListBuffer;
    private final int mProgram;
    private int mPositionHandle;
    private int mColorHandle;
    private int mMVPMatrixHandle;

    static final int COORDS_PER_VERTEX = 3;
    private final int vertexStride = COORDS_PER_VERTEX * 4;



}