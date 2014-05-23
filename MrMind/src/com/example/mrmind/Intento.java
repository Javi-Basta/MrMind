package com.example.mrmind;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Intento extends LinearLayout {
	
	private TextView numeroIntento;
	private TextView letra1;
	private TextView letra2;
	private TextView letra3;
	private TextView letra4;
	private TextView letra5;
	private TextView puntuacion;

	public Intento(Context context) {
		super(context);
		inicializar();
	}
	
	public Intento(Context context, AttributeSet attrs) {
	    super(context, attrs);
	    inicializar();
	}
	
	private void inicializar() {
		
	    //Utilizamos el layout 'layout_intento' como interfaz del control
	    String infService = Context.LAYOUT_INFLATER_SERVICE;
	    LayoutInflater li =
	        (LayoutInflater)getContext().getSystemService(infService);
	    li.inflate(R.layout.layout_intento, this, true);
	 
	    //Obtenemoslas referencias a los distintos control
	    this.numeroIntento = (TextView)findViewById(R.id.numeroIntento);
	    this.letra1 = (TextView)findViewById(R.id.intentoLetra1);
	    this.letra2 = (TextView)findViewById(R.id.intentoLetra2);
	    this.letra3 = (TextView)findViewById(R.id.intentoLetra3);
	    this.letra4 = (TextView)findViewById(R.id.intentoLetra4);
	    this.letra5 = (TextView)findViewById(R.id.intentoLetra5);
	    this.puntuacion = (TextView)findViewById(R.id.puntuacionIntento);
	 
	    //Asociamos los eventos necesarios
	    //asignarEventos();
		
	}

	public TextView getNumeroIntento() {
		return numeroIntento;
	}

	public void setNumeroIntento(String num) {
		this.numeroIntento.setText(num);
	}
	
	public TextView getLetra1() {
		return letra1;
	}

	public void setLetra1(String letra) {
		this.letra1.setText(letra);
	}

	public TextView getLetra2() {
		return letra2;
	}

	public void setLetra2(String letra) {
		this.letra2.setText(letra);
	}

	public TextView getLetra3() {
		return letra3;
	}

	public void setLetra3(String letra) {
		this.letra3.setText(letra);
	}

	public TextView getLetra4() {
		return letra4;
	}

	public void setLetra4(String letra) {
		this.letra4.setText(letra);
	}
	public TextView getLetra5() {
		return letra5;
	}

	public void setLetra5(String letra) {
		this.letra5.setText(letra);
	}

	public TextView getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(String puntuacion) {
		this.puntuacion.setText(puntuacion);
	}
	
	
	

}