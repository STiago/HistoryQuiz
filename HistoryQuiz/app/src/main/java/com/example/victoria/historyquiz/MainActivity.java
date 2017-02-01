package com.example.victoria.historyquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Enlazar con ventana de Juego
    public void iniciarJuego(View view){
        Intent i = new Intent(this,IniciarJuego.class);
        startActivity(i);
    }

    //Enlazar con ventana de Resultados y Estadisticas
    public void resultadosEstadisticas(View view1){
        Intent j = new Intent(this, ResultadosEstadisticas.class);
        startActivity(j);
    }

}
