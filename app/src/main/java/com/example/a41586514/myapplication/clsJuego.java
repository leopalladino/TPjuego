package com.example.a41586514.myapplication;

import android.media.MediaCodecInfo;
import android.util.Log;

import org.cocos2d.layers.Layer;
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
        VistaDelJuego = VistaDelJuego;
    }

    public void ComenzarJuego() {
        Log.d("Comenzar", "Comenzar juego");
        Director.sharedDirector().attachInView(VistaDelJuego);
    }

    private Scene EscenaDelJuego() {
        Log.d("Escena del juego", "Comienza armado de la escena del juego");

        Log.d("Escena del juego", "Declaro la instancia de la escena en si");
        Scene EscenaADevolver;
        EscenaADevolver = Scene.node();

        Log.d("Escena del juego", "Declaro e instancio la capa que va a contener la imagen de fondo");
        CapaDeFondo MiCapaDeFondo;
        MiCapaDeFondo = new CapaDeFondo();

        Log.d("Escena Del Juego", "Declaro e instancio la capa que va a contener el jugador y los enemigos");
        CapaDelFrente MiCapaDelFrente;
        MiCapaDelFrente = new CapaDelFrente();

        Log.d("Escena del juego", "Agrego a la escena la capa del fondo mas atras y la capa del frente mas adelante");
        EscenaADevolver.addChild(MiCapaDeFondo, -10);
        EscenaADevolver.addChild(MiCapaDelFrente, 10);
    }

    class CapaDeFondo extends Layer {
    }
    class CapaDelFrente extends Layer {

    }

}
