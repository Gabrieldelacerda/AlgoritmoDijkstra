package com.example;
import java.util.*;

public class Dijkstra {
	public Map<String, Integer> calcularDistancias(Grafo grafo, String origem) {
		Map<String, Integer> distancias = new HashMap<>();
		PriorityQueue<No> filaPrioridade = new PriorityQueue<>(Comparator.comparingInt(No::getDistancia));
		Set<String> visitados = new HashSet<>();
		
		for (String vertice : grafo.getVertices()) {
			distancias.put(vertice, Integer.MAX_VALUE);
		}
		distancias.put(origem, 0);
		filaPrioridade.add(new No(origem, 0));
		
		while (!filaPrioridade.isEmpty()) {
			No atual = filaPrioridade.poll();
			String verticeAtual = atual.getNome();
			
			if (visitados.contains(verticeAtual)) {
				continue;
			}
			visitados.add(verticeAtual);
			
			for (Aresta aresta : grafo.getAdjacentes(verticeAtual)) {
				String vizinho = aresta.getDestino();
				int novaDistancia = distancias.get(verticeAtual) + aresta.getPeso();
				
				if (novaDistancia < distancias.get(vizinho)) {
					distancias.put(vizinho, novaDistancia);
					filaPrioridade.add(new No(vizinho, novaDistancia));
				}
			}
		}
		
		return distancias;
	}
}
