package com.awesomesoft.mygame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by christopher.ermis on 3/1/2017.
 */

public class MainActivity extends AppCompatActivity{
private GameView myGameView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        myGameView = new GameView(this);
        setContentView(myGameView);
    }
    @Override
    protected void onPause(){
        super.onPause();
        // The following call pauses the rendering thread.
        // If your OpenGL application os memory intensive,
        // you should consider de-allocating objects that
        // consume significant memory here.
        myGameView.onPause();
    }
    @Override
    protected void onResume(){
        super.onResume();
        // The following call resumes a paused rendering thread.
        // If you de-allocated graphic objects for onPause()
        // this is a good place to reallocate them.
        myGameView.onResume();
    }
}
