package com.example;

public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        
        grafo.adicionarAresta("A", "B", 4);
        grafo.adicionarAresta("A", "C", 2);
        grafo.adicionarAresta("B", "C", 5);
        grafo.adicionarAresta("B", "D", 10);
        grafo.adicionarAresta("C", "E", 3);
        grafo.adicionarAresta("E", "D", 4);
        
        Dijkstra dijkstra = new Dijkstra();
        Map<String, Integer> distancias = dijkstra.calcularDistancias(grafo, "A");

        for (Map.Entry<String, Integer> entry : distancias.entrySet()) {
            System.out.println("Distância de A até " + entry.getKey() + ": " + entry.getValue());
        }
    }
}