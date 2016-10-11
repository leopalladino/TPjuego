package com.example.a41586514.myapplication;

import android.util.Log;

import org.cocos2d.nodes.Director;
import org.cocos2d.nodes.Scene;
import org.cocos2d.opengl.CCGLSurfaceView;

/**
 * Created by 41586514 on 11/10/2016.
 */
public class clsJuego {
    CCGLSurfaceView VistaDelJuego;
    public clsJuego(CCGLSurfaceView VistaDelJuego) {
        Log.d("Bob", "Comienza el constructor de la clase");
        VistaDelJuego=VistaDelJuego;
    }

    public void ComenzarJuego() {
        Log.d("Comenzar", "Comenzar juego");
        Director.sharedDirector().attachInView(VistaDelJuego);
    }
    private Scene EscenaDelJuego () {
        Log.d("Escena del juego", "Comienza armado de la escena del juego");

        Log.d("Escena del juego", "Declaro la instancia de la escena en si");
        Scene EscenaADevolver;
        EscenaADevolver = Scene.node();
    }

}
