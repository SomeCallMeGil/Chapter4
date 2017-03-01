package com.awesomesoft.mygame;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by christopher.ermis on 3/1/2017.
 */

public class GameView extends GLSurfaceView {
    private final GameRenderer gameRenderer;

    public GameView(Context context){
        super(context);

        setEGLContextClientVersion(2);

        gameRenderer = new GameRenderer(context);

        setRenderer(gameRenderer);
    }
}
