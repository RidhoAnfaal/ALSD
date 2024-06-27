package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<Object, List<Object>> adjacencyList;
    private boolean isDirected;

    public Graph(boolean isDirected) {
        this.adjacencyList = new HashMap<>();
        this.isDirected = isDirected;
    }

    public boolean graphType() {
        return isDirected;
    }

    public void addVertex(Object vertex) {
        adjacencyList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(Object source, Object destination) {
        addVertex(source);
        addVertex(destination);
        adjacencyList.get(source).add(destination);
        if (!isDirected) {
            adjacencyList.get(destination).add(source);
        }
    }

    public List<Object> getNeighbors(Object vertex) {
        return adjacencyList.getOrDefault(vertex, new ArrayList<>());
    }

    public void removeEdge(Object source, Object destination) {
        if (adjacencyList.containsKey(source) && adjacencyList.get(source).contains(destination)) {
            adjacencyList.get(source).remove(destination);
        }
        if (!isDirected && adjacencyList.containsKey(destination) && adjacencyList.get(destination).contains(source)) {
            adjacencyList.get(destination).remove(source);
        }
    }

    public List<Object> findPath(Object source, Object destination) {
        List<Object> visited = new ArrayList<>();
        List<Object> path = new ArrayList<>();
        return findPathHelper(source, destination, visited, path);
    }

    private List<Object> findPathHelper(Object source, Object destination, List<Object> visited, List<Object> path) {
        visited.add(source);
        path.add(source);
        if (source.equals(destination)) {
            return path;
        }
        List<Object> neighbors = getNeighbors(source);
        for (Object neighbor : neighbors) {
            if (!visited.contains(neighbor)) {
                List<Object> newPath = findPathHelper(neighbor, destination, visited, new ArrayList<>(path));
                if (!newPath.isEmpty()) {
                    return newPath;
                }
            }
        }
        return new ArrayList<>(); // Path not found
    }

    public static void main(String[] args) {
        // Example usage for directed graph
        Graph directedGraph = new Graph(true);
        directedGraph.addVertex("Malang");
        directedGraph.addVertex("Surabaya");
        directedGraph.addVertex("Gresik");
        directedGraph.addVertex("Bandung");
        directedGraph.addEdge("Malang", "Surabaya");
        directedGraph.addEdge("Surabaya", "Gresik");
        directedGraph.addEdge("Gresik", "Bandung");
        System.out
                .println("Directed graph path from Malang to Bandung: " + directedGraph.findPath("Malang", "Bandung"));

        // Example usage for undirected graph
        Graph undirectedGraph = new Graph(false);
        undirectedGraph.addVertex(0);
        undirectedGraph.addVertex(1);
        undirectedGraph.addVertex(2);
        undirectedGraph.addVertex(3);
        undirectedGraph.addEdge(0, 1);
        undirectedGraph.addEdge(1, 2);
        undirectedGraph.addEdge(2, 3);
        System.out.println("Undirected graph path from 0 to 3: " + undirectedGraph.findPath(0, 3));
    }
}