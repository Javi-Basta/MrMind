package com.example.mrmind;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class JuegoActivity extends Activity {
	
	private int puntosPartida;
	
	private Button botonEnviarJugador1;
	private TextView textoJugador1;
	
	private EditText letra1Arriba;
	private EditText letra2Arriba;
	private EditText letra3Arriba;
	private EditText letra4Arriba;
	private EditText letra5Arriba;
	
	private Button botonEnviarJugador2;
	private TextView textoJugador2;
	
	private EditText letra1Abajo;
	private EditText letra2Abajo;
	private EditText letra3Abajo;
	private EditText letra4Abajo;
	private EditText letra5Abajo;
	
	private String palabraMisteriosa;
	private String palabraIntento;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_juego);
		RelativeLayout relativelayout01 = (RelativeLayout) findViewById(R.id.botonEnviar);
		relativelayout01.setBackgroundColor(Color.CYAN);
		
		this.botonEnviarJugador1 = (Button)findViewById(R.id.botonEnviar1);
		this.textoJugador1 = (TextView)findViewById(R.id.textoJugador1);
		
		this.letra1Arriba = (EditText) findViewById(R.id.letraArriba1);
		this.letra2Arriba = (EditText) findViewById(R.id.letraArriba2);
		this.letra3Arriba = (EditText) findViewById(R.id.letraArriba3);
		this.letra4Arriba = (EditText) findViewById(R.id.letraArriba4);
		this.letra5Arriba = (EditText) findViewById(R.id.letraArriba5);
		
		this.botonEnviarJugador2 = (Button)findViewById(R.id.botonEnviar2);
		this.textoJugador2 = (TextView)findViewById(R.id.textoJugador2);
		
		this.letra1Abajo = (EditText) findViewById(R.id.letraAbajo1);
		this.letra2Abajo = (EditText) findViewById(R.id.letraAbajo2);
		this.letra3Abajo = (EditText) findViewById(R.id.letraAbajo3);
		this.letra4Abajo = (EditText) findViewById(R.id.letraAbajo4);
		this.letra5Abajo = (EditText) findViewById(R.id.letraAbajo5);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.juego, menu);
		return true;
	}
	
	public void partidaUnJugador(Jugador jugador1){
		//Login jugador 1
		//Extraer palabra al azar de BBDD
		
		this.puntosPartida = 120;
		
		this.botonEnviarJugador2.setVisibility(View.INVISIBLE);
		this.textoJugador2.setVisibility(View.INVISIBLE);
	}
	
	public void partidaDosJugadores(Jugador jugador1, Jugador jugador2){
		
		//Login jugador 1
		
		//Login jugador 2
		
		this.puntosPartida = 120;
		
	}
	
	public void enviarPalabraMisteriosa (View view) {
		
		if(this.letra1Arriba.getText().toString().isEmpty() || this.letra2Arriba.getText().toString().isEmpty() ||
			this.letra3Arriba.getText().toString().isEmpty() ||this.letra4Arriba.getText().toString().isEmpty() ||
			this.letra5Arriba.getText().toString().isEmpty()) {
			
			//Mostrar mensaje de error
			
			 AlertDialog alerta= new AlertDialog.Builder(this).create(); //Aqui me marca el siguiente error The constructor AlertDialog.Builder(new View.OnClickListener(){}) is undefined

		        alerta.setTitle("Error");

		        alerta.setMessage("La palabra tiene que tener 5 letras!!");

		        alerta.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
					
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				});
		        
		        alerta.show();
			
		} else {
			
			//Guardar la palabra misteriosa en string
			this.palabraMisteriosa = this.letra1Arriba.getText().toString() + this.letra2Arriba.getText().toString() +
					this.letra3Arriba.getText().toString() + this.letra4Arriba.getText().toString() +
					this.letra5Arriba.getText().toString();
			
			// Mensaje de que todo ha ido bien??
			
		}
		
	}
	
	
	public void enviarPalabraIntento (View view) {
			
			if(this.letra1Abajo.getText().toString().isEmpty() || this.letra2Abajo.getText().toString().isEmpty() ||
				this.letra3Abajo.getText().toString().isEmpty() ||this.letra4Abajo.getText().toString().isEmpty() ||
				this.letra5Abajo.getText().toString().isEmpty()) {
				
				//Mostrar mensaje de error
				
				 AlertDialog alerta= new AlertDialog.Builder(this).create(); //Aqui me marca el siguiente error The constructor AlertDialog.Builder(new View.OnClickListener(){}) is undefined
	
			        alerta.setTitle("Error");
	
			        alerta.setMessage("La palabra tiene que tener 5 letras!!");
	
			        alerta.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
						
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							
						}
					});
			        
			        alerta.show();
				
			} else {
				
				//Guardar la palabra del intento en string
				this.palabraIntento = this.letra1Abajo.getText().toString() + this.letra2Abajo.getText().toString() +
						this.letra3Abajo.getText().toString() + this.letra4Abajo.getText().toString() +
						this.letra5Abajo.getText().toString();
				
				Intento intento = new Intento(this);
				
				intento.setLetra1(this.letra1Abajo.getText().toString());
				intento.setLetra2(this.letra2Abajo.getText().toString());
				intento.setLetra3(this.letra3Abajo.getText().toString());
				intento.setLetra4(this.letra4Abajo.getText().toString());
				intento.setLetra5(this.letra5Abajo.getText().toString());
				
				for (int i=12; i > 0; i--) {
					
					int puntuacionIntento = 0;
					
					intento.setNumeroIntento(Integer.toString(i));
					
					//Comprobamos letra por letra respecto a las letras de la palabra misteriosa
					for (int j=0; j < 5; j++) { //recorrer letras del intento
						for (int k=0; k < 5; k++) { //recorrer letras de la palabra misteriosa
							
							if(this.palabraIntento.charAt(j) == this.palabraMisteriosa.charAt(k)) {
								
								if (j == k) { //Las letras coinciden en la misma posicion (color verde y 2 ptos)
									
									puntuacionIntento += 2;
									
									switch (j) { //Cambiamos el color a verde
										
										case 0:
											intento.getLetra1().setBackgroundColor(Color.GREEN);
											break;
											
										case 1:
											intento.getLetra2().setBackgroundColor(Color.GREEN);
											break;
											
										case 2:
											intento.getLetra3().setBackgroundColor(Color.GREEN);
											break;
											
										case 3:
											intento.getLetra4().setBackgroundColor(Color.GREEN);
											break;
										
										case 4:
											intento.getLetra5().setBackgroundColor(Color.GREEN);
											break;
									
									} //switch
									
								} else {//Las letras coinciden en distinta posicion (color amarillo y 1 pto)
									
									puntuacionIntento += 1;
									
									switch (j) { //Cambiamos el color a amarillo
										
										case 0:
											intento.getLetra1().setBackgroundColor(Color.YELLOW);
											break;
											
										case 1:
											intento.getLetra2().setBackgroundColor(Color.YELLOW);
											break;
											
										case 2:
											intento.getLetra3().setBackgroundColor(Color.YELLOW);
											break;
											
										case 3:
											intento.getLetra4().setBackgroundColor(Color.YELLOW);
											break;
										
										case 4:
											intento.getLetra5().setBackgroundColor(Color.YELLOW);
											break;
									
									} //switch
									
								}//else
								
							} //if coinciden
							
						} //for k
					}//for j
					
					intento.setPuntuacion(Integer.toString(puntuacionIntento));
					
					if(this.palabraIntento.equals(this.palabraMisteriosa)) {
						
						
						//añadir intento a listview
						break;
						
					}
					
				} //for 12 intentos
				
//				if (i != 0) { //el jugador ha ganado
//					
//					
//				}
				
				
			}
			
		}
	

}
