package com.example.victoria.historyquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IniciarJuego extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_juego);
    }

    //Boton de salir
    public void salir(View v) {
        finish();
    }
}
