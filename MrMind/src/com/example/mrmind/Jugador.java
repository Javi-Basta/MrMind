package com.example.mrmind;

public class Jugador {

	private String nombreJugador;
	private String contrasena;
	private int puntuacion;
	
	public Jugador(String nombreJugador, String contrasena, int puntuacion) {
		super();
		this.nombreJugador = nombreJugador;
		this.contrasena = contrasena;
		this.puntuacion = puntuacion;
	}
	
	public String getNombreJugador() {
		return nombreJugador;
	}
	
	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public int getPuntuacion() {
		return puntuacion;
	}
	
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	
}
