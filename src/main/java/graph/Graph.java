package graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private int vertices;
    private List<List<Integer>> neighbors;

    public Graph(int vertices) {
        neighbors = new ArrayList<>(vertices);
        this.vertices = vertices;

        for (int i = 0; i < vertices; i++) {
            neighbors.add(i, new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        this.neighbors.get(source).add(destination);
    }

    public List<Integer> getNeighbors(int source) {
        return neighbors.get(source);
    }

    public static void printDFS(Graph g) {
        boolean[] visited = new boolean[g.vertices];

        for (int i = 0; i < g.vertices; i++) {
            recursiveDFS(g, i, visited);
        }
    }

    private static void recursiveDFS(Graph g, int node, boolean[] visited) {
        if (visited[node]) {
            return;
        }

        visited[node] = true;
        System.out.print(node + " -> ");
        List<Integer> neighbors =  g.neighbors.get(node);

        for (int neighbor : neighbors) {
            recursiveDFS(g, neighbor, visited);
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting...");
        Graph g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(3, 5);
        g.addEdge(3, 4);
        printDFS(g);
    }
}
