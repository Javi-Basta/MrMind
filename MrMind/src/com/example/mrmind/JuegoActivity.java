package com.example.mrmind;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class JuegoActivity extends Activity {
	
	private int puntosPartida;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_juego);
		RelativeLayout relativelayout01 = (RelativeLayout) findViewById(R.id.botonEnviar);
		relativelayout01.setBackgroundColor(Color.CYAN);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.juego, menu);
		return true;
	}
	
	public void partidaUnJugador(Jugador jugador1){
		//Login jugador 1
		//Extraer palabra de BBDD
		puntosPartida = 120;
		Button botonEnviar2 = (Button)findViewById(R.id.botonEnviar2);
		botonEnviar2.setVisibility(View.INVISIBLE);
		TextView textoJugador2 = (TextView)findViewById(R.id.textoJugador2);
		textoJugador2.setVisibility(View.INVISIBLE);
	}

}
