package com.example;
import java.util.*;

public class Grafo {
	private Map<String, List<Aresta>> adjacencia;
	
	public Grafo() {
		this.adjacencia = new HashMap<>();
	}
	
	public void adicionarAresta(String origem, String destino, int peso) {
		this.adjacencia.computeIfAbsent(origem, k -> new ArrayList<>()).add(new Aresta(destino, peso));
		this.adjacencia.computeIfAbsent(destino, k -> new ArrayList<>());
	}
	
	public List<Aresta> getAdjacentes(String vertice) {
		return this.adjacencia.getOrDefault(vertice, new ArrayList<>());
	}
	
	public Set<String> getVertices() {
		return this.adjacencia.keySet();
	}

}
