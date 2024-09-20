package com.example;

public class Aresta {
	private String destino;
	private int peso;
	
	public Aresta(String destino, int peso) {
		this.destino = destino;
		this.peso = peso;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public int getPeso() {
		return peso;
	}
}
